package com.example.nunomorais.GitFit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.nunomorais.GitFit.Activities.MainActivity;

public class Display_User extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display__user);

        Intent intent = getIntent();

        Gitfit top = (Gitfit) intent.getSerializableExtra(MainActivity.SEND_TOP);

        name.setText(top.getUser().getName());
        age.setText(top.getUser().getAge());
        calories.setText(top.getUser().getReqCal());
        prots.setText(top.getUser().getReqProtein());
        carbs.setText(top.getUser().getReqCarbs());
        fats.setText(top.getUser().getReqFat());
        actIndex.setText(top.getUser().getActIndex());
        gender.setText(top.getUser().getSex());
    }


    TextView name = (TextView) findViewById(R.id.display_Name);
    TextView age = (TextView) findViewById(R.id.display_Age);
    TextView calories = (TextView) findViewById(R.id.display_Calories);
    TextView prots = (TextView) findViewById(R.id.display_Proteins);
    TextView carbs = (TextView) findViewById(R.id.display_Carbs);
    TextView fats = (TextView) findViewById(R.id.display_Fat);
    TextView actIndex = (TextView) findViewById(R.id.display_ActIndex);
    TextView gender = (TextView) findViewById(R.id.display_Sex);



}
