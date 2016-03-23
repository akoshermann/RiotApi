package hu.hermann.akos.riotapi.domain.matchhistory;

import java.io.Serializable;

/**
 * Created by a.hermann on 2016.03.23..
 */
public class Ban implements Serializable {

    private int pickTurn;
    private Long championId;

    public int getPickTurn() {
        return pickTurn;
    }

    public void setPickTurn(int pickTurn) {
        this.pickTurn = pickTurn;
    }

    public Long getChampionId() {
        return championId;
    }

    public void setChampionId(Long championId) {
        this.championId = championId;
    }
}
