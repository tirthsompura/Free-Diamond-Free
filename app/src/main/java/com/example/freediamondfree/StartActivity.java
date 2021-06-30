package com.example.freediamondfree;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class StartActivity extends AppCompatActivity {

    ImageButton startbtn, diamondappimage, jiotvimage, zoomguidimage, callfimage, mnumimage, xlvideoimage, livtvimage, calleridimage, dremoteimage, tiktikimage, pscreenimage,
            vidmateimage, fcallimage,stryedit,sonytv,musicplayer,camera,gallery;
    ImageView left_icon,home;;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

//advertising
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


//start projrct
        startbtn = (ImageButton) findViewById(R.id.startbtn);
        left_icon = (ImageView) findViewById(R.id.left_icon);
        home = (ImageView) findViewById(R.id.home);

        diamondappimage = (ImageButton) findViewById(R.id.diamondapp);
        jiotvimage = (ImageButton) findViewById(R.id.jiotv);
        zoomguidimage = (ImageButton) findViewById(R.id.zoomguid);
        callfimage = (ImageButton) findViewById(R.id.callf);
        mnumimage = (ImageButton) findViewById(R.id.mnum);
        xlvideoimage = (ImageButton) findViewById(R.id.xlvideo);
        livtvimage = (ImageButton) findViewById(R.id.livtv);
        calleridimage = (ImageButton) findViewById(R.id.callerid);
        dremoteimage = (ImageButton) findViewById(R.id.dremote);
        tiktikimage = (ImageButton) findViewById(R.id.tiktik);
        pscreenimage = (ImageButton) findViewById(R.id.pscreen);
        fcallimage = (ImageButton) findViewById(R.id.fcall);
        vidmateimage = (ImageButton) findViewById(R.id.vidmate);
        stryedit = (ImageButton) findViewById(R.id.stryedit);
        sonytv = (ImageButton) findViewById(R.id.sonytv);
        musicplayer = (ImageButton) findViewById(R.id.musicplayer);
        camera = (ImageButton) findViewById(R.id.camera);
        gallery= (ImageButton) findViewById(R.id.gallery);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(StartActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
        startbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(StartActivity.this, GuideActivity.class);
                startActivity(i);
            }
        });


        left_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(StartActivity.this, MainActivity.class);
                startActivity(i);
            }
        });


        diamondappimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://play.google.com/store/apps/details?id=com.diamond.tool");
            }
        });

        jiotvimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://play.google.com/store/apps/details?id=my.livetv.freemovies.jiotv");
            }
        });

        zoomguidimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://play.google.com/store/apps/details?id=com.zoomguide.meetingcalls");
            }
        });

        callfimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://play.google.com/store/apps/details?id=com.buddy.callforwarding");
            }
        });

        mnumimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://play.google.com/store/apps/details?id=com.zinn.currentmobiletrackerlocation");
            }
        });


        xlvideoimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://play.google.com/store/apps/details?id=com.livetalkinc.videocallapp");
            }
        });
        livtvimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://play.google.com/store/apps/details?id=com.celivetv.mobile2");
            }
        });

        calleridimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://play.google.com/store/apps/details?id=com.callapp.contacts");
            }
        });

        dremoteimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://play.google.com/store/apps/details?id=com.abtech.remotecontrol36");
            }
        });

        tiktikimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://play.google.com/store/apps/details?id=info.primesoft.primetime");
            }
        });

        pscreenimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://play.google.com/store/apps/details?id=com.retro.photocallerscreen");
            }
        });

        vidmateimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://play.google.com/store/apps/details?id=com.downloader.privatebrowser");
            }
        });

        fcallimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://play.google.com/store/apps/details?id=com.suss.apps.fakecall.fakecallerid.prankcalling");
            }
        });
        stryedit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://play.google.com/store/apps/details?id=com.cerdillac.instories");
            }
        });
        sonytv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://play.google.com/store/apps/details?id=com.sonyliv");
            }
        });
        musicplayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://play.google.com/store/apps/details?id=power.musicplayer.bass.booster");
            }
        });
        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://play.google.com/store/apps/details?id=photo.manager.private.photogallery");
            }
        });

        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://play.google.com/store/apps/details?id=beauty.cam.photo.editor");
            }
        });
    }
    private void gotoUrl(String o){
        Uri uri = Uri.parse(o);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}
