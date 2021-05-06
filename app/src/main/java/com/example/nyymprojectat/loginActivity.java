package com.example.nyymprojectat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginActivity extends AppCompatActivity{

    EditText username,password;
    Button btnLogin;

    Database myDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.usernameLogin);
        password = (EditText) findViewById(R.id.passwordLogin);
        btnLogin = (Button) findViewById(R.id.btnLogin);

        myDB = new Database(this);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = username.getText().toString();
                String pass =  password.getText().toString();

                if(user.equals("") || pass.equals("")){
                    Toast.makeText(loginActivity.this, "Lütfen giriş bilgilerini giriniz.", Toast.LENGTH_SHORT).show();
                }
                else{
                    Boolean result = myDB.checkusernamePassword(user,pass);
                    if(result == true){
                        Log.i("test2","Test başarılı, giriş yapıldı.");
                        Intent intent = new Intent(getApplicationContext(),HomeActivity.class);
                        startActivity(intent);
                    }
                    else
                    {
                        Toast.makeText(loginActivity.this, "Geçersiz kimlik bilgileri.", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }


}
