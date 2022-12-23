package com.example.graduation;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SignUp extends AppCompatActivity {
    Button signup, back;
    EditText name, phoneNumber, password, ConPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        signup = findViewById(R.id.btn_signup2);
        back = findViewById(R.id.btn_back2);
        phoneNumber = findViewById(R.id.text_phone2);
        password = findViewById(R.id.text_password2);
        name = findViewById(R.id.text_name);
        ConPassword = findViewById(R.id.text_ConPassword);
    }

    public void Login(View view) {
        startActivity(new Intent(SignUp.this, Login.class));
    }

    public void MainActivity(View view) {
        startActivity(new Intent(SignUp.this, MainActivity.class));
    }
}