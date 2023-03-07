package com.ca.project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Education2 extends AppCompatActivity {
    SharedPreferences preferences;

    SharedPreferences.Editor editor;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education2);
        preferences = getSharedPreferences("PData", 0);
        editor = preferences.edit();
        TextView textView = findViewById(R.id.Next1);
        EditText edt1 = findViewById(R.id.Sc);
        EditText edt2 = findViewById(R.id.BE);
        EditText edt3 = findViewById(R.id.Qn);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String school = edt1.getText().toString();
                String Board = edt2.getText().toString();
                String Qu = edt3.getText().toString();

                editor.putString("school",school);
                editor.putString("Board",Board);
                editor.putString("qu",Qu);


                if (school.isEmpty()) {
                    edt1.setError("Enter School Name!");
                } else if (Board.isEmpty()) {
                    edt2.setError("Enter Board Examination !");
                } else if (Qu.isEmpty()) {
                    edt3.setError("Enter your Qualification !");
                } else {
                    Intent intent = new Intent(Education2.this, Hobby.class);
                    intent.putExtra("school",school);;
                    intent.putExtra("Board",Board);
                    intent.putExtra("qu",Qu);
                    startActivities(new Intent[]{intent});
                }

            }
        });
    }
}