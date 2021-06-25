package com.example.freediamondfree;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;

public class SpleshActivity extends AppCompatActivity {

        ProgressBar progressBar;
        TextView textView;
        SharedPreferences sharedPreferences;
        Boolean firsttime;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splesh);

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent i =  new Intent(SpleshActivity.this,MainActivity.class);
                    startActivity(i);
                    finish();
                }
            }, 8000);

            sharedPreferences = getSharedPreferences("hello",MODE_PRIVATE);
            firsttime = false;

            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);

            progressBar= findViewById(R.id.progress_bar);
            textView=findViewById(R.id.text_view);

            progressBar.setMax(100);
            progressBar.setScaleY(3f);

            ProgressAnimation();

        }
        public void ProgressAnimation(){
            ProgressBarAnimation anim = new ProgressBarAnimation(this,progressBar,textView,0f,100f);
            anim.setDuration(8000);
            progressBar.setAnimation(anim);
        }
}

