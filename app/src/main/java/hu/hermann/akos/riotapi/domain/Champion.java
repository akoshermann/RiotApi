package hu.hermann.akos.riotapi.domain;

import java.io.Serializable;

/**
 * Created by hofee on 2016. 03. 24..
 */
public class Champion implements Serializable {

    private Long id;
    private String title;
    private String name;
    private String key;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
