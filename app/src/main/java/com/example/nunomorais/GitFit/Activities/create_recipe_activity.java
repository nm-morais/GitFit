package com.example.nunomorais.GitFit.Activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.nunomorais.GitFit.Food.Ingredient;
import com.example.nunomorais.GitFit.Gitfit;
import com.example.nunomorais.GitFit.R;

import java.util.ArrayList;

public class create_recipe_activity extends AppCompatActivity {

    Gitfit top;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_recipe);

        Intent intent = getIntent();
        if (intent.hasExtra(MainActivity.SEND_TOP))
            this.top = (Gitfit) intent.getSerializableExtra(MainActivity.SEND_TOP);


    }

    public void addRecipe(View view) {
        try {
            String name = "";
            String description = "";

            EditText editText = (EditText) findViewById(R.id.name_recipe);
            name = editText.getText().toString();

            editText = (EditText) findViewById(R.id.description_recipe);
            description = editText.getText().toString();
            ArrayList<Ingredient> ingredients = new ArrayList<>();
            top.addRecipe(name, description,  ingredients);

            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra(MainActivity.SEND_TOP, top);
            startActivity(intent);
        } catch (Exception e) {
            Context context = getApplicationContext();
            CharSequence text = "Failed to add recipe.";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, e.getMessage(), duration);
            toast.show();

        }
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, CreateFoodActivity.class);
        intent.putExtra(MainActivity.SEND_TOP, top);
        startActivity(intent);
    }


}
