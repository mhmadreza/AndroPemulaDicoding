package com.mr.subandropemula.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.mr.subandropemula.R;

public class ProfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
        setUIProfile();
    }

    private void setUIProfile() {
        getSupportActionBar().setTitle("Profil Saya");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageView icProfil = findViewById(R.id.iv_profil_r);
        Glide.with(this).load(R.drawable.reza).apply(new RequestOptions().circleCropTransform().override(500,500)).into(icProfil);

        ImageView icDicoding = findViewById(R.id.iv_dicoding);
        ImageView icIndosat = findViewById(R.id.iv_indosatooredoo);

        Glide.with(this)
                .load("https://d17ivq9b7rppb3.cloudfront.net/original/commons/dicoding-logo-full.png")
                .into(icDicoding);

        icDicoding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String urlDicoding = "https://www.dicoding.com/";
                Intent browser = new Intent(Intent.ACTION_VIEW);
                browser.setData(Uri.parse(urlDicoding));
                startActivity(browser);
            }
        });

        Glide.with(this)
                .load("https://idcamp.indosatooredoo.com/images/indosat-logo.png")
                .into(icIndosat);

        icIndosat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String urlOoredoo = "https://idcamp.indosatooredoo.com/";
                Intent browser = new Intent(Intent.ACTION_VIEW);
                browser.setData(Uri.parse(urlOoredoo));
                startActivity(browser);
            }
        });

    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}