package com.example.freediamondfree;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AKActivity extends AppCompatActivity {
    ImageView left_icon,home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_k);

        home= (ImageView)findViewById(R.id.home);
        left_icon= (ImageView)findViewById(R.id.left_icon);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AKActivity.this, MainActivity.class);
                startActivity(i);
            }
        }); left_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AKActivity.this, WeaponsActivity.class);
                startActivity(i);
            }
        });

    }
}