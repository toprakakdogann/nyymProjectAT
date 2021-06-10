package com.example.nyymprojectat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import main.java.designpatterns.factory.Siparis;
import main.java.designpatterns.factory.menu;
import main.java.designpatterns.factory.restaurant;

public class mainMenu extends AppCompatActivity {

    ImageButton btnDelete0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);


        btnDelete0 = (ImageButton) findViewById(R.id.btnDelete0);




        btnDelete0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}