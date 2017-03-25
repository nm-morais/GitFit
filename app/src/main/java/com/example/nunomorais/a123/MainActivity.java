package com.example.nunomorais.a123;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

//GitFit
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void logButton(View view){
        Intent intent = new Intent(this, LogActivity.class);
        startActivity(intent);
    }

    public void inventaryButton(View view){
        Intent intent = new Intent(this, InventaryActivity.class);
        startActivity(intent);
    }

    public void recipesButton(View view){
        Intent intent = new Intent(this, RecipesActivity.class);
        startActivity(intent);
    }
}
