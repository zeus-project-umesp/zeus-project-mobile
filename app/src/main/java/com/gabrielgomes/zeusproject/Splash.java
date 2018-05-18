package com.gabrielgomes.zeusproject;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.felipecsl.gifimageview.library.GifImageView;

import org.apache.commons.io.IOUtils;

import java.io.InputStream;

public class Splash extends AppCompatActivity {
    private GifImageView gifs;
    private static int SPLASH_TIME_OUT = 7000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        gifs = (GifImageView) findViewById(R.id.gif);

        try {
            InputStream is = getAssets().open("zeusgifs.gif");
            byte[] bytes = IOUtils.toByteArray(is);
            gifs.setBytes(bytes);
            gifs.startAnimation();


        }catch (Exception e){

        }
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent login = new Intent(Splash.this, Login.class);
                startActivity(login);
                finish();
            }
        },SPLASH_TIME_OUT);


    }
}
