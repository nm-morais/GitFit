package com.example.nunomorais.GitFit.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.nunomorais.GitFit.R;

public class UserActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        Intent intent = getIntent();


        //SPINNER SEX
        Spinner spinner_sex = (Spinner) findViewById(R.id.Spinner_sex);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Dropdown_sex, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_sex.setAdapter(adapter);

        //SPINNER ACTIVTY INDEX
        Spinner spinner_act = (Spinner) findViewById(R.id.spinner_activity);
        adapter = ArrayAdapter.createFromResource(this, R.array.DropDown_Activity_Index, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_act.setAdapter(adapter);
    }

    public void submitUserData(View view){

        EditText editText = (EditText) findViewById(R.id.User_input);
        String username = editText.getText().toString();
        EditText editText = (EditText) findViewById(R.id.);

    }


}
