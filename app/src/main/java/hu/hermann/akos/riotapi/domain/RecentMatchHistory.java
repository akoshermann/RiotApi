package hu.hermann.akos.riotapi.domain;

import java.io.Serializable;
import java.util.List;

/**
 * Created by hofee on 2016. 05. 15..
 */
public class RecentMatchHistory implements Serializable {

    private List<RecentGame> games;

    public List<RecentGame> getGames() {
        return games;
    }

    public void setGames(List<RecentGame> games) {
        this.games = games;
    }
}
