package com.example.freediamondfree;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TukTukActivity extends AppCompatActivity {
    ImageView left_icon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuk_tuk);
        left_icon= (ImageView)findViewById(R.id.left_icon);

        left_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(TukTukActivity.this, VehicalActivity.class);
                startActivity(i);
            }
        });
    }
}