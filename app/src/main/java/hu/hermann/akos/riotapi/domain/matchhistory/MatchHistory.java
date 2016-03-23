package hu.hermann.akos.riotapi.domain.matchhistory;

import java.io.Serializable;
import java.util.List;

/**
 * Created by a.hermann on 2016.03.23..
 */
public class MatchHistory implements Serializable {

    List<Match> matches;

    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }
}
