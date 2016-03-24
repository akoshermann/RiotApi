package hu.hermann.akos.riotapi.activities;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import butterknife.Bind;
import butterknife.ButterKnife;
import hu.hermann.akos.riotapi.R;
import hu.hermann.akos.riotapi.interfaces.IImageLoader;
import hu.hermann.akos.riotapi.utils.ImageLoader;

public class MatchDetailsActivity extends AppCompatActivity implements IImageLoader{
    @Bind(R.id.imageView)
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_details);
        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        
        getImages();

    }

    private void getImages() {
        ImageLoader imageLoader = new ImageLoader("http://ddragon.leagueoflegends.com/cdn/6.6.1/img/champion/Aatrox.png", this);
        imageLoader.execute((Void) null);
    }

    @Override
    public void setImage(Bitmap bitmap) {
        imageView.setImageBitmap(bitmap);
    }
}
