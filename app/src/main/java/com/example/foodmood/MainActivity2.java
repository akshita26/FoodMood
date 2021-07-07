package com.example.foodmood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tv;
    String a,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv=findViewById(R.id.textView4);

        a= getIntent().getStringExtra("abc");
        b= getIntent().getStringExtra("xyz");

        tv.setText("Welcome "+a+" "+b+"\nIf you are a foody, you are at perfect place!");

    }
}