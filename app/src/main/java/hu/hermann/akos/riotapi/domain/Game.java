package hu.hermann.akos.riotapi.domain;

import java.io.Serializable;
import java.util.List;

import hu.hermann.akos.riotapi.domain.player.Observer;
import hu.hermann.akos.riotapi.domain.player.Player;

/**
 * Created by hofee on 2016. 03. 03..
 */
public class Game implements Serializable {

    private List<BannedChampion> bannedChampions;
    private Long gameId;
    private Long gameLength;
    private GameMode gameMode;
    private Long gameQueueConfigId;
    private Long gameStartTime;
    private GameType gameType;
    private Long mapId;
    private Observer observers;
    private List<Player> participants;
    private String platformId;

    public List<BannedChampion> getBannedChampions() {
        return bannedChampions;
    }

    public void setBannedChampions(List<BannedChampion> bannedChampions) {
        this.bannedChampions = bannedChampions;
    }

    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    public Long getGameLength() {
        return gameLength;
    }

    public void setGameLength(Long gameLength) {
        this.gameLength = gameLength;
    }

    public GameMode getGameMode() {
        return gameMode;
    }

    public void setGameMode(GameMode gameMode) {
        this.gameMode = gameMode;
    }

    public Long getGameQueueConfigId() {
        return gameQueueConfigId;
    }

    public void setGameQueueConfigId(Long gameQueueConfigId) {
        this.gameQueueConfigId = gameQueueConfigId;
    }

    public Long getGameStartTime() {
        return gameStartTime;
    }

    public void setGameStartTime(Long gameStartTime) {
        this.gameStartTime = gameStartTime;
    }

    public GameType getGameType() {
        return gameType;
    }

    public void setGameType(GameType gameType) {
        this.gameType = gameType;
    }

    public Long getMapId() {
        return mapId;
    }

    public void setMapId(Long mapId) {
        this.mapId = mapId;
    }

    public Observer getObservers() {
        return observers;
    }

    public void setObservers(Observer observers) {
        this.observers = observers;
    }

    public List<Player> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Player> participants) {
        this.participants = participants;
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }
}
