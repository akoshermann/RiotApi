package hu.hermann.akos.riotapi.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import hu.hermann.akos.riotapi.domain.Champion;
import hu.hermann.akos.riotapi.interfaces.IImageLoader;

/**
 * Created by a.hermann on 2016.03.24..
 */
public class ImageLoader extends AsyncTask<Void, Void, byte[]> {

    private Champion champion;
    private Context context;
    private String url;

    public ImageLoader(Champion champion, Context context) {
        this.champion = champion;
        this.context = context;
        url = "http://ddragon.leagueoflegends.com/cdn/6.6.1/img/champion/"+champion.getKey()+".png";
    }

    @Override
    protected byte[] doInBackground(Void... params) {
        try{
            URL url = new URL(this.url);
            InputStream inputStream = (InputStream) url.getContent();
            byte[] buffer = new byte[8192];
            int bytesRead;
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            while ((bytesRead = inputStream.read(buffer)) != -1){
                outputStream.write(buffer, 0, bytesRead);
            }
            return outputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    protected void onPostExecute(byte[] bytes) {
        Bitmap bitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
        ((IImageLoader) context).setChampion(champion, bitmap);
    }
}
