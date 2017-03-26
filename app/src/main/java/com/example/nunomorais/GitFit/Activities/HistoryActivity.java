package com.example.nunomorais.GitFit.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;

import com.example.nunomorais.GitFit.Gitfit;
import com.example.nunomorais.GitFit.R;

public class HistoryActivity extends AppCompatActivity {

    Gitfit top;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        Intent intent = getIntent();

        Gitfit top = (Gitfit) intent.getSerializableExtra(MainActivity.SEND_TOP);
    }
}
