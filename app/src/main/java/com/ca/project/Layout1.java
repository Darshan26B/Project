package com.ca.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;
import android.widget.TextView;

public class Layout1 extends AppCompatActivity {
    SharedPreferences preferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout1);

         preferences = getSharedPreferences("PData",0);

        TextView txtName = findViewById(R.id.Name);
        TextView txtDOB = findViewById(R.id.DOB);
        TextView  txtID = findViewById(R.id.Id);
        TextView  txtNum = findViewById(R.id.Mobile);
        TextView txtSchool = findViewById(R.id.sch);
        TextView txtBoard= findViewById(R.id.Board);
        TextView txtQualification = findViewById(R.id.Qualification);
        TextView txtYour_Name = findViewById(R.id.Your_Name);
        TextView txtPT = findViewById(R.id.P_Title);
        TextView txtAbout = findViewById(R.id.About);
        TextView txtA_me = findViewById(R.id.A_me);
        TextView txtWork = findViewById(R.id.Work);
        TextView txtWork_h = findViewById(R.id.Work_h);
        TextView txtSkill = findViewById(R.id.Skill);
        TextView txtSkill_E = findViewById(R.id.Skill_E);
        TextView txtHobby = findViewById(R.id.Hobby);
        TextView txtMy_Hobby = findViewById(R.id.My_Hobby);


        String name = preferences.getString("name","");
        String DoB = preferences.getString("DOB","");
        String ID = preferences.getString("ID","");
        String Num = preferences.getString("Num","");

        String School = preferences.getString("School","");
        String Board = preferences.getString("Board","");
        String Qualification = preferences.getString("Qualification","");

        String Your_Name = preferences.getString("Your_Name","");
        String PT = preferences.getString("PT","");
        String About = preferences.getString("About","");
        String A_me = preferences.getString("A_Me","");
        String Work = preferences.getString("Work","");
        String Work_h = preferences.getString("Work_h","");
        String Skill = preferences.getString("Skill","");
        String Skill_E= preferences.getString("Skill_E","");
        String Hobby = preferences.getString("Hobby","");
        String My_Hobby = preferences.getString("My_Hobby","");



        txtName.setText(name);
        txtDOB.setText(DoB);
        txtID.setText(ID);
        txtNum.setText(Num);
        txtSchool.setText(School);
        txtBoard.setText(Board);
        txtQualification.setText(Qualification);
        txtYour_Name.setText(Your_Name);
        txtPT.setText(PT);
        txtAbout.setText(About);
        txtA_me.setText(A_me);
        txtWork.setText(Work);
        txtWork_h.setText(Work_h);
        txtSkill.setText(Skill);
        txtSkill_E.setText(Skill_E);
        txtHobby.setText(Hobby);
        txtMy_Hobby.setText(My_Hobby);

    }
}