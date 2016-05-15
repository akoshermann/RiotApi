package hu.hermann.akos.riotapi;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by hofee on 2016. 05. 15..
 */
public class AppContext extends Application {
    private SharedPreferences sharedPreferences;
    private static AppContext instance;



    @Override
    public void onCreate() {
        super.onCreate();
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        instance = this;
    }

    public static AppContext getInstance() {
        return instance;
    }

    public SharedPreferences getPreferences(){
        return sharedPreferences;
    }

}
