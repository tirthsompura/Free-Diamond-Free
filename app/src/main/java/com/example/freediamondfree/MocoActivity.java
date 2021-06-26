package com.example.freediamondfree;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MocoActivity extends AppCompatActivity {
    ImageView left_icon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moco);

        left_icon= (ImageView)findViewById(R.id.left_icon);

        left_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MocoActivity.this, CharectorsActivity.class);
                startActivity(i);
            }
        });
    }
}