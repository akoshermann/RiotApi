package hu.hermann.akos.riotapi.rest;


import com.google.gson.JsonElement;

import hu.hermann.akos.riotapi.domain.Champion;
import hu.hermann.akos.riotapi.domain.response.FeaturedGames;
import hu.hermann.akos.riotapi.domain.matchhistory.MatchHistory;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by hofee on 2016. 03. 02..
 */
public interface RiotClient {

    String API_KEY = "api_key=b3b0704d-94b0-4baf-bfda-6ea0c76af418";

    @GET("/api/lol/{region}/v1.4/summoner/by-name/{summoner}?"+API_KEY)
    Call<JsonElement> getSummoner(@Path("region") String region, @Path("summoner") String summoner);

    @GET("/api/lol/{region}/v2.5/league/by-summoner/{summonerIds}/entry?"+API_KEY)
    Call<JsonElement> getRankInfo(@Path("region") String region, @Path("summonerIds") String ids);

    @GET("/observer-mode/rest/featured?"+API_KEY)
    Call<FeaturedGames> getFeaturedGames();

    @GET("/api/lol/{region}/v2.2/matchlist/by-summoner/{summonerId}?"+API_KEY)
    Call<MatchHistory> getMatchHistory(@Path("region") String region, @Path("summonerId") Long summoner, @Query("beginIndex") int begin, @Query("endIndex") int end);

    @GET("/api/lol/static-data/{region}/v1.2/champion/{id}?"+API_KEY)
    Call<Champion> getChampionInfo(@Path("region") String region, @Path("id") Long championId);
}
