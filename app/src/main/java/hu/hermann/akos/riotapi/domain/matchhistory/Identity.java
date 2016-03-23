package hu.hermann.akos.riotapi.domain.matchhistory;

import android.net.Uri;

import java.io.Serializable;

/**
 * Created by a.hermann on 2016.03.23..
 */
public class Identity implements Serializable {

    private Long profileIcon;
    private Uri matchHistoryUri;
    private String summonerName;
    private Long summonerId;

    public Long getProfileIcon() {
        return profileIcon;
    }

    public void setProfileIcon(Long profileIcon) {
        this.profileIcon = profileIcon;
    }

    public Uri getMatchHistoryUri() {
        return matchHistoryUri;
    }

    public void setMatchHistoryUri(Uri matchHistoryUri) {
        this.matchHistoryUri = matchHistoryUri;
    }

    public String getSummonerName() {
        return summonerName;
    }

    public void setSummonerName(String summonerName) {
        this.summonerName = summonerName;
    }

    public Long getSummonerId() {
        return summonerId;
    }

    public void setSummonerId(Long summonerId) {
        this.summonerId = summonerId;
    }
}
