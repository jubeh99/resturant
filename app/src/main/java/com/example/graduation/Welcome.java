package com.example.graduation;


import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.graduation.ui.home.HomeFragment;

public class Welcome extends AppCompatActivity {
    Button nextPageButton, gb, info;
    TextView textView4;
    Dialog myDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        nextPageButton = findViewById(R.id.btn_guest);
        gb = findViewById(R.id.btn_regular);
        info = findViewById(R.id.btn_info);
        textView4 = findViewById(R.id.view_tableNum);
        myDialog = new Dialog(this);
        String table2 = getIntent().getStringExtra("keynote");
        textView4.setText(table2);

    }

    public void ShowPopup(View v) {
        Button btnFollow;
        myDialog.setContentView(R.layout.popup_activity);
        btnFollow = myDialog.findViewById(R.id.btnfollow);
        btnFollow.setOnClickListener(v1 -> myDialog.dismiss());
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }

    public void MainActivity(View view) {
        startActivity(new Intent(Welcome.this, MainActivity.class));
    }

    public void Login(View view) {
        startActivity(new Intent(Welcome.this, Login.class));
    }


}


