package com.ca.project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Skills4 extends AppCompatActivity {
    SharedPreferences preferences;

    SharedPreferences.Editor editor;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skills4);
        preferences = getSharedPreferences("PData", 0);
        editor = preferences.edit();
       TextView textView = findViewById(R.id.Next4);
        EditText editText=findViewById(R.id.sk4);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Work =editText.getText().toString();

                editor.putString("Work",Work);


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