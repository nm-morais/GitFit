package com.example.nunomorais.GitFit.Activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.nunomorais.GitFit.Gitfit;
import com.example.nunomorais.GitFit.R;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class UserActivity extends AppCompatActivity {

    Gitfit top;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        Intent intent = getIntent();
        top = (Gitfit) intent.getSerializableExtra(MainActivity.SEND_TOP);


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

    public void submitUserData(View view) {

        String username = "";
        int age, calories, protein, carbs, fat, act_index, height, weigth;
        char gender;

        try {
            EditText editText = (EditText) findViewById(R.id.User_input);
            username = editText.getText().toString();

            editText = (EditText) findViewById(R.id.Age_input);
            age = Integer.parseInt(editText.getText().toString());

            editText = (EditText) findViewById(R.id.Calories_input);
            calories = Integer.parseInt(editText.getText().toString());

            editText = (EditText) findViewById(R.id.Carbs_input);
            carbs = Integer.parseInt(editText.getText().toString());

            editText = (EditText) findViewById(R.id.Height_input);
            height = Integer.parseInt(editText.getText().toString());

            editText = (EditText) findViewById(R.id.Height_input);
            weigth = Integer.parseInt(editText.getText().toString());

            editText = (EditText) findViewById(R.id.Fats_input);
            fat = Integer.parseInt(editText.getText().toString());

            editText = (EditText) findViewById(R.id.Protein_input);
            protein = Integer.parseInt(editText.getText().toString());

            Spinner mySpinner = (Spinner) findViewById(R.id.spinner_activity);
            act_index = mySpinner.getSelectedItemPosition() + 1;

            mySpinner = (Spinner) findViewById(R.id.Spinner_sex);
            gender = mySpinner.getSelectedItem().toString().charAt(0);


            if (age < 0 || protein < 0 || carbs < 0 || fat < 0 || calories < 0 || weigth < 0 || height < 0 || username.isEmpty()) {

                Context context = getApplicationContext();
                CharSequence text = "Invalid User Settings.";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

            } else {
                if (top.getUser() != null)
                    top.editUser(username, age, gender, height, weigth, calories, act_index, carbs, protein, fat);
                else
                    top.createUser(username, age, gender, height, weigth, calories, act_index, carbs, protein, fat);
                saveObject(top);
                Context context = getApplicationContext();
                CharSequence text = "User created with success!!!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                Intent intent = new Intent(this, MainActivity.class);
                intent.putExtra(MainActivity.SEND_TOP,top);
                startActivity(intent);


            }
        } catch (Exception e) {
            Context context = getApplicationContext();
            CharSequence text = "Invalid User Settings.";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, e.getMessage(), duration);
            toast.show();

        }



    }
    public void saveObject(Gitfit p){
        try
        {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("/data/save.bin"))); //Select where you wish to save the file...
            oos.writeObject(p); // write the class as an 'object'
            oos.flush(); // flush the stream to insure all of the information was written to 'save_object.bin'
            oos.close();// close the stream
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }

    @Override
    public void onBackPressed() {
        System.exit(0);
        return;
    }
}
