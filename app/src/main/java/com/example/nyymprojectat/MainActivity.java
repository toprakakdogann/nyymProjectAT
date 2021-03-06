package com.example.nyymprojectat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import main.java.designpatterns.factory.restaurant;


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
                        Boolean usercheckResult = myDB.checkusername(user);
                        if(usercheckResult == false)
                        {

                            Boolean regResult = myDB.insertData(user,pass);
                            if(regResult == true){
                                Log.i("test1","Test başarılı, kayıt oluşturuldu");
                                Toast.makeText(MainActivity.this, "Kayıt oluştutuldu.", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(),loginActivity.class);
                                startActivity(intent);

                            }
                            else{
                                Toast.makeText(MainActivity.this, "Kayıt oluşturulamadı.", Toast.LENGTH_SHORT).show();

                            }
                        }
                        else
                        {
                            Toast.makeText(MainActivity.this, "Kullanıcı zaten mevcut.\nLütfen giriş yapınız", Toast.LENGTH_SHORT).show();
                        }


                    }

                    else
                    {
                        Toast.makeText(MainActivity.this, "Şifreler eşleşmiyor.", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),loginActivity.class);
                startActivity(intent);
            }
        });
    }
}