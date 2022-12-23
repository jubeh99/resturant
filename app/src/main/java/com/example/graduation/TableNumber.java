package com.example.graduation;


import static android.text.TextUtils.isEmpty;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TableNumber extends AppCompatActivity implements View.OnClickListener {
    Button enter;
    TextView t5, t6;
    private Animation top, bot;
    Spinner spinner;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_number);
        enter = findViewById(R.id.button5);
        t5 = findViewById(R.id.textView5);
        t6 = findViewById(R.id.textView6);
        enter.setOnClickListener(this);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        top = AnimationUtils.loadAnimation(this, R.anim.top);
        bot = AnimationUtils.loadAnimation(this, R.anim.bot);
        t5.setAnimation(top);
        t6.setAnimation(bot);


        spinner = findViewById(R.id.spinner);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.spinner, R.layout.spinner2);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(R.layout.spinner_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);


    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button5) {
            String item = spinner.getSelectedItem().toString();
            Intent intent = new Intent(TableNumber.this, Welcome.class);
            intent.putExtra("keynote", item);
            if (isEmpty(spinner.getSelectedItem().toString())) {
                Toast toast = Toast.makeText(context.getApplicationContext(), "Please Select Table", Toast.LENGTH_LONG); // initiate the Toast with context, message and duration for the Toast
                toast.setGravity(Gravity.TOP | Gravity.LEFT, 0, 0);     // set gravity for the Toast.
                toast.setText("added to cart"); // set the text for the Toast
                toast.show(); // display the Toast

            } else {
                startActivity(intent);
            }
        }
    }

}


