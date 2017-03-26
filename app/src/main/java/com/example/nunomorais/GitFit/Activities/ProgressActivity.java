package com.example.nunomorais.GitFit.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.nunomorais.GitFit.Gitfit;
import com.example.nunomorais.GitFit.R;

public class ProgressActivity extends AppCompatActivity {

    Gitfit top;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);

        Intent intent = getIntent();
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, CreateFoodActivity.class);
        intent.putExtra(MainActivity.SEND_TOP, top);
        startActivity(intent);
    }


}
