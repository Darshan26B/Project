package com.ca.project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Projects3 extends AppCompatActivity {
    SharedPreferences preferences;

    SharedPreferences.Editor editor;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projects3);
        preferences = getSharedPreferences("PData", 0);
        editor = preferences.edit();
        TextView textView = findViewById(R.id.Next5);
        EditText editText = findViewById(R.id.Pro);


        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Project = editText.getText().toString();
                editor.putString("Project", Project);
                if (Project.isEmpty()) {
                    editText.setError("");
                } else {
                    Intent intent = new Intent(Projects3.this, Layout1.class);
                    intent.putExtra("Project",Project);
                    startActivities(new Intent[]{intent});

                }
            }
        });
    }
}