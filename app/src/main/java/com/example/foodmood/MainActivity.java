package com.example.foodmood;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button b1;
    EditText et1,et2;
    CheckBox cb;
    String s1,s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button);
        et1=findViewById(R.id.editTextTextPersonName);
        et2=findViewById(R.id.editTextTextPersonName2);
        cb=findViewById(R.id.checkBox2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb.isChecked()){
                    s1=et1.getText().toString();
                    s2=et2.getText().toString();
                    Intent i = new Intent(MainActivity.this,MainActivity2.class);
                    i.putExtra("abc",s1);
                    i.putExtra("xyz",s2);
                    startActivity(i);
                }
                else{
                    AlertDialog.Builder a= new AlertDialog.Builder(MainActivity.this);
                    a.setTitle("Warning");
                    a.setMessage("Please tick the check box if you are not a robot");
                    a.setPositiveButton("Okay",null);
                    a.setNegativeButton("Take me further!", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent in= new Intent(MainActivity.this,MainActivity3.class);
                            startActivity(in);
                        }
                    });
                    a.show();
                }
            }
        });
    }
}