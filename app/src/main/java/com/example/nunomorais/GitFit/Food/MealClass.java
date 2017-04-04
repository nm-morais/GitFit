package com.example.nunomorais.GitFit.Food;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/**
 * Created by messuped on 3/25/17.
 */

public class MealClass implements Serializable {

    private List<Food> foods;
    private int cal, carbs, protein, fat;
    private String name;

    public MealClass(List<Food> food_Interface_list, String name) {
        this.name = name;
        this.foods = food_Interface_list;

        Iterator<Food> it = food_Interface_list.iterator();

        while (it.hasNext()) {
            Food fd = it.next();

            cal += fd.getCalories();
            carbs += fd.getCarbs();
            protein += fd.getProtein();
            fat += fd.getFat();
        }
    }

    public int getCal() {
        return cal;
    }

    public int getCarbs() {
        return carbs;
    }

    public int getProtein() {
        return protein;
    }

    public int getFat() {
        return fat;
    }

    public String getName() {
        return name;
    }

    public Iterator<Food> getFood() {
        return foods.iterator();
    }

    public void addFood(Food food) {
        this.foods.add(food);
    }
}
