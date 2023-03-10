package com.ca.project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Stack;

public class MainActivity1 extends AppCompatActivity {

    SharedPreferences preferences;

    SharedPreferences.Editor editor;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        preferences =getSharedPreferences("PData",0);
        editor = preferences.edit();
        TextView textView = findViewById(R.id.next);
        EditText edt1 = findViewById(R.id.edt1);
        EditText edt2 = findViewById(R.id.edt2);
        EditText edt3 = findViewById(R.id.edt3);
        EditText edt4 = findViewById(R.id.edt4);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Name = edt1.getText().toString();
                String DOB = edt2.getText().toString();
                String ID = edt3.getText().toString();
                String Num = edt4.getText().toString();

                editor.putString("Name",Name);
                editor.putString("DOB",DOB);
                editor.putString("Id",ID);
                editor.putString("Num",Num);
                editor.commit();
                if (Name.isEmpty()) {
                    edt1.setError("Enter Your Name !");
                } else if (DOB.isEmpty()) {
                    edt2.setError("Enter Your Birth Date !");
                } else if (ID.isEmpty()) {
                    edt3.setError("Enter Your E-mail ID !");
                } else if (Num.isEmpty()) {
                    edt4.setError("Enter Your Mobile Number !");
                } else {
                    Intent intent = new Intent(MainActivity1.this, Work_History.class);
                    intent.putExtra("Name", Name);
                    intent.putExtra("DOB", DOB);
                    intent.putExtra("ID",ID);
                    intent.putExtra("Num", Num);
                    startActivity(intent);
                }

            }
        });
    }
}