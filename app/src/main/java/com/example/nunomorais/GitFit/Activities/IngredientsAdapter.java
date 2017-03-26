package com.example.nunomorais.GitFit.Activities;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.nunomorais.GitFit.Food.Food;
import com.example.nunomorais.GitFit.R;

import java.util.List;

/**
 * Created by nunomorais on 26/03/2017.
 */

public class IngredientsAdapter extends BaseAdapter {

    List<Food> foods ;
    private Context mContext;


    public IngredientsAdapter(Context context, List<Food> foods) {
        mContext = context;
        this.foods = foods;
    }

    @Override
    public int getCount() {
        return foods.size();
    }

    @Override
    public Object getItem(int position) {
        return foods.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = View.inflate(mContext,R.layout.ingredients_list,null);

        Food food = (Food) getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view
        // Lookup view for data population
        TextView Name = (TextView) convertView.findViewById(R.id.name);
        TextView Calories = (TextView) convertView.findViewById(R.id.cal);
        // Populate the data into the template view using the data object
        Name.setText(food.getCalories());
        Calories.setText(food.getName());
        // Return the completed view to render on screen

        v.setTag(foods.get(position).getName());


        return v;
    }
}