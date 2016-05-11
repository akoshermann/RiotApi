package hu.hermann.akos.riotapi.domain.matchhistory;

import java.io.Serializable;
import java.util.List;

import hu.hermann.akos.riotapi.domain.GameMode;
import hu.hermann.akos.riotapi.domain.GameType;

/**
 * Created by a.hermann on 2016.03.23..
 */
public class MatchDetails implements Serializable {

    private String region;
    private GameType matchType;
    private Long matchCreation;
    private List<Participant> participants;
    private String platformId;
    private GameMode matchMode;
    private List<ParticipantIdentities> participantIdentities;
    private String matchVersion;
    private List<Team> teams;
    private Long mapId;
    private String season;
    private String queueType;
    private Long matchId;
    private Long matchDuration;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public GameType getMatchType() {
        return matchType;
    }

    public void setMatchType(GameType matchType) {
        this.matchType = matchType;
    }

    public Long getMatchCreation() {
        return matchCreation;
    }

    public void setMatchCreation(Long matchCreation) {
        this.matchCreation = matchCreation;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public GameMode getMatchMode() {
        return matchMode;
    }

    public void setMatchMode(GameMode matchMode) {
        this.matchMode = matchMode;
    }

    public List<ParticipantIdentities> getParticipantIdentities() {
        return participantIdentities;
    }

    public void setParticipantIdentities(List<ParticipantIdentities> participantIdentities) {
        this.participantIdentities = participantIdentities;
    }

    public String getMatchVersion() {
        return matchVersion;
    }

    public void setMatchVersion(String matchVersion) {
        this.matchVersion = matchVersion;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public Long getMapId() {
        return mapId;
    }

    public void setMapId(Long mapId) {
        this.mapId = mapId;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getQueueType() {
        return queueType;
    }

    public void setQueueType(String queueType) {
        this.queueType = queueType;
    }

    public Long getMatchId() {
        return matchId;
    }

    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }

    public Long getMatchDuration() {
        return matchDuration;
    }

    public void setMatchDuration(Long matchDuration) {
        this.matchDuration = matchDuration;
    }
}
