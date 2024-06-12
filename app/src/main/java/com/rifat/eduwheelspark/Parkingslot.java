package com.rifat.eduwheelspark;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;

import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.Locale;

public class Parkingslot extends AppCompatActivity implements View.OnClickListener {


   private AdView mAdView;
    TextView slotA1,slotA2,slotA3,slotA4,slotA5,slotA6,slotA7,slotA8,slotA9,
            slotB1,slotB2,slotB3,slotB4,slotB5,slotB6,slotB7,slotB8,slotB9,
            slotC1,slotC2,slotC3,slotC4,slotC5,slotC6,slotC7,slotC8,slotC9,
            slotD1,slotD2,slotD3,slotD4,slotD5,slotD6,slotD7,slotD8,slotD9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parkingslot);



        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });


        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);



        slotA1=findViewById(R.id.slotA1);
        slotA2=findViewById(R.id.slotA2);
        slotA3=findViewById(R.id.slotA3);
        slotA4=findViewById(R.id.slotA4);
        slotA5=findViewById(R.id.slotA5);
        slotA6=findViewById(R.id.slotA6);
        slotA7=findViewById(R.id.slotA7);
        slotA8=findViewById(R.id.slotA8);
        slotA9=findViewById(R.id.slotA9);


        slotB1=findViewById(R.id.slotB1 );
        slotB2=findViewById(R.id.slotB2 );
        slotB3=findViewById(R.id.slotB3 );
        slotB4=findViewById(R.id.slotB4 );
        slotB5=findViewById(R.id.slotB5 );
        slotB6=findViewById(R.id.slotB6 );
        slotB7=findViewById(R.id.slotB7 );
        slotB8=findViewById(R.id.slotB8 );
        slotB9=findViewById(R.id.slotB9 );


        slotC1=findViewById(R.id.slotC1 );
        slotC2=findViewById(R.id.slotC2 );
        slotC3=findViewById(R.id.slotC3 );
        slotC4=findViewById(R.id.slotC4 );
        slotC5=findViewById(R.id.slotC5 );
        slotC6=findViewById(R.id.slotC6 );
        slotC7=findViewById(R.id.slotC7 );
        slotC8=findViewById(R.id.slotC8 );
        slotC9=findViewById(R.id.slotC9 );


        slotD1=findViewById(R.id.slotD1 );
        slotD2=findViewById(R.id.slotD2 );
        slotD3=findViewById(R.id.slotD3 );
        slotD4=findViewById(R.id.slotD4 );
        slotD5=findViewById(R.id.slotD5 );
        slotD6=findViewById(R.id.slotD6 );
        slotD7=findViewById(R.id.slotD7 );
        slotD8=findViewById(R.id.slotD8 );
        slotD9=findViewById(R.id.slotD9 );
//////////////////////////





        slotA1.setOnClickListener(Parkingslot.this);
        slotA2.setOnClickListener(Parkingslot.this);
        slotA3.setOnClickListener(Parkingslot.this);
        slotA4.setOnClickListener(Parkingslot.this);
        slotA5.setOnClickListener(Parkingslot.this);
        slotA6.setOnClickListener(Parkingslot.this);
        slotA7.setOnClickListener(Parkingslot.this);
        slotA8.setOnClickListener(Parkingslot.this);
        slotA9.setOnClickListener(Parkingslot.this);


        slotB1.setOnClickListener(Parkingslot.this);
        slotB2.setOnClickListener(Parkingslot.this);
        slotB3.setOnClickListener(Parkingslot.this);
        slotB4.setOnClickListener(Parkingslot.this);
        slotB5.setOnClickListener(Parkingslot.this);
        slotB6.setOnClickListener(Parkingslot.this);
        slotB7.setOnClickListener(Parkingslot.this);
        slotB8.setOnClickListener(Parkingslot.this);
        slotB9.setOnClickListener(Parkingslot.this);

        slotC1.setOnClickListener(Parkingslot.this);
        slotC2.setOnClickListener(Parkingslot.this);
        slotC3.setOnClickListener(Parkingslot.this);
        slotC4.setOnClickListener(Parkingslot.this);
        slotC5.setOnClickListener(Parkingslot.this);
        slotC6.setOnClickListener(Parkingslot.this);
        slotC7.setOnClickListener(Parkingslot.this);
        slotC8.setOnClickListener(Parkingslot.this);
        slotC9.setOnClickListener(Parkingslot.this);

        slotD1.setOnClickListener(Parkingslot.this);
        slotD2.setOnClickListener(Parkingslot.this);
        slotD3.setOnClickListener(Parkingslot.this);
        slotD4.setOnClickListener(Parkingslot.this);
        slotD5.setOnClickListener(Parkingslot.this);
        slotD6.setOnClickListener(Parkingslot.this);
        slotD7.setOnClickListener(Parkingslot.this);
        slotD8.setOnClickListener(Parkingslot.this);
        slotD9.setOnClickListener(Parkingslot.this);








    }

    //-------------onCreate ends -----------------------------------


    @Override
    public void onClick(View view) {

        //slot A
        if (view.getId()==R.id.slotA1 || view.getId()==R.id.slotA2 ||view.getId()==R.id.slotA3 ||view.getId()==R.id.slotA4 || view.getId()==R.id.slotA5
        || view.getId()==R.id.slotA6 || view.getId()==R.id.slotA7 || view.getId()==R.id.slotA8 || view.getId()==R.id.slotA9){
            Intent myIntent= new Intent(getApplicationContext(),Booking.class);
            startActivity(myIntent);
        }

        //slot B
        if (view.getId()==R.id.slotB1 || view.getId()==R.id.slotB2 || view.getId()==R.id.slotB3 || view.getId()==R.id.slotB4 || view.getId()==R.id.slotB5
        ||view.getId()==R.id.slotB6 || view.getId()==R.id.slotB7 || view.getId()==R.id.slotB8 || view.getId()==R.id.slotB9){
            Intent myIntent= new Intent(getApplicationContext(),Booking.class);
            startActivity(myIntent);
        }

        //slot C
        if (view.getId()==R.id.slotC1 || view.getId()==R.id.slotC2 || view.getId()==R.id.slotC3 || view.getId()==R.id.slotC4 || view.getId()==R.id.slotC5
                ||view.getId()==R.id.slotC6 || view.getId()==R.id.slotC7 || view.getId()==R.id.slotC8 || view.getId()==R.id.slotC9){
            Intent myIntent= new Intent(getApplicationContext(),Booking.class);
            startActivity(myIntent);
        }


        //slot D
        if (view.getId()==R.id.slotD1 || view.getId()==R.id.slotD2 || view.getId()==R.id.slotD3 || view.getId()==R.id.slotD4 || view.getId()==R.id.slotD5
                ||view.getId()==R.id.slotD6 || view.getId()==R.id.slotD7 || view.getId()==R.id.slotD8 || view.getId()==R.id.slotD9){
            Intent myIntent= new Intent(getApplicationContext(),Booking.class);
            startActivity(myIntent);
        }
              }



}

