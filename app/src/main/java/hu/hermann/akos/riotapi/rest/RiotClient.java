package hu.hermann.akos.riotapi.rest;


import com.google.gson.JsonElement;

import hu.hermann.akos.riotapi.domain.Champion;
import hu.hermann.akos.riotapi.domain.RecentMatchHistory;
import hu.hermann.akos.riotapi.domain.matchhistory.MatchDetails;
import hu.hermann.akos.riotapi.domain.response.FeaturedGames;
import hu.hermann.akos.riotapi.domain.matchhistory.RankedMatchHistory;
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

    @GET("/api/lol/{region}/v1.4/summoner/{summonerIds}?"+API_KEY)
    Call<JsonElement> getSummonersById(@Path("region") String region, @Path("summonerIds") String summonerIds);

    @GET("/api/lol/{region}/v2.5/league/by-summoner/{summonerIds}/entry?"+API_KEY)
    Call<JsonElement> getRankInfo(@Path("region") String region, @Path("summonerIds") String ids);

    @GET("/observer-mode/rest/featured?"+API_KEY)
    Call<FeaturedGames> getFeaturedGames();

    @GET("/api/lol/{region}/v2.2/matchlist/by-summoner/{summonerId}?"+API_KEY)
    Call<RankedMatchHistory> getRankedMatchHistory(@Path("region") String region, @Path("summonerId") Long summoner, @Query("beginIndex") int begin, @Query("endIndex") int end);

    @GET("/api/lol/static-data/{region}/v1.2/champion/{id}?"+API_KEY)
    Call<Champion> getChampionInfo(@Path("region") String region, @Path("id") Long championId);

    @GET("/api/lol/{region}/v2.2/match/{matchId}?"+API_KEY)
    Call<MatchDetails> getMatchDetails(@Path("region") String region, @Path("matchId") Long matchId);

    @GET("/api/lol/{region}/v1.3/game/by-summoner/{summonerId}/recent?"+API_KEY)
    Call<RecentMatchHistory> getMatchHistory(@Path("region") String region, @Path("summonerId") Long summonerId);
}
