package com.example.freediamondfree;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class VehicalActivity extends AppCompatActivity {
    ImageView left_icon;
    CardView sportcar,moster,moto,ambhibion,militry,tuktuk,van;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehical);

        left_icon= (ImageView)findViewById(R.id.left_icon);
        sportcar= (CardView)findViewById(R.id.sportcar);
        moster= (CardView)findViewById(R.id.moster);
        moto= (CardView)findViewById(R.id.moto);
        ambhibion= (CardView)findViewById(R.id.ambhibion);
        militry= (CardView)findViewById(R.id.militry);
        tuktuk= (CardView)findViewById(R.id.tuktuk);
        van= (CardView)findViewById(R.id.van);

        left_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(VehicalActivity.this, DiamondGuideActivity.class);
                startActivity(i);
            }
        });
        sportcar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(VehicalActivity.this, SportcarActivity.class);
                startActivity(i);
            }
        });
        moster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(VehicalActivity.this, MonsterActivity.class);
                startActivity(i);
            }
        });
        moto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(VehicalActivity.this, MotoActivity.class);
                startActivity(i);
            }
        });
        ambhibion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(VehicalActivity.this, AmbhibianActivity.class);
                startActivity(i);
            }
        });
        militry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(VehicalActivity.this, MilitryActivity.class);
                startActivity(i);
            }
        });
        tuktuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(VehicalActivity.this, TukTukActivity.class);
                startActivity(i);
            }
        });
        van.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(VehicalActivity.this, VanActivity.class);
                startActivity(i);
            }
        });

    }
}