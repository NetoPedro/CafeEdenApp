package com.netoapps2.cafeedenapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;

public class PresentationScreen extends AppCompatActivity {

    private ImageView imageViewLogo, imageViewLogoSubText;
    private static int SPLASH_TIME_OUT = 4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presentation_screen);
        imageViewLogo = (ImageView) findViewById(R.id.logoCafeImageView);
        imageViewLogoSubText = (ImageView) findViewById(R.id.logoSubTextCafeImageView);
        addImages(R.drawable.ic_launcher, imageViewLogo);
        addImages(R.drawable.cafesanckbar, imageViewLogoSubText);






        LinearLayout layout = (LinearLayout) findViewById(R.id.layoutSplashScreen);
       /* layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Intent i = new Intent(getApplicationContext(), MenuScreen.class);
                //startActivity(i);
                */
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(PresentationScreen.this, MenuActivity.class);
                        startActivity(i);
                        finish();
                    }
                }, SPLASH_TIME_OUT);

                /*
                Intent i = new Intent(getApplicationContext(), MenuActivity.class);
                startActivity(i);
                */
            }
        /*
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent i = new Intent();
            }
        }, 100);
        */


    private void addImages(int image , ImageView destino){
        Glide.with(this)
                .load(image)
                .fitCenter()
                .crossFade()
                .into(destino);

    }






}












