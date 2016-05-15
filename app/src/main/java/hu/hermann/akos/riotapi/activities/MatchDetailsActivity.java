package hu.hermann.akos.riotapi.activities;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import butterknife.Bind;
import butterknife.ButterKnife;
import hu.hermann.akos.riotapi.R;
import hu.hermann.akos.riotapi.contstants.Flags;
import hu.hermann.akos.riotapi.domain.Champion;
import hu.hermann.akos.riotapi.domain.ChampionDetails;
import hu.hermann.akos.riotapi.domain.matchhistory.MatchDetails;
import hu.hermann.akos.riotapi.domain.matchhistory.Participant;
import hu.hermann.akos.riotapi.domain.player.Summoner;
import hu.hermann.akos.riotapi.interfaces.IImageLoader;
import hu.hermann.akos.riotapi.rest.RiotClient;
import hu.hermann.akos.riotapi.rest.ServiceGenerator;
import hu.hermann.akos.riotapi.utils.ImageLoader;
import hu.hermann.akos.riotapi.utils.MatchDetailsPlayerAdapter;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MatchDetailsActivity extends AppCompatActivity implements IImageLoader{
    @Bind(R.id.teams)
    RecyclerView teams;

    private MatchDetails matchDetails;
    private List<Summoner> summonerList;
    private Set<Long> championIds;
    private Set<ChampionDetails> championDetailsSet;
    private Set<Champion> championSet;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_details);
        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        if(getIntent().hasExtra(Flags.MATCH_DETAILS)){
            getMatchDetails(getIntent().getLongExtra(Flags.MATCH_DETAILS, 1l));
        }


    }

    private void getMatchDetails(Long matchId) {
        RiotClient client = ServiceGenerator.createService(RiotClient.class);
        Call<MatchDetails> matchDetailsCall = client.getMatchDetails("eune", matchId);
        matchDetailsCall.enqueue(new Callback<MatchDetails>() {
            @Override
            public void onResponse(Call<MatchDetails> call, Response<MatchDetails> response) {
                matchDetails = response.body();
                getChampions();
            }

            @Override
            public void onFailure(Call<MatchDetails> call, Throwable t) {
                t.printStackTrace();
                Toast.makeText(MatchDetailsActivity.this, "error", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void getChampions(){
        championIds = new HashSet<>();
        for(Participant participant : matchDetails.getParticipants()){
            championIds.add(participant.getChampionId());
        }
        getChampionDetails();
    }

    private void getChampionDetails(){
        championSet = new HashSet<>();
        for(Long id : championIds){
            RiotClient riotClient = ServiceGenerator.createService(RiotClient.class);
            Call<Champion> championDetailsCall = riotClient.getChampionInfo("eune", id);
            championDetailsCall.enqueue(new Callback<Champion>() {
                @Override
                public void onResponse(Call<Champion> call, Response<Champion> response) {
                    counter++;
                    championSet.add(response.body());
                    if(counter == championIds.size()){
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
        championDetailsSet = new HashSet<>();
        counter = 0;
        for(Champion champion : championSet){
            ImageLoader imageLoader = new ImageLoader(champion, MatchDetailsActivity.this);
            imageLoader.execute((Void) null);
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
            showHistory();
        }
    }

    private void showHistory() {
        MatchDetailsPlayerAdapter adapter = new MatchDetailsPlayerAdapter(matchDetails, championDetailsSet);
        teams.setLayoutManager(new LinearLayoutManager(MatchDetailsActivity.this));
        teams.setAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home :{
                this.finish();
                return true;
            }
            default: return super.onOptionsItemSelected(item);
        }
    }
}
