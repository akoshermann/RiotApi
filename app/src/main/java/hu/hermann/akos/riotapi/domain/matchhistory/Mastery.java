package hu.hermann.akos.riotapi.domain.matchhistory;

import java.io.Serializable;

/**
 * Created by a.hermann on 2016.03.23..
 */
public class Mastery implements Serializable {

    private int rank;
    private Long masteryId;

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public Long getMasteryId() {
        return masteryId;
    }

    public void setMasteryId(Long masteryId) {
        this.masteryId = masteryId;
    }
}
