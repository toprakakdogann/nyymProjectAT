package com.example.nyymprojectat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

     Button btnSepet;
     ImageButton btnbtnsepet,btnbtnsepet1,btnbtnsepet2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        btnSepet = (Button) findViewById(R.id.btnSepet);

        btnbtnsepet = (ImageButton) findViewById(R.id.btnbtnsepet);
        btnbtnsepet1 = (ImageButton) findViewById(R.id.btnbtnsepet1);
        btnbtnsepet2 = (ImageButton) findViewById(R.id.btnbtnsepet2);






        btnbtnsepet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
        btnbtnsepet1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
        btnbtnsepet2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });


        btnSepet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),SepetActivity.class);
                startActivity(intent);
            }
        });
    }
}