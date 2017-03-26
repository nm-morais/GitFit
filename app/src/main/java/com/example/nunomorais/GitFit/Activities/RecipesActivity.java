package com.example.nunomorais.GitFit.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.nunomorais.GitFit.Gitfit;
import com.example.nunomorais.GitFit.R;

import java.util.List;

public class RecipesActivity extends AppCompatActivity {

    Gitfit top;
    private List<String> all_recipes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        all_recipes = null;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);
        Intent intent = getIntent();

        if (intent.hasExtra(MainActivity.SEND_TOP))
            top = (Gitfit) intent.getSerializableExtra(MainActivity.SEND_TOP);

        all_recipes = top.getRecipes();

        ListView lpIngredient = (ListView) findViewById(R.id.lprecipes);
        ArrayAdapter adapter = new ArrayAdapter(RecipesActivity.this, android.R.layout.simple_list_item_1, all_recipes);
        lpIngredient.setAdapter(adapter);

    }
    public void createRecipe(View view){
        Intent intent = new Intent(this, create_recipe_activity.class);
        intent.putExtra(MainActivity.SEND_TOP, top);
        startActivity(intent);

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, CreateFoodActivity.class);
        intent.putExtra(MainActivity.SEND_TOP, top);
        startActivity(intent);
    }
}
