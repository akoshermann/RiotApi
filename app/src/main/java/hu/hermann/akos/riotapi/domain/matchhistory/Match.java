package hu.hermann.akos.riotapi.domain.matchhistory;

import java.io.Serializable;

/**
 * Created by a.hermann on 2016.03.23..
 */
public class Match implements Serializable {

    private Long timeStamp;
    private Long champion;
    private String region;
    private String season;
    private Long matchId;
    private String role;
    private String platformId;
    private String lane;

    public Long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Long getChampion() {
        return champion;
    }

    public void setChampion(Long champion) {
        this.champion = champion;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public Long getMatchId() {
        return matchId;
    }

    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public String getLane() {
        return lane;
    }

    public void setLane(String lane) {
        this.lane = lane;
    }
}
