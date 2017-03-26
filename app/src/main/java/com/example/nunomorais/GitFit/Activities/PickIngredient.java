package com.example.nunomorais.GitFit.Activities;

import android.support.v7.app.AppCompatActivity;

import com.example.nunomorais.GitFit.Gitfit;

import java.util.List;

public class PickIngredient extends AppCompatActivity {

    Gitfit top;

    private List<String> all_recipes;
/**
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        all_food = null;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory);
        Intent intent = getIntent();
        if (intent.hasExtra(MainActivity.SEND_TOP))
            top = (Gitfit) intent.getSerializableExtra(MainActivity.SEND_TOP);

        all_food = top.getInventory();

        ListView lpIngredient = (ListView) findViewById(R.id.lpIngredient);
        ArrayAdapter adapter = new ArrayAdapter(AppCompatActivity.this, android.R.layout.simple_list_item_1, all_food);
        lpIngredient.setAdapter(adapter);

    }



    }
    */
}
