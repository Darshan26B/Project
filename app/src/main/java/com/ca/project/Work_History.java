package com.ca.project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Work_History extends AppCompatActivity {
    SharedPreferences preferences;

    SharedPreferences.Editor editor;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_history);
        preferences = getSharedPreferences("PData", 0);
        editor = preferences.edit();
      TextView textView=findViewById(R.id.Next1);
        EditText Des=findViewById(R.id.edtW1);
        EditText Company=findViewById(R.id.edtW2);
        EditText Exp=findViewById(R.id.edtW3);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Designation =Des.getText().toString();
                String Company_Name =Company.getText().toString();
                String Experience =Exp.getText().toString();

                editor.putString("Des",Designation);
                editor.putString("Company",Company_Name);
                editor.putString("Exp",Experience);
                editor.commit();

               if (Designation.isEmpty()) {
                    Des.setError("Enter You Designation !");
                }if (Company_Name.isEmpty()) {
                    Company.setError("Enter Your Company !");
                }if (Experience.isEmpty()) {
                    Exp.setError("Enter Your Experience !");
                }else {
                    Intent intent = new Intent(Work_History.this, Education2.class);
                    intent.putExtra("Des", Designation);
                    intent.putExtra("Company", Company_Name);
                    intent.putExtra("Exp", Experience);
                    startActivity(intent);
                }
            }
        });
    }
}