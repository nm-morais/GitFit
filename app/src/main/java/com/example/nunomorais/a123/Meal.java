package com.example.nunomorais.a123;

/**
 * Created by messuped on 3/25/17.
 */

public class Meal {

    private Food f;
    private int cal, carbs, protein, fat;
    private String type;

    public Meal (Food f, int cal, int carbs, int protein, int fat, String type){
        this.f = f;
        this.cal = cal;
        this.carbs = carbs;
        this.protein = protein;
        this.fat = fat;
        this.type = type;
    }

    public Food getF() {
        return f;
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

    public String getType() {
        return type;
    }
}
