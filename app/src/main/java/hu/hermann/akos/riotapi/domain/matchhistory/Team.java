package hu.hermann.akos.riotapi.domain.matchhistory;

import java.io.Serializable;
import java.util.List;

/**
 * Created by a.hermann on 2016.03.23..
 */
public class Team implements Serializable {

    private List<Ban> bans;
    private boolean firstBlood;
    private boolean firstTurret;
    boolean firstInhibitor;
    boolean winner;
    boolean firstDragon;
    private int vilemawKills;
    private int baronKills;
    private Long teamId;
    private int inhibitorKills;
    private int dominionVictoryScore;
    private int riftHeraldKills;
    private int firstRiftHerald;
    private int towerKills;
    private int firstBaron;
    private int dragonKills;

    public List<Ban> getBans() {
        return bans;
    }

    public void setBans(List<Ban> bans) {
        this.bans = bans;
    }

    public boolean isFirstBlood() {
        return firstBlood;
    }

    public void setFirstBlood(boolean firstBlood) {
        this.firstBlood = firstBlood;
    }

    public boolean isFirstTurret() {
        return firstTurret;
    }

    public void setFirstTurret(boolean firstTurret) {
        this.firstTurret = firstTurret;
    }

    public boolean isFirstInhibitor() {
        return firstInhibitor;
    }

    public void setFirstInhibitor(boolean firstInhibitor) {
        this.firstInhibitor = firstInhibitor;
    }

    public boolean isWinner() {
        return winner;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }

    public boolean isFirstDragon() {
        return firstDragon;
    }

    public void setFirstDragon(boolean firstDragon) {
        this.firstDragon = firstDragon;
    }

    public int getVilemawKills() {
        return vilemawKills;
    }

    public void setVilemawKills(int vilemawKills) {
        this.vilemawKills = vilemawKills;
    }

    public int getBaronKills() {
        return baronKills;
    }

    public void setBaronKills(int baronKills) {
        this.baronKills = baronKills;
    }

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public int getInhibitorKills() {
        return inhibitorKills;
    }

    public void setInhibitorKills(int inhibitorKills) {
        this.inhibitorKills = inhibitorKills;
    }

    public int getDominionVictoryScore() {
        return dominionVictoryScore;
    }

    public void setDominionVictoryScore(int dominionVictoryScore) {
        this.dominionVictoryScore = dominionVictoryScore;
    }

    public int getRiftHeraldKills() {
        return riftHeraldKills;
    }

    public void setRiftHeraldKills(int riftHeraldKills) {
        this.riftHeraldKills = riftHeraldKills;
    }

    public int getFirstRiftHerald() {
        return firstRiftHerald;
    }

    public void setFirstRiftHerald(int firstRiftHerald) {
        this.firstRiftHerald = firstRiftHerald;
    }

    public int getTowerKills() {
        return towerKills;
    }

    public void setTowerKills(int towerKills) {
        this.towerKills = towerKills;
    }

    public int getFirstBaron() {
        return firstBaron;
    }

    public void setFirstBaron(int firstBaron) {
        this.firstBaron = firstBaron;
    }

    public int getDragonKills() {
        return dragonKills;
    }

    public void setDragonKills(int dragonKills) {
        this.dragonKills = dragonKills;
    }
}
