package hu.hermann.akos.riotapi.domain;

import java.io.Serializable;

/**
 * Created by hofee on 2016. 03. 03..
 */
public class BannedChampion implements Serializable {

    private Long championId;
    private int pickTurn;
    private Long teamId;

    public Long getChampionId() {
        return championId;
    }

    public void setChampionId(Long championId) {
        this.championId = championId;
    }

    public int getPickTurn() {
        return pickTurn;
    }

    public void setPickTurn(int pickTurn) {
        this.pickTurn = pickTurn;
    }

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }
}
