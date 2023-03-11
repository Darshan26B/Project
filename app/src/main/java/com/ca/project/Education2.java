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
        TextView textView = findViewById(R.id.Next2);
        EditText edtSch = findViewById(R.id.sch);
        EditText edtBoard = findViewById(R.id.Board);
        EditText edtQu = findViewById(R.id.Qualification);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String school = edtSch.getText().toString();
                String Board = edtBoard.getText().toString();
                String Qu = edtQu.getText().toString();

                editor.putString("school",school);
                editor.putString("Board",Board);
                editor.putString("qu",Qu);
                editor.commit();


                if (school.isEmpty()) {
                    edtSch.setError("Enter School Name!");
                } else if (Board.isEmpty()) {
                    edtBoard.setError("Enter Board Examination !");
                } else if (Qu.isEmpty()) {
                    edtQu.setError("Enter your Qualification !");
                } else {
                    Intent intent = new Intent(Education2.this, Hobby.class);
                    intent.putExtra("school",school);;
                    intent.putExtra("Board",Board);
                    intent.putExtra("qu",Qu);
                    startActivity(intent);
                }

            }
        });
    }
}