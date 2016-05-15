package hu.hermann.akos.riotapi.domain;

import java.io.Serializable;
import java.util.List;

import hu.hermann.akos.riotapi.domain.matchhistory.stats.Stats;

/**
 * Created by hofee on 2016. 05. 15..
 */
public class RecentGame implements Serializable {

    private List<FellowPlayer> fellowPlayers;
    private GameType gameType;
    private RecentStats stats;
    private Long gameId;
    private int ipEarned;
    private Long spell1;
    private Long spell2;
    private Long teamId;
    private GameMode gameMode;
    private Long mapId;
    private int level;
    private boolean invalid;
    private String subType;
    private Long creationDate;
    private Long championId;

    public List<FellowPlayer> getFellowPlayers() {
        return fellowPlayers;
    }

    public void setFellowPlayers(List<FellowPlayer> fellowPlayers) {
        this.fellowPlayers = fellowPlayers;
    }

    public GameType getGameType() {
        return gameType;
    }

    public void setGameType(GameType gameType) {
        this.gameType = gameType;
    }

    public RecentStats getStats() {
        return stats;
    }

    public void setStats(RecentStats stats) {
        this.stats = stats;
    }

    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    public int getIpEarned() {
        return ipEarned;
    }

    public void setIpEarned(int ipEarned) {
        this.ipEarned = ipEarned;
    }

    public Long getSpell1() {
        return spell1;
    }

    public void setSpell1(Long spell1) {
        this.spell1 = spell1;
    }

    public Long getSpell2() {
        return spell2;
    }

    public void setSpell2(Long spell2) {
        this.spell2 = spell2;
    }

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public GameMode getGameMode() {
        return gameMode;
    }

    public void setGameMode(GameMode gameMode) {
        this.gameMode = gameMode;
    }

    public Long getMapId() {
        return mapId;
    }

    public void setMapId(Long mapId) {
        this.mapId = mapId;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isInvalid() {
        return invalid;
    }

    public void setInvalid(boolean invalid) {
        this.invalid = invalid;
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public Long getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Long creationDate) {
        this.creationDate = creationDate;
    }

    public Long getChampionId() {
        return championId;
    }

    public void setChampionId(Long championId) {
        this.championId = championId;
    }
}
