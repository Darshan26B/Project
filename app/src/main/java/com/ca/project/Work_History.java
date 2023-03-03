package com.ca.project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Work_History extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_history);
      TextView textView=findViewById(R.id.Next2);
        EditText work=findViewById(R.id.edtW1);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Work =work.getText().toString();
               if (Work.isEmpty()) {
                    work.setError("Enter Your Work !");
                } else {
                    Intent intent = new Intent(Work_History.this, Education2.class);
                    intent.putExtra("Work", Work);
                    startActivities(new Intent[]{intent});
                }
            }
        });
    }
}