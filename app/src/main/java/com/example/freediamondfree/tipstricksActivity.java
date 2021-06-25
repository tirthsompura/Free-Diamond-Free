package com.example.freediamondfree;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class tipstricksActivity extends AppCompatActivity {

    ImageView left_icon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipstricks);

        left_icon = (ImageView) findViewById(R.id.left_icon);


        left_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(tipstricksActivity.this, DiamondGuideActivity.class);
                startActivity(i);
            }
        });
    }
}