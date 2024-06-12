package com.rifat.eduwheelspark;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import soup.neumorphism.NeumorphButton;

public class Booking extends AppCompatActivity {
    private AdView mAdView1;
    EditText edName,edStudentId,edEmail,edMobile,edVechilesNumber,edStart,edEnd,edTime;
    NeumorphButton submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);



        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });


        mAdView1 = findViewById(R.id.adView1);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView1.loadAd(adRequest);



        edName=findViewById(R.id.edName);
        edStudentId=findViewById(R.id.edStudentId);
        edEmail=findViewById(R.id.edEmail);
        edMobile=findViewById(R.id.edMobile);
        edVechilesNumber=findViewById(R.id.edVechilesNumber);
        edStart=findViewById(R.id.edStart);
        edEnd=findViewById(R.id.edEnd);
        edTime=findViewById(R.id.edTime);
        submit=findViewById(R.id.submit);




            submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    String name = edName.getText().toString();
                    String studentId = edStudentId.getText().toString();
                    String email = edEmail.getText().toString();
                    String mobile = edMobile.getText().toString();
                    String vechilesNumber = edVechilesNumber.getText().toString();
                    String start = edStart.getText().toString();
                    String end = edEnd.getText().toString();
                    String time = edTime.getText().toString();


                    String url = "https://eastdelta-93.000webhostapp.com/eduparking/userinput.php?name=" + name +
                            "&studentId=" + studentId + "&email=" + email + "&mobile=" + mobile + "&vechilesNumber=" + vechilesNumber +
                            "&start=" + start + "&end=" + end + "&time=" + time;
                    StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                            new Response.Listener<String>() {
                                @Override
                                public void onResponse(String response) {

                                    new AlertDialog.Builder(Booking.this)
                                            .setTitle("Data is Collected")
                                            .setMessage(response)
                                            .show();

                                }
                            }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {

                        }
                    });
                    RequestQueue queue = Volley.newRequestQueue(Booking.this);
                    queue.add(stringRequest);


                }
            });



    }
}