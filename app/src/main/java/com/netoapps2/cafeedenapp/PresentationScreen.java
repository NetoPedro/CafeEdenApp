package com.netoapps2.cafeedenapp;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;

public class PresentationScreen extends AppCompatActivity {



    SharedPreferences prefs = null;


    private ImageView imageViewLogo, imageViewLogoSubText;
    private static int SPLASH_TIME_OUT = 4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        prefs = getSharedPreferences("com.mycompany.myAppName", MODE_PRIVATE);

        setContentView(R.layout.activity_presentation_screen);
        imageViewLogo = (ImageView) findViewById(R.id.logoCafeImageView);
        imageViewLogoSubText = (ImageView) findViewById(R.id.logoSubTextCafeImageView);
        addImages(R.drawable.ic_launcher, imageViewLogo);
        addImages(R.drawable.cafesanckbar, imageViewLogoSubText);

        AlarmManager am = (AlarmManager) getSystemService(ALARM_SERVICE);
        Intent i = new Intent(this, NotificationService.class);
        PendingIntent pi = PendingIntent.getService(this, 0, i, 0);
        am.cancel(pi);
        int minutes =1 ;
        // by my own convention, minutes <= 0 means notifications are disabled
        if (minutes > 0) {
            am.setInexactRepeating(AlarmManager.ELAPSED_REALTIME_WAKEUP,
                    SystemClock.elapsedRealtime() + minutes*60*1000,
                    minutes*60*1000, pi);
        }




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

    @Override
    protected void onResume() {
        super.onResume();
        BaseDeDados bd = new BaseDeDados();
        if (prefs.getBoolean("firstrun", true)) {

            prefs.edit().putBoolean("firstrun", false).commit();
        }
    }

    private void addImages(int image , ImageView destino){
        Glide.with(this)
                .load(image)
                .fitCenter()
                .crossFade()
                .into(destino);

    }





}












