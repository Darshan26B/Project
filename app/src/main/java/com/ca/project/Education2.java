package com.ca.project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Education2 extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education2);
        TextView textView = findViewById(R.id.Next1);
        EditText edt1 = findViewById(R.id.Sc);
        EditText edt2 = findViewById(R.id.BE);
        EditText edt3 = findViewById(R.id.Qn);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Name = edt1.getText().toString();
                String DOB = edt2.getText().toString();
                String ID = edt3.getText().toString();

                if (Name.isEmpty()) {
                    edt1.setError("Enter School Name!");
                } else if (DOB.isEmpty()) {
                    edt2.setError("Enter Board Examination !");
                } else if (ID.isEmpty()) {
                    edt3.setError("Enter your Qualification !");
                }  else {
                    Intent intent = new Intent(Education2.this, Hobby.class);
                    intent.putExtra("Name", Name);
                    startActivities(new Intent[]{intent});
                }

            }
        });
    }
}