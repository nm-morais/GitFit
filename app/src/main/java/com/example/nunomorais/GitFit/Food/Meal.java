package com.example.nunomorais.GitFit.Food;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/**
 * Created by messuped on 3/25/17.
 */

public class Meal implements Serializable {

    private List<Food> food_list;
    private int cal, carbs, protein, fat;
    private String name;

    public Meal(List<Food> food_list, String name) {
        this.name = name;
        this.food_list = food_list;

        Iterator<Food> it = food_list.iterator();

        while (it.hasNext()) {
            Food fd = it.next();

            cal += fd.getCalories();
            carbs += fd.getCarbs();
            protein += fd.getProteins();
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
        return food_list.iterator();
    }

    public void addFood(Food food) {
        this.food_list.add(food);
    }
}
