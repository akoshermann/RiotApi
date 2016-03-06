package hu.hermann.akos.riotapi.rest;


import com.google.gson.JsonElement;

import java.util.List;

import hu.hermann.akos.riotapi.domain.Summoner;
import hu.hermann.akos.riotapi.domain.response.FeaturedGames;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by hofee on 2016. 03. 02..
 */
public interface RiotClient {

    public static final String API_KEY = "api_key=b3b0704d-94b0-4baf-bfda-6ea0c76af418";

    @GET("/api/lol/{region}/v1.4/summoner/by-name/{summoner}?"+API_KEY)
    Call<JsonElement> getSummoner(@Path("region") String region, @Path("summoner") String summoner);

    @GET("/observer-mode/rest/featured?"+API_KEY)
    Call<FeaturedGames> getFeaturedGames();
}
