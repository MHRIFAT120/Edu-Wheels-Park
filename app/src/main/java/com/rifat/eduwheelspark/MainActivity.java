package com.rifat.eduwheelspark;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import soup.neumorphism.NeumorphButton;

public class MainActivity extends AppCompatActivity {

    private AdView mAdView2;

    NeumorphButton carButton,busButton,bikeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });


        mAdView2 = findViewById(R.id.adView2);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView2.loadAd(adRequest);






        carButton=findViewById(R.id.carButton);
        busButton=findViewById(R.id.busButton);
        bikeButton=findViewById(R.id.bikeButton);



        carButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent =new Intent(MainActivity.this,Parkingslot.class);
                startActivity(myIntent);
            }
        });



        busButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent =new Intent(MainActivity.this,Parkingslot.class);
                startActivity(myIntent);
            }
        });




        bikeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent =new Intent(MainActivity.this,Parkingslot.class);
                startActivity(myIntent);
            }
        });










    }
    }