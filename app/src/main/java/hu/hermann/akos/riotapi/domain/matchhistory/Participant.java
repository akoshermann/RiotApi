package hu.hermann.akos.riotapi.domain.matchhistory;

import java.io.Serializable;
import java.util.List;

import hu.hermann.akos.riotapi.domain.matchhistory.stats.Stats;
import hu.hermann.akos.riotapi.domain.matchhistory.stats.Timeline;

/**
 * Created by a.hermann on 2016.03.23..
 *
 * Class used for displaying the game participants.
 *
 */
public class Participant implements Serializable {

    private List<Mastery> masteries;
    private Stats stats;
    private List<Rune> runes;
    private Timeline timeline;
    private Long spell1Id;
    private Long spell2Id;
    private Long participantId;
    private Long championId;
    private Long teamId;
    private String highestAchievedSeasonTier;

    public List<Mastery> getMasteries() {
        return masteries;
    }

    public void setMasteries(List<Mastery> masteries) {
        this.masteries = masteries;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public List<Rune> getRunes() {
        return runes;
    }

    public void setRunes(List<Rune> runes) {
        this.runes = runes;
    }

    public Timeline getTimeline() {
        return timeline;
    }

    public void setTimeline(Timeline timeline) {
        this.timeline = timeline;
    }

    public Long getSpell1Id() {
        return spell1Id;
    }

    public void setSpell1Id(Long spell1Id) {
        this.spell1Id = spell1Id;
    }

    public Long getSpell2Id() {
        return spell2Id;
    }

    public void setSpell2Id(Long spell2Id) {
        this.spell2Id = spell2Id;
    }

    public Long getParticipantId() {
        return participantId;
    }

    public void setParticipantId(Long participantId) {
        this.participantId = participantId;
    }

    public Long getChampionId() {
        return championId;
    }

    public void setChampionId(Long championId) {
        this.championId = championId;
    }

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public String getHighestAchievedSeasonTier() {
        return highestAchievedSeasonTier;
    }

    public void setHighestAchievedSeasonTier(String highestAchievedSeasonTier) {
        this.highestAchievedSeasonTier = highestAchievedSeasonTier;
    }
}
