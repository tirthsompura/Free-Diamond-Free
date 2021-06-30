package com.example.freediamondfree;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class WeaponsActivity extends AppCompatActivity {
    ImageView left_icon,home;
    CardView an94,m4a1,ak,m14,scar,gonza,famas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weapons);

        left_icon = (ImageView) findViewById(R.id.left_icon);
        home = (ImageView) findViewById(R.id.home);

        an94 = (CardView) findViewById(R.id.an94);
        m4a1 = (CardView) findViewById(R.id.m4a1);
        ak = (CardView) findViewById(R.id.ak);
        m14 = (CardView) findViewById(R.id.m14);
        scar = (CardView) findViewById(R.id.scar);
        gonza = (CardView) findViewById(R.id.gonza);
        famas = (CardView) findViewById(R.id.famas);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(WeaponsActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

        left_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(WeaponsActivity.this, DiamondGuideActivity.class);
                startActivity(i);
            }
        });

        an94.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(WeaponsActivity.this, AN94Activity.class);
                startActivity(i);
            }
        });

        m4a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(WeaponsActivity.this, M4A1Activity.class);
                startActivity(i);
            }
        });
        ak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(WeaponsActivity.this, AKActivity.class);
                startActivity(i);
            }
        });
        m14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(WeaponsActivity.this, M14Activity.class);
                startActivity(i);
            }
        });
        scar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(WeaponsActivity.this, SCARActivity.class);
                startActivity(i);
            }
        });
        gonza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(WeaponsActivity.this, GonzaActivity.class);
                startActivity(i);
            }
        });
        famas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(WeaponsActivity.this, FamasActivity.class);
                startActivity(i);
            }
        });
    }
}