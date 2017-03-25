package com.example.nunomorais.a123.Food;

import java.util.Iterator;
import java.util.List;

/**
 * Created by messuped on 3/25/17.
 */

public class Meal {

    private List<Food> f;
    private int cal, carbs, protein, fat;
    private String name;

    public Meal(List<Food> f, String name) {
        this.name = name;
        this.f = f;

        Iterator<Food> it = f.iterator();

        while(it.hasNext()){
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

    public Iterator<Food> getFood(){
        return f.iterator();
    }
}
