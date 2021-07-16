package com.mr.subandropemula.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.mr.subandropemula.R;

public class SplashscreenActivity extends AppCompatActivity {

    private int DELAYED = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        setUISplashScreen();
    }

    private void setUISplashScreen() {
        /* Menghilangkan Action Bar pada Splashscreen */
        getSupportActionBar().hide();

        /* Meng-handle Delay Intent Halaman Splashscreen ke Home */
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashscreenActivity.this, HomeActivity.class));
                finish();
            }
        }, DELAYED );
    }
}