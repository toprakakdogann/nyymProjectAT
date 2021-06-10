package com.example.nyymprojectat;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;



public class SepetActivity extends AppCompatActivity {

    ImageButton btnbtndelete,btnbtndelete1,btnbtndelete2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sepet);


        btnbtndelete = (ImageButton) findViewById(R.id.btnbtndelete);
        btnbtndelete1 = (ImageButton) findViewById(R.id.btnbtndelete1);
        btnbtndelete2 = (ImageButton) findViewById(R.id.btnbtndelete2);





        btnbtndelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CardView cardi = (CardView) findViewById(R.id.cardi);
                cardi.setVisibility(View.GONE);



            }
        });
        btnbtndelete1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CardView cardi1 = (CardView) findViewById(R.id.cardi1);
                cardi1.setVisibility(View.GONE);



            }
        });
        btnbtndelete2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CardView cardi2 = (CardView) findViewById(R.id.cardi2);
                cardi2.setVisibility(View.GONE);



            }
        });
    }


}