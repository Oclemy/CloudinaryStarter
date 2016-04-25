package com.tutorials.hp.cloudinarystart;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.tutorials.hp.cloudinarystart.mCloud.CloudinaryClient;
import com.tutorials.hp.cloudinarystart.mPicasso.PicassoClient;


public class MainActivity extends AppCompatActivity {

    Boolean resize=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        final ImageView img= (ImageView) findViewById(R.id.movieImage);


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if(resize)
               {
                   PicassoClient.downloadImage(MainActivity.this, CloudinaryClient.resize(),img);
                   resize=false;
               }else
               {
                   PicassoClient.downloadImage(MainActivity.this, CloudinaryClient.getRoundedCorners(),img);
                   resize=true;
               }

            }
        });
    }


}
