package hu.hermann.akos.riotapi.domain.response;

import java.io.Serializable;
import java.util.List;

/**
 * Created by hofee on 2016. 03. 07..
 */
public class RankInfo implements Serializable {

    private String name;
    private String tier;
    private String queue;
    private List<Entry> entries;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }

    public List<Entry> getEntries() {
        return entries;
    }

    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }
}
