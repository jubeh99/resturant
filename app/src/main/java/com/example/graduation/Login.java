package com.example.graduation;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    Button login, signup, back;
    EditText phoneNumber, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login = findViewById(R.id.btn_login);
        signup = findViewById(R.id.btn_signup);
        back = findViewById(R.id.btn_back);
        phoneNumber = findViewById(R.id.text_phone2);
        password = findViewById(R.id.text_password2);
    }

    public void Welcome(View view) {
        startActivity(new Intent(Login.this, Welcome.class));
    }

    public void MainActivity(View view) {
        startActivity(new Intent(Login.this, MainActivity.class));
    }

    public void SignUp(View view) {
        startActivity(new Intent(Login.this, SignUp.class));

    }

}