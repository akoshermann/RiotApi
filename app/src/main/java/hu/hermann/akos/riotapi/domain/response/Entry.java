package hu.hermann.akos.riotapi.domain.response;

import java.io.Serializable;

/**
 * Created by hofee on 2016. 03. 07..
 */
public class Entry implements Serializable {

    private Long playerOrTeamId;
    private String playerOrTeamName;
    private String division;
    private int leaguePoints;
    private int wins;
    private int losses;
    private boolean isHotStreak;
    private boolean isVeteran;
    private boolean isFreshBlood;
    private boolean isInactive;

    public Long getPlayerOrTeamId() {
        return playerOrTeamId;
    }

    public void setPlayerOrTeamId(Long playerOrTeamId) {
        this.playerOrTeamId = playerOrTeamId;
    }

    public String getPlayerOrTeamName() {
        return playerOrTeamName;
    }

    public void setPlayerOrTeamName(String playerOrTeamName) {
        this.playerOrTeamName = playerOrTeamName;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public int getLeaguePoints() {
        return leaguePoints;
    }

    public void setLeaguePoints(int leaguePoints) {
        this.leaguePoints = leaguePoints;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public boolean isHotStreak() {
        return isHotStreak;
    }

    public void setIsHotStreak(boolean isHotStreak) {
        this.isHotStreak = isHotStreak;
    }

    public boolean isVeteran() {
        return isVeteran;
    }

    public void setIsVeteran(boolean isVeteran) {
        this.isVeteran = isVeteran;
    }

    public boolean isFreshBlood() {
        return isFreshBlood;
    }

    public void setIsFreshBlood(boolean isFreshBlood) {
        this.isFreshBlood = isFreshBlood;
    }

    public boolean isInactive() {
        return isInactive;
    }

    public void setIsInactive(boolean isInactive) {
        this.isInactive = isInactive;
    }
}
