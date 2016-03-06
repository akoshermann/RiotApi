package hu.hermann.akos.riotapi.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import hu.hermann.akos.riotapi.R;
import hu.hermann.akos.riotapi.domain.Summoner;
import hu.hermann.akos.riotapi.domain.response.FeaturedGames;
import hu.hermann.akos.riotapi.domain.response.RankInfo;
import hu.hermann.akos.riotapi.rest.RiotClient;
import hu.hermann.akos.riotapi.rest.ServiceGenerator;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private FeaturedGames featuredGames;
    private Summoner summoner;
    private RankInfo rankInfo;

    @Bind(R.id.tv_summoner_name)
    TextView tvName;

    @Bind(R.id.tv_rank)
    TextView tvRank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ButterKnife.bind(this);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        getSummoner();

        /*getFeaturedGames();

        recyclerView.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(llm);*/



    }

    private void showError() {
        //TODO
        Toast.makeText(this, "error", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        switch (id){
            case R.id.nav_profile:{
                startActivity(new Intent(MainActivity.this, ProfileActivity.class));
            }
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void getSummoner() {
        RiotClient client = ServiceGenerator.createService(RiotClient.class);
        Call<JsonElement> call = client.getSummoner("eune", "FTP hofeee");
        call.enqueue(new Callback<JsonElement>() {
            @Override
            public void onResponse(Call<JsonElement> call, Response<JsonElement> response) {
                String summonerJson = splitStringToUseful(response.body().toString());
                summoner = new Gson().fromJson(summonerJson, Summoner.class);
                getSummonerRank(summoner.getId());
            }

            @Override
            public void onFailure(Call<JsonElement> call, Throwable t) {

            }
        });

    }

    private void getSummonerRank(Long id) {
        RiotClient client = ServiceGenerator.createService(RiotClient.class);
        List<Long> ids = new ArrayList<>();
        ids.add(id);
        String stringIds = listToString(ids);
        Call<JsonElement> call = client.getRankInfo("eune", stringIds);
        call.enqueue(new Callback<JsonElement>() {
            @Override
            public void onResponse(Call<JsonElement> call, Response<JsonElement> response) {
                String string = splitStringToUseful(response.body().toString());
                rankInfo = new Gson().fromJson(string.substring(1, string.length()-1), RankInfo.class);
                showInfo();
            }

            @Override
            public void onFailure(Call<JsonElement> call, Throwable t) {
            }
        });
    }

    private String listToString(List<Long> ids) {
        String stringIds = "";
        for(Long id : ids){
            if(stringIds.isEmpty()){
                stringIds = String.valueOf(id);
            } else {
                stringIds = stringIds + ", " + String.valueOf(id);
            }
        }
        return stringIds;
    }

    private String splitStringToUseful(String jsonToSplit){
        String[] splits = jsonToSplit.split(":", 2);
        String useful = splits[1];
        return useful.substring(0, useful.length() - 1);
    }

    private void showInfo() {
        tvName.setText(summoner.getName());
        tvRank.setText(getRankString(0));
    }

    private String getRankString(int position) {
        return rankInfo.getTier() + " " + rankInfo.getEntries().get(position).getDivision();
    }
}