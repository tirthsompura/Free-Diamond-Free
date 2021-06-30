package com.example.freediamondfree;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SCARActivity extends AppCompatActivity {
    ImageView left_icon,home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_c_a_r);

        home= (ImageView)findViewById(R.id.home);
        left_icon= (ImageView)findViewById(R.id.left_icon);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SCARActivity.this, MainActivity.class);
                startActivity(i);
            }
        });left_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SCARActivity.this, WeaponsActivity.class);
                startActivity(i);
            }
        });
    }
}