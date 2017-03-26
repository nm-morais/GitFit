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

public class CreateFoodActivity extends AppCompatActivity {

    Gitfit top;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_food);
        Intent intent = getIntent();
        if (intent.hasExtra(MainActivity.SEND_TOP))
            top = (Gitfit) intent.getSerializableExtra(MainActivity.SEND_TOP);

        Spinner spinner_sex = (Spinner) findViewById(R.id.spinner_food_creation);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Food_creation_Dropdown, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_sex.setAdapter(adapter);

    }

    public void addFood(View view) {
        String food_name = "";
        int calories, carbs, protein, fat;

        try {
            EditText editText = (EditText) findViewById(R.id.description_recipe);
            food_name = editText.getText().toString();

            editText = (EditText) findViewById(R.id.calories_food);
            calories = Integer.parseInt(editText.getText().toString());

            editText = (EditText) findViewById(R.id.carbs_food);
            carbs = Integer.parseInt(editText.getText().toString());

            editText = (EditText) findViewById(R.id.protein_food);
            protein = Integer.parseInt(editText.getText().toString());

            editText = (EditText) findViewById(R.id.fat_food);
            fat = Integer.parseInt(editText.getText().toString());


            Spinner mySpinner = (Spinner) findViewById(R.id.spinner_food_creation);
            String type = mySpinner.getSelectedItem().toString();

            switch (type) {
                case "Unit":
                    type = "COUNTABLE";
                    break;
                case "Weigth (g)":
                    type = "SOLID";
                    break;
                case "Volume (L)":
                    type = "LIQUID";
                    break;
            }

            top.addFood(type, food_name, calories, protein, carbs, fat);
            saveObject(top);

            Context context = getApplicationContext();
            CharSequence text = "Food Added.";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra(MainActivity.SEND_TOP, this.top);
            startActivity(intent);

        } catch (Exception e) {
            Context context = getApplicationContext();
            CharSequence text = "Failed to add food.";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
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


}
