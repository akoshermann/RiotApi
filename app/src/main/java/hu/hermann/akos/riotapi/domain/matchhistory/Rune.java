package hu.hermann.akos.riotapi.domain.matchhistory;

import java.io.Serializable;

/**
 * Created by a.hermann on 2016.03.23..
 */
public class Rune implements Serializable {

    private Long rank;
    private Long runeId;

    public Long getRank() {
        return rank;
    }

    public void setRank(Long rank) {
        this.rank = rank;
    }

    public Long getRuneId() {
        return runeId;
    }

    public void setRuneId(Long runeId) {
        this.runeId = runeId;
    }
}
