package hu.hermann.akos.riotapi.domain.response;

import java.io.Serializable;
import java.util.List;

import hu.hermann.akos.riotapi.domain.Game;

/**
 * Created by hofee on 2016. 03. 03..
 */
public class FeaturedGames implements Serializable {

    private Long clientRefreshInterval;
    private List<Game> gameList;

    public Long getClientRefreshInterval() {
        return clientRefreshInterval;
    }

    public void setClientRefreshInterval(Long clientRefreshInterval) {
        this.clientRefreshInterval = clientRefreshInterval;
    }

    public List<Game> getGameList() {
        return gameList;
    }

    public void setGameList(List<Game> gameList) {
        this.gameList = gameList;
    }
}
