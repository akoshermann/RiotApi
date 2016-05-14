package hu.hermann.akos.riotapi.interfaces;

import android.graphics.Bitmap;

import hu.hermann.akos.riotapi.domain.Champion;

/**
 * Created by a.hermann on 2016.03.24..
 */
public interface IImageLoader {

    void setImage(Bitmap bitmap);
    void setChampion(Champion champion, Bitmap bitmap);
}
