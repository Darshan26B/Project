package com.ca.project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Skills4 extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skills4);
       TextView textView = findViewById(R.id.Next4);
        EditText editText=findViewById(R.id.sk4);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Work =editText.getText().toString();
                if (Work.isEmpty()) {
                    editText.setError("Enter Your Work !");
                } else {
                    Intent intent = new Intent(Skills4.this, Projects3.class);
                    intent.putExtra("Work", Work);
                    startActivities(new Intent[]{intent});
                }
            }
        });
    }
}