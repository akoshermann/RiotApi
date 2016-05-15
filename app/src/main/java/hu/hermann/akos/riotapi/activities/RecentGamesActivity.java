package hu.hermann.akos.riotapi.activities;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.google.gson.Gson;

import java.util.HashSet;
import java.util.Set;

import butterknife.Bind;
import butterknife.ButterKnife;
import hu.hermann.akos.riotapi.AppContext;
import hu.hermann.akos.riotapi.R;
import hu.hermann.akos.riotapi.contstants.Flags;
import hu.hermann.akos.riotapi.domain.Champion;
import hu.hermann.akos.riotapi.domain.ChampionDetails;
import hu.hermann.akos.riotapi.domain.FellowPlayer;
import hu.hermann.akos.riotapi.domain.Game;
import hu.hermann.akos.riotapi.domain.RecentGame;
import hu.hermann.akos.riotapi.domain.RecentMatchHistory;
import hu.hermann.akos.riotapi.domain.player.Summoner;
import hu.hermann.akos.riotapi.interfaces.IImageLoader;
import hu.hermann.akos.riotapi.rest.RiotClient;
import hu.hermann.akos.riotapi.rest.ServiceGenerator;
import hu.hermann.akos.riotapi.utils.ImageLoader;
import hu.hermann.akos.riotapi.utils.RecentGamesAdapter;
import hu.hermann.akos.riotapi.utils.RecyclerItemClickListener;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RecentGamesActivity extends AppCompatActivity implements IImageLoader {
    @Bind(R.id.recent_games_recycler_view)
    RecyclerView recentGames;
    private Summoner summoner;
    private RecentMatchHistory recentMatchHistory;
    private Set<Champion> championSet;
    private Set<Long> ids;
    private Set<ChampionDetails> championDetailsSet;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recent_games);
        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        summoner = new Gson().fromJson(AppContext.getInstance().getPreferences().getString(Flags.SUMMONER, ""), Summoner.class);
        getMatchHistory();
    }

    private void getMatchHistory() {
        RiotClient riotClient = ServiceGenerator.createService(RiotClient.class);
        Call<RecentMatchHistory> call = riotClient.getMatchHistory("eune", summoner.getId());
        call.enqueue(new Callback<RecentMatchHistory>() {
            @Override
            public void onResponse(Call<RecentMatchHistory> call, Response<RecentMatchHistory> response) {
                recentMatchHistory = response.body();
                getChampions();
            }

            @Override
            public void onFailure(Call<RecentMatchHistory> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }

    private void getChampions() {
        ids = new HashSet<>();
        RiotClient riotClient = ServiceGenerator.createService(RiotClient.class);
        for(RecentGame game : recentMatchHistory.getGames()){
            ids.add(game.getChampionId());
        }
        championSet = new HashSet<>();
        for(Long id : ids){
            Call<Champion> championCall = riotClient.getChampionInfo("eune", id);
            championCall.enqueue(new Callback<Champion>() {
                @Override
                public void onResponse(Call<Champion> call, Response<Champion> response) {
                    counter++;
                    Champion champion = response.body();
                    championSet.add(champion);
                    if(counter == ids.size()){
                        getChampionIcons();
                    }
                }

                @Override
                public void onFailure(Call<Champion> call, Throwable t) {

                }
            });
        }

    }

    private void getChampionIcons() {
        counter = 0;
        championDetailsSet = new HashSet<>();
        for(Champion champion : championSet){
            ImageLoader imageLoader = new ImageLoader(champion, this);
            imageLoader.execute((Void)null);
        }
    }

    @Override
    public void setImage(Bitmap bitmap) {

    }

    @Override
    public void setChampion(Champion champion, Bitmap bitmap) {
        counter++;
        ChampionDetails championDetails = new ChampionDetails();
        championDetails.setName(champion.getName());
        championDetails.setId(champion.getId());
        championDetails.setBitmap(bitmap);
        championDetailsSet.add(championDetails);
        if(counter == championSet.size()){
            addIconsToModel();
        }
    }

    private void addIconsToModel() {
        RecentGamesAdapter adapter = new RecentGamesAdapter(recentMatchHistory, championDetailsSet);
        recentGames.setLayoutManager(new LinearLayoutManager(RecentGamesActivity.this));
        recentGames.setAdapter(adapter);
        recentGames.addOnItemTouchListener(new RecyclerItemClickListener(RecentGamesActivity.this, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Intent intent = new Intent(RecentGamesActivity.this, MatchDetailsActivity.class);
                intent.putExtra(Flags.MATCH_DETAILS, recentMatchHistory.getGames().get(position).getGameId());
                startActivity(intent);
            }
        }));
    }
}
