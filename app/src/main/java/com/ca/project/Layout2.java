package com.ca.project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class Layout2 extends AppCompatActivity {
    SharedPreferences preferences;
    @Override
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout2);
        preferences = getSharedPreferences("PData",0);

        TextView txtName = findViewById(R.id.Name);
        TextView txtDOB = findViewById(R.id.DOB);
        TextView  txtID = findViewById(R.id.Id);
        TextView  txtNum = findViewById(R.id.Mobile);
        TextView txtSchool = findViewById(R.id.sch);
        TextView txtBoard= findViewById(R.id.Board);
        TextView txtQualification = findViewById(R.id.Qualification);
        TextView txtYour_Name = findViewById(R.id.Your_Name);
        TextView txtA_me = findViewById(R.id.A_me);
        TextView txtWork_h = findViewById(R.id.Work_h);
        TextView txtSkill_E = findViewById(R.id.Skill_E);
        TextView txtMy_Hobby = findViewById(R.id.My_Hobby);


        String Name = preferences.getString("name","");
        String DoB = preferences.getString("DOB","");
        String ID = preferences.getString("ID","");
        String Num = preferences.getString("Num","");

        String School = preferences.getString("School","");
        String Board = preferences.getString("Board","");
        String Qualification = preferences.getString("Qualification","");

        String Your_Name = preferences.getString("Your_Name",""+Name);
        String A_me = preferences.getString("A_Me","");
        String Work_h = preferences.getString("Work_h","");
        String Skill_E= preferences.getString("Skill_E","");
        String My_Hobby = preferences.getString("My_Hobby","");



        txtName.setText(Name);
        txtDOB.setText(DoB);
        txtID.setText(ID);
        txtNum.setText(Num);
        txtSchool.setText(School);
        txtBoard.setText(Board);
        txtQualification.setText(Qualification);
        txtYour_Name.setText(Your_Name);
        txtA_me.setText(A_me);
        txtWork_h.setText(Work_h);
        txtSkill_E.setText(Skill_E);
        txtMy_Hobby.setText(My_Hobby);
    }
}