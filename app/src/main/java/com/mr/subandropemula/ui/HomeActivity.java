package com.mr.subandropemula.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.mr.subandropemula.DataKelas;
import com.mr.subandropemula.R;
import com.mr.subandropemula.adapter.KelasAdapter;
import com.mr.subandropemula.model.KursusModel;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    private RecyclerView rvData;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private List<KursusModel> itemData = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().setTitle("Kursus Online");
        setUI();

        /* Inisiasi Copyright */
        TextView tvCopyright = findViewById(R.id.tv_copyright_unsplash);

        tvCopyright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String urlUnsplash = "https://unsplash.com/";
                Intent browser = new Intent(Intent.ACTION_VIEW);
                browser.setData(Uri.parse(urlUnsplash));
                startActivity(browser);
            }
        });

        /* Inisiasi Profil */
        TextView tvProfil = findViewById(R.id.tv_profil);
        ImageView ivProfil = findViewById(R.id.iv_profil);

        tvProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, ProfilActivity.class));
            }
        });

        ivProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, ProfilActivity.class));
            }
        });

    }

    private void setUI() {
        rvData = findViewById(R.id.rvData);
        rvData.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        rvData.setLayoutManager(layoutManager);
        itemData.addAll(DataKelas.getListData());


        adapter = new KelasAdapter(itemData, this, new KelasAdapter.AdapterListener() {
            @Override
            public void onClick() {
                Intent moveData = new Intent(HomeActivity.this, DetailActivity.class);
                startActivity(moveData);
            }
        });
        rvData.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}