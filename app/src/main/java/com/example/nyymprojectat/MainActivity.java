package com.example.nyymprojectat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username,password,renterPassword;
    Button btnSignUp,btnSignIn;
    Database myDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
        renterPassword = (EditText)findViewById(R.id.renterPassword);

        btnSignUp = (Button) findViewById(R.id.btnSignUp);
        btnSignIn = (Button) findViewById(R.id.btnSignIn);

        myDB = new Database(this);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = username.getText().toString();
                String pass = password.getText().toString();
                String repass = renterPassword.getText().toString();

                if (user.equals("") || pass.equals("") || repass.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Tüm alanları doldurunuz.", Toast.LENGTH_SHORT).show();
                }
                else{

                    if(pass.equals(repass)){

                    }

                    else
                    {
                        Toast.makeText(MainActivity.this, "Şifreler eşleşmiyor.", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });

    }
}