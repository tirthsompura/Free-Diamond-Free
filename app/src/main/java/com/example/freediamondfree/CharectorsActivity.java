package com.example.freediamondfree;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CharectorsActivity extends AppCompatActivity {
    ImageView left_icon,home;
    CardView hayato,moco,wukong,antonio,andrew,kelly,olivia,ford,nikita,misha,maxim,kla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_charectors);

        home= (ImageView)findViewById(R.id.home);
        left_icon= (ImageView)findViewById(R.id.left_icon);
        hayato = (CardView)findViewById(R.id.hayato);
        moco= (CardView)findViewById(R.id.moco);
        wukong= (CardView)findViewById(R.id.wukong);
        antonio= (CardView)findViewById(R.id.antonio);
        andrew= (CardView)findViewById(R.id.andrew);
        kelly= (CardView)findViewById(R.id.kelly);
        olivia= (CardView)findViewById(R.id.olivia);
        ford= (CardView)findViewById(R.id.ford);
        nikita= (CardView)findViewById(R.id.nikita);
        misha= (CardView)findViewById(R.id.misha);
        maxim= (CardView)findViewById(R.id.maxim);
        kla= (CardView)findViewById(R.id.kla);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CharectorsActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

        left_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CharectorsActivity.this, DiamondGuideActivity.class);
                startActivity(i);
            }
        });

        hayato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CharectorsActivity.this, HayatoActivity.class);
                startActivity(i);
            }
        });
        moco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CharectorsActivity.this, MocoActivity.class);
                startActivity(i);
            }
        });
        wukong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CharectorsActivity.this, WukongActivity.class);
                startActivity(i);
            }
        });
        antonio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CharectorsActivity.this, AntonioActivity.class);
                startActivity(i);
            }
        });
        andrew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CharectorsActivity.this, AndrewActivity.class);
                startActivity(i);
            }
        });
        kelly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CharectorsActivity.this, KellyActivity.class);
                startActivity(i);
            }
        });
        olivia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CharectorsActivity.this, OliviaActivity.class);
                startActivity(i);
            }
        });
        ford.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CharectorsActivity.this, FordActivity.class);
                startActivity(i);
            }
        });
        nikita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CharectorsActivity.this, NikitaActivity.class);
                startActivity(i);
            }
        });
        misha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CharectorsActivity.this, ManishaActivity.class);
                startActivity(i);
            }
        });
        maxim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CharectorsActivity.this, MaximActivity.class);
                startActivity(i);
            }
        });
        kla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CharectorsActivity.this, KlaActivity.class);
                startActivity(i);
            }
        });


    }
}