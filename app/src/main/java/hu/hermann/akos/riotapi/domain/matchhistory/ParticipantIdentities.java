package hu.hermann.akos.riotapi.domain.matchhistory;

import java.io.Serializable;

/**
 * Created by a.hermann on 2016.03.23..
 */
public class ParticipantIdentities implements Serializable {

    private Identity player;
    private Long participantId;

    public Identity getPlayer() {
        return player;
    }

    public void setPlayer(Identity player) {
        this.player = player;
    }

    public Long getParticipantId() {
        return participantId;
    }

    public void setParticipantId(Long participantId) {
        this.participantId = participantId;
    }
}
