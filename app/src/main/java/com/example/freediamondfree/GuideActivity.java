package com.example.freediamondfree;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class GuideActivity extends AppCompatActivity {

    ImageView left_icon,diamondguide,diamondcount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

        left_icon= (ImageView)findViewById(R.id.left_icon);
        diamondguide= (ImageView)findViewById(R.id.diamondguide);
        diamondcount= (ImageView)findViewById(R.id.diamondcount);

        left_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(GuideActivity.this, StartActivity.class);
                startActivity(i);
            }
        });

        diamondguide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(GuideActivity.this, DiamondGuideActivity.class);
                startActivity(i);
            }
        });


        diamondcount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(GuideActivity.this, DiamondCountActivity.class);
                startActivity(i);
            }
        });

    }
}