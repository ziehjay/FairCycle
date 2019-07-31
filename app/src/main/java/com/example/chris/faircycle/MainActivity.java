package com.example.chris.faircycle;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    // Time out von 4 sek (4000 ms):
    static int SPLASH_TIME_OUT = 4000;
    Animation rotateAnimation;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Bild initialisieren & rotieren:
        imageView = (ImageView) findViewById(R.id.imageView);
        rotateAnimation();

        // neuen Handler erstellen:
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent welcomeIntent = new Intent(MainActivity.this, WelcomeActivity.class);
                startActivity(welcomeIntent);
                //finish();
            }
        },SPLASH_TIME_OUT);
    }

    private void rotateAnimation() {
        rotateAnimation = AnimationUtils.loadAnimation(this,R.anim.rotate);
        imageView.startAnimation(rotateAnimation);
    }
}
