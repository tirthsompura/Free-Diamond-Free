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

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    public Button diainstall, jioinstall, zoominstall, callinstall, minstall,gallerynstall,camerainstall,
            xlvinstall, ltvnstall, cidnstall, reinstall, tikinstall, pcinstall, vinstall, fcinstall,steditorinstall,sonyliveinstall,musicinstall;
    ImageButton play, more;

    ImageView logout,share, Rate;


    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//start projrct

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
        musicinstall = (Button) findViewById(R.id.musicinstall);
        gallerynstall = (Button) findViewById(R.id.gallerynstall);
        camerainstall = (Button) findViewById(R.id.camerainstall);


        play = (ImageButton) findViewById(R.id.play);
        more = (ImageButton) findViewById(R.id.more);
        share = (ImageView) findViewById(R.id.share);
        Rate = (ImageView) findViewById(R.id.rate);
        logout = (ImageView)findViewById(R.id.logout);

        mAuth = FirebaseAuth.getInstance();

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAuth.signOut();
                Intent i = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(i);
            }
        });
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
        musicinstall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://play.google.com/store/apps/details?id=power.musicplayer.bass.booster");
            }
        });
        gallerynstall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://play.google.com/store/apps/details?id=photo.manager.private.photogallery");
            }
        });
        camerainstall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://play.google.com/store/apps/details?id=beauty.cam.photo.editor");
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
    //int counter = 0;
    @Override
    public void onBackPressed() {
       // counter++;
        //if (counter == 2);
           // super.onBackPressed();
        finishAffinity();
       // finish();
    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser user = mAuth.getCurrentUser();
        if (user == null){
            startActivity(new Intent(MainActivity.this,LoginActivity.class));
        }
    }
}



