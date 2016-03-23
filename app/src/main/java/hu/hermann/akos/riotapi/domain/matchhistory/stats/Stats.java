package hu.hermann.akos.riotapi.domain.matchhistory.stats;

import java.io.Serializable;

/**
 * Created by a.hermann on 2016.03.23..
 */
public class Stats implements Serializable{

    private int unrealKills;
    private Long item0;
    private Long item1;
    private Long item2;
    private Long item3;
    private Long item4;
    private Long item5;
    private Long item6;
    private int champLevel;
    private int deaths;
    private int assists;
    private int kills;
    private int minionsKilled;
    private int neutralMinionsKilled;
    private int neutralMinionsKilledTeamJungle;
    private int neutralMinionsKilledEnemyJungle;
    private int doubleKills;
    private int tripleKills;
    private int quadraKills;
    private int pentaKills;
    private int largestKillingSpree;
    private int largestMultiKill;
    private int sightWardsBoughtInGame;
    private int visionWardsBoughtInGame;
    private int wardsKilled;
    private int wardsPlaced;
    private Long magicDamageTaken;
    private Long physicalDamageTaken;
    private Long trueDamageTaken;
    private Long totalDamageTaken;
    private Long magicDamageDealt;
    private Long physicalDamageDealt;
    private Long magicDamageDealtToChampions;
    private Long physicalDamageDealtToChampions;
    private Long totalDamageDealt;
    private Long totalDamageDealtToChampions;
    private Long largestCriticalStrike;
    private Long trueDamageDealt;
    private Long trueDamageDealtToChampions;
    private int towerKills;
    private int inhibitorKills;
    private Long totalTimeCrowdControlDealt;
    private boolean firstBloodAssist;
    private boolean firstBloodKill;
    private boolean firstTowerKill;
    private boolean firstTowerAssist;
    private boolean firstInhibitorKill;
    private boolean firstInhibitorAssist;
    private int totalScoreRank;
    private int totalPlayerScore;
    private int totalUnitsHealed;
    private Long totalHeal;
    private int objectivePlayerScore;
    private boolean winner;
    private Long goldSpent;
    private Long goldEarned;
    private int killingSprees;
    private int combatPlayerScore;

    public int getUnrealKills() {
        return unrealKills;
    }

    public void setUnrealKills(int unrealKills) {
        this.unrealKills = unrealKills;
    }

    public Long getItem0() {
        return item0;
    }

    public void setItem0(Long item0) {
        this.item0 = item0;
    }

    public Long getItem1() {
        return item1;
    }

    public void setItem1(Long item1) {
        this.item1 = item1;
    }

    public Long getItem2() {
        return item2;
    }

    public void setItem2(Long item2) {
        this.item2 = item2;
    }

    public Long getItem3() {
        return item3;
    }

    public void setItem3(Long item3) {
        this.item3 = item3;
    }

    public Long getItem4() {
        return item4;
    }

    public void setItem4(Long item4) {
        this.item4 = item4;
    }

    public Long getItem5() {
        return item5;
    }

    public void setItem5(Long item5) {
        this.item5 = item5;
    }

    public Long getItem6() {
        return item6;
    }

    public void setItem6(Long item6) {
        this.item6 = item6;
    }

    public int getChampLevel() {
        return champLevel;
    }

    public void setChampLevel(int champLevel) {
        this.champLevel = champLevel;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public int getMinionsKilled() {
        return minionsKilled;
    }

    public void setMinionsKilled(int minionsKilled) {
        this.minionsKilled = minionsKilled;
    }

    public int getNeutralMinionsKilled() {
        return neutralMinionsKilled;
    }

    public void setNeutralMinionsKilled(int neutralMinionsKilled) {
        this.neutralMinionsKilled = neutralMinionsKilled;
    }

    public int getNeutralMinionsKilledTeamJungle() {
        return neutralMinionsKilledTeamJungle;
    }

    public void setNeutralMinionsKilledTeamJungle(int neutralMinionsKilledTeamJungle) {
        this.neutralMinionsKilledTeamJungle = neutralMinionsKilledTeamJungle;
    }

    public int getNeutralMinionsKilledEnemyJungle() {
        return neutralMinionsKilledEnemyJungle;
    }

    public void setNeutralMinionsKilledEnemyJungle(int neutralMinionsKilledEnemyJungle) {
        this.neutralMinionsKilledEnemyJungle = neutralMinionsKilledEnemyJungle;
    }

    public int getDoubleKills() {
        return doubleKills;
    }

    public void setDoubleKills(int doubleKills) {
        this.doubleKills = doubleKills;
    }

    public int getTripleKills() {
        return tripleKills;
    }

    public void setTripleKills(int tripleKills) {
        this.tripleKills = tripleKills;
    }

    public int getQuadraKills() {
        return quadraKills;
    }

    public void setQuadraKills(int quadraKills) {
        this.quadraKills = quadraKills;
    }

    public int getPentaKills() {
        return pentaKills;
    }

    public void setPentaKills(int pentaKills) {
        this.pentaKills = pentaKills;
    }

    public int getLargestKillingSpree() {
        return largestKillingSpree;
    }

    public void setLargestKillingSpree(int largestKillingSpree) {
        this.largestKillingSpree = largestKillingSpree;
    }

    public int getLargestMultiKill() {
        return largestMultiKill;
    }

    public void setLargestMultiKill(int largestMultiKill) {
        this.largestMultiKill = largestMultiKill;
    }

    public int getSightWardsBoughtInGame() {
        return sightWardsBoughtInGame;
    }

    public void setSightWardsBoughtInGame(int sightWardsBoughtInGame) {
        this.sightWardsBoughtInGame = sightWardsBoughtInGame;
    }

    public int getVisionWardsBoughtInGame() {
        return visionWardsBoughtInGame;
    }

    public void setVisionWardsBoughtInGame(int visionWardsBoughtInGame) {
        this.visionWardsBoughtInGame = visionWardsBoughtInGame;
    }

    public int getWardsKilled() {
        return wardsKilled;
    }

    public void setWardsKilled(int wardsKilled) {
        this.wardsKilled = wardsKilled;
    }

    public int getWardsPlaced() {
        return wardsPlaced;
    }

    public void setWardsPlaced(int wardsPlaced) {
        this.wardsPlaced = wardsPlaced;
    }

    public Long getMagicDamageTaken() {
        return magicDamageTaken;
    }

    public void setMagicDamageTaken(Long magicDamageTaken) {
        this.magicDamageTaken = magicDamageTaken;
    }

    public Long getPhysicalDamageTaken() {
        return physicalDamageTaken;
    }

    public void setPhysicalDamageTaken(Long physicalDamageTaken) {
        this.physicalDamageTaken = physicalDamageTaken;
    }

    public Long getTrueDamageTaken() {
        return trueDamageTaken;
    }

    public void setTrueDamageTaken(Long trueDamageTaken) {
        this.trueDamageTaken = trueDamageTaken;
    }

    public Long getTotalDamageTaken() {
        return totalDamageTaken;
    }

    public void setTotalDamageTaken(Long totalDamageTaken) {
        this.totalDamageTaken = totalDamageTaken;
    }

    public Long getMagicDamageDealt() {
        return magicDamageDealt;
    }

    public void setMagicDamageDealt(Long magicDamageDealt) {
        this.magicDamageDealt = magicDamageDealt;
    }

    public Long getPhysicalDamageDealt() {
        return physicalDamageDealt;
    }

    public void setPhysicalDamageDealt(Long physicalDamageDealt) {
        this.physicalDamageDealt = physicalDamageDealt;
    }

    public Long getMagicDamageDealtToChampions() {
        return magicDamageDealtToChampions;
    }

    public void setMagicDamageDealtToChampions(Long magicDamageDealtToChampions) {
        this.magicDamageDealtToChampions = magicDamageDealtToChampions;
    }

    public Long getPhysicalDamageDealtToChampions() {
        return physicalDamageDealtToChampions;
    }

    public void setPhysicalDamageDealtToChampions(Long physicalDamageDealtToChampions) {
        this.physicalDamageDealtToChampions = physicalDamageDealtToChampions;
    }

    public Long getTotalDamageDealt() {
        return totalDamageDealt;
    }

    public void setTotalDamageDealt(Long totalDamageDealt) {
        this.totalDamageDealt = totalDamageDealt;
    }

    public Long getTotalDamageDealtToChampions() {
        return totalDamageDealtToChampions;
    }

    public void setTotalDamageDealtToChampions(Long totalDamageDealtToChampions) {
        this.totalDamageDealtToChampions = totalDamageDealtToChampions;
    }

    public Long getLargestCriticalStrike() {
        return largestCriticalStrike;
    }

    public void setLargestCriticalStrike(Long largestCriticalStrike) {
        this.largestCriticalStrike = largestCriticalStrike;
    }

    public Long getTrueDamageDealt() {
        return trueDamageDealt;
    }

    public void setTrueDamageDealt(Long trueDamageDealt) {
        this.trueDamageDealt = trueDamageDealt;
    }

    public Long getTrueDamageDealtToChampions() {
        return trueDamageDealtToChampions;
    }

    public void setTrueDamageDealtToChampions(Long trueDamageDealtToChampions) {
        this.trueDamageDealtToChampions = trueDamageDealtToChampions;
    }

    public int getTowerKills() {
        return towerKills;
    }

    public void setTowerKills(int towerKills) {
        this.towerKills = towerKills;
    }

    public int getInhibitorKills() {
        return inhibitorKills;
    }

    public void setInhibitorKills(int inhibitorKills) {
        this.inhibitorKills = inhibitorKills;
    }

    public Long getTotalTimeCrowdControlDealt() {
        return totalTimeCrowdControlDealt;
    }

    public void setTotalTimeCrowdControlDealt(Long totalTimeCrowdControlDealt) {
        this.totalTimeCrowdControlDealt = totalTimeCrowdControlDealt;
    }

    public boolean isFirstBloodAssist() {
        return firstBloodAssist;
    }

    public void setFirstBloodAssist(boolean firstBloodAssist) {
        this.firstBloodAssist = firstBloodAssist;
    }

    public boolean isFirstBloodKill() {
        return firstBloodKill;
    }

    public void setFirstBloodKill(boolean firstBloodKill) {
        this.firstBloodKill = firstBloodKill;
    }

    public boolean isFirstTowerKill() {
        return firstTowerKill;
    }

    public void setFirstTowerKill(boolean firstTowerKill) {
        this.firstTowerKill = firstTowerKill;
    }

    public boolean isFirstTowerAssist() {
        return firstTowerAssist;
    }

    public void setFirstTowerAssist(boolean firstTowerAssist) {
        this.firstTowerAssist = firstTowerAssist;
    }

    public boolean isFirstInhibitorKill() {
        return firstInhibitorKill;
    }

    public void setFirstInhibitorKill(boolean firstInhibitorKill) {
        this.firstInhibitorKill = firstInhibitorKill;
    }

    public boolean isFirstInhibitorAssist() {
        return firstInhibitorAssist;
    }

    public void setFirstInhibitorAssist(boolean firstInhibitorAssist) {
        this.firstInhibitorAssist = firstInhibitorAssist;
    }

    public int getTotalScoreRank() {
        return totalScoreRank;
    }

    public void setTotalScoreRank(int totalScoreRank) {
        this.totalScoreRank = totalScoreRank;
    }

    public int getTotalPlayerScore() {
        return totalPlayerScore;
    }

    public void setTotalPlayerScore(int totalPlayerScore) {
        this.totalPlayerScore = totalPlayerScore;
    }

    public int getTotalUnitsHealed() {
        return totalUnitsHealed;
    }

    public void setTotalUnitsHealed(int totalUnitsHealed) {
        this.totalUnitsHealed = totalUnitsHealed;
    }

    public Long getTotalHeal() {
        return totalHeal;
    }

    public void setTotalHeal(Long totalHeal) {
        this.totalHeal = totalHeal;
    }

    public int getObjectivePlayerScore() {
        return objectivePlayerScore;
    }

    public void setObjectivePlayerScore(int objectivePlayerScore) {
        this.objectivePlayerScore = objectivePlayerScore;
    }

    public boolean isWinner() {
        return winner;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }

    public Long getGoldSpent() {
        return goldSpent;
    }

    public void setGoldSpent(Long goldSpent) {
        this.goldSpent = goldSpent;
    }

    public Long getGoldEarned() {
        return goldEarned;
    }

    public void setGoldEarned(Long goldEarned) {
        this.goldEarned = goldEarned;
    }

    public int getKillingSprees() {
        return killingSprees;
    }

    public void setKillingSprees(int killingSprees) {
        this.killingSprees = killingSprees;
    }

    public int getCombatPlayerScore() {
        return combatPlayerScore;
    }

    public void setCombatPlayerScore(int combatPlayerScore) {
        this.combatPlayerScore = combatPlayerScore;
    }
}
