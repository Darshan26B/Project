package com.ca.project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Projects3 extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projects3);
        TextView textView = findViewById(R.id.Next5);
        EditText editText=findViewById(R.id.Pro);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Work =editText.getText().toString();
                if (Work.isEmpty()) {
                    editText.setError("");
                } else {
                    Toast.makeText(Projects3.this,"Submit",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}