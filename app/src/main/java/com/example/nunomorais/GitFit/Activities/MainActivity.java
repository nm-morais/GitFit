package com.example.nunomorais.GitFit.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.nunomorais.GitFit.Gitfit;
import com.example.nunomorais.GitFit.R;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class MainActivity extends AppCompatActivity {

    public static final String SEND_TOP = "com.example.GitFit.TOP";

    Gitfit top;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();

        //Gitfit top = (Gitfit) loadSerializedObject(new File("/data/save.bin"));

        if (intent.hasExtra(SEND_TOP))
            this.top = (Gitfit) intent.getSerializableExtra(MainActivity.SEND_TOP);



        if (top == null) {
            top = new Gitfit();

        /**    if (top.getUser() == null) {
                intent = new Intent(this, UserActivity.class);
                intent.putExtra(SEND_TOP, top);
                startActivity(intent);
            }
         */
        }
    }



    public void logButton(View view) {
        Intent intent = new Intent(this, LogActivity.class);
        intent.putExtra(SEND_TOP, top);
        startActivity(intent);
    }

    public void inventaryButton(View view) {
        Intent intent = new Intent(this, InventoryActivity.class);
        intent.putExtra(SEND_TOP, top);
        startActivity(intent);
    }

    public void recipesButton(View view) {
        Intent intent = new Intent(this, RecipesActivity.class);
        intent.putExtra(SEND_TOP, top);
        startActivity(intent);
    }

    public void progressButton(View view) {
        Intent intent = new Intent(this, ProgressActivity.class);
        intent.putExtra(SEND_TOP, top);
        startActivity(intent);
    }

    public void historyButton(View view) {
        Intent intent = new Intent(this, HistoryActivity.class);
        intent.putExtra(SEND_TOP, top);
        startActivity(intent);
    }

    public void userButton(View view) {
        Intent intent = new Intent(this, UserActivity.class);
        intent.putExtra(SEND_TOP, top);
        startActivity(intent);

    }
    public Object loadSerializedObject(File f)
    {
        try
        {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
            Object o = ois.readObject();
            return o;
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return null;
    }

}
