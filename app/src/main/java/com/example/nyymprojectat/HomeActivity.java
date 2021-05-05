package com.example.nyymprojectat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import main.java.designpatterns.factory.Siparis;
import main.java.designpatterns.factory.menu;
import main.java.designpatterns.factory.restaurant;

public class HomeActivity extends AppCompatActivity {

    TextView myTextv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Siparis mSiparis = new Siparis();

        myTextv = (TextView) findViewById(R.id.myTextv);
        myTextv.setText(mSiparis.getSiparis());

    }
}