package com.example.freediamondfree;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DiamondGuideActivity extends AppCompatActivity {

    ImageView left_icon,tipsimg,Weapons,charector,vehical;
    CardView dianondcardview,tipstrickcard,weaponscard,charectorcard,vehicalcard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diamond_guide);
//images ::
        left_icon= (ImageView)findViewById(R.id.left_icon);
        tipsimg= (ImageView)findViewById(R.id.tipsimg);
        Weapons= (ImageView)findViewById(R.id.Weapons);
        charector= (ImageView)findViewById(R.id.charector);
        vehical= (ImageView)findViewById(R.id.vehical);
//cards ::
        dianondcardview= (CardView)findViewById(R.id.dianondcardview);
        tipstrickcard= (CardView)findViewById(R.id.tipstrickcard);
        weaponscard= (CardView)findViewById(R.id.weaponscard);
        charectorcard= (CardView)findViewById(R.id.charectorcard);
        vehicalcard= (CardView)findViewById(R.id.vehicalcard);

//image view links::
        left_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DiamondGuideActivity.this, GuideActivity.class);
                startActivity(i);
            }
        });
        tipsimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DiamondGuideActivity.this, tipstricksActivity.class);
                startActivity(i);
            }
        });
        Weapons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DiamondGuideActivity.this, WeaponsActivity.class);
                startActivity(i);
            }
        });
        charector.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DiamondGuideActivity.this, CharectorsActivity.class);
                startActivity(i);
            }
        });
        vehical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DiamondGuideActivity.this, VehicalActivity.class);
                startActivity(i);
            }
        });

//cardview links::
        dianondcardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DiamondGuideActivity.this, GuideDiscActivity.class);
                startActivity(i);
            }
        });
        tipstrickcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DiamondGuideActivity.this, tipstricksActivity.class);
                startActivity(i);
            }
        });
        weaponscard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DiamondGuideActivity.this, WeaponsActivity.class);
                startActivity(i);
            }
        });
        charectorcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DiamondGuideActivity.this, CharectorsActivity.class);
                startActivity(i);
            }
        });
        vehicalcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DiamondGuideActivity.this, VehicalActivity.class);
                startActivity(i);
            }
        });
    }
}