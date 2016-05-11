package hu.hermann.akos.riotapi.activities;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import hu.hermann.akos.riotapi.R;
import hu.hermann.akos.riotapi.contstants.Flags;
import hu.hermann.akos.riotapi.domain.matchhistory.MatchDetails;
import hu.hermann.akos.riotapi.interfaces.IImageLoader;
import hu.hermann.akos.riotapi.rest.RiotClient;
import hu.hermann.akos.riotapi.rest.ServiceGenerator;
import hu.hermann.akos.riotapi.utils.ImageLoader;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MatchDetailsActivity extends AppCompatActivity implements IImageLoader{
    @Bind(R.id.imageView)
    ImageView imageView;

    private MatchDetails matchDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_details);
        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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
            }

            @Override
            public void onFailure(Call<MatchDetails> call, Throwable t) {
                t.printStackTrace();
                Toast.makeText(MatchDetailsActivity.this, "error", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void getImages() {
        ImageLoader imageLoader = new ImageLoader("http://ddragon.leagueoflegends.com/cdn/6.6.1/img/champion/Aatrox.png", this);
        imageLoader.execute((Void) null);
    }

    @Override
    public void setImage(Bitmap bitmap) {
        imageView.setImageBitmap(bitmap);
    }


}
