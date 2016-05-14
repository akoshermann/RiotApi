package hu.hermann.akos.riotapi.domain;

import android.graphics.Bitmap;

/**
 * Created by hofee on 2016. 05. 14..
 */
public class ChampionDetails {

    private String name;
    private Long id;
    private Bitmap bitmap;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }
}
