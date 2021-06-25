package com.example.freediamondfree;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Button diainstall, jioinstall, zoominstall, callinstall, minstall,
            xlvinstall, ltvnstall, cidnstall, reinstall, tikinstall, pcinstall, vinstall, fcinstall,steditorinstall,sonyliveinstall;
    ImageButton play, more, share, Rate, privarcy;



    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        diainstall = (Button) findViewById(R.id.diainstall);
        jioinstall = (Button) findViewById(R.id.jioinstall);
        zoominstall = (Button) findViewById(R.id.zoominstall);
        callinstall = (Button) findViewById(R.id.callinstall);
        minstall = (Button) findViewById(R.id.minstall);
        xlvinstall = (Button) findViewById(R.id.xlvinstall);
        ltvnstall = (Button) findViewById(R.id.ltvnstall);
        cidnstall = (Button) findViewById(R.id.cidnstall);
        reinstall = (Button) findViewById(R.id.reinstall);
        tikinstall = (Button) findViewById(R.id.tikinstall);
        pcinstall = (Button) findViewById(R.id.pcinstall);
        vinstall = (Button) findViewById(R.id.vinstall);
        fcinstall = (Button) findViewById(R.id.fcinstall);
        steditorinstall = (Button) findViewById(R.id.steditorinstall);
        sonyliveinstall = (Button) findViewById(R.id.sonyliveinstall);


        play = (ImageButton) findViewById(R.id.play);
        more = (ImageButton) findViewById(R.id.more);
        share = (ImageButton) findViewById(R.id.share);
        Rate = (ImageButton) findViewById(R.id.Rate);
        privarcy = (ImageButton) findViewById(R.id.privarcy);



        diainstall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://play.google.com/store/apps/details?id=com.diamond.tool");
            }
        });

        jioinstall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://play.google.com/store/apps/details?id=my.livetv.freemovies.jiotv");
            }
        });

        zoominstall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://play.google.com/store/apps/details?id=com.zoomguide.meetingcalls");
            }
        });

        callinstall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://play.google.com/store/apps/details?id=com.buddy.callforwarding");
            }
        });


        minstall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://play.google.com/store/apps/details?id=com.zinn.currentmobiletrackerlocation");
            }
        });

        xlvinstall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://play.google.com/store/apps/details?id=com.livetalkinc.videocallapp");
            }
        });

        ltvnstall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://play.google.com/store/apps/details?id=com.celivetv.mobile2");
            }
        });

        cidnstall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://play.google.com/store/apps/details?id=com.callapp.contacts");
            }
        });

        reinstall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://play.google.com/store/apps/details?id=com.abtech.remotecontrol36");
            }
        });

        tikinstall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://play.google.com/store/apps/details?id=info.primesoft.primetime");
            }
        });

        pcinstall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://play.google.com/store/apps/details?id=com.retro.photocallerscreen");
            }
        });

        vinstall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://play.google.com/store/apps/details?id=com.downloader.privatebrowser");
            }
        });

        fcinstall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://play.google.com/store/apps/details?id=com.suss.apps.fakecall.fakecallerid.prankcalling");
            }
        });

        steditorinstall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://play.google.com/store/apps/details?id=com.cerdillac.instories");

            }
        });

        sonyliveinstall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://play.google.com/store/apps/details?id=com.sonyliv");
            }
        });

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, StartActivity.class);
                startActivity(i);
            }
        });

        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://play.google.com/store/apps/details?id=com.diamond.tool");
            }
        });


        Rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://play.google.com/store/apps/details?id=com.diamond.tool");
            }
        });


    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
    public void onBackPressed(){
        if(count==0)
        {
            Toast.makeText(this,"Press Again",Toast.LENGTH_SHORT).show();
            count++;
        }else{
            super.onBackPressed();
        }
    }

}



