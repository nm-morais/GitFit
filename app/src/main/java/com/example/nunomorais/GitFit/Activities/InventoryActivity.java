package com.example.nunomorais.GitFit.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.nunomorais.GitFit.Gitfit;
import com.example.nunomorais.GitFit.R;

import java.io.Serializable;
import java.util.List;

public class InventoryActivity extends AppCompatActivity implements Serializable {


    Gitfit top;

    private List<String> all_food;

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
        ArrayAdapter adapter = new ArrayAdapter(InventoryActivity.this, android.R.layout.simple_list_item_1, all_food);
        lpIngredient.setAdapter(adapter);

    }

    public void createFood(View view) {
        Intent intent = new Intent(this, CreateFoodActivity.class);
        intent.putExtra(MainActivity.SEND_TOP, top);

        startActivity(intent);


    }


}
