package com.example.nunomorais.a123.Food;

import java.util.Iterator;
import java.util.List;

/**
 * Created by messuped on 3/25/17.
 */

public class Meal {

    private List<Food> f;
    private int cal, carbs, protein, fat;
    private String type;

    public Meal(List<Food> f) {
        this.f = f;

        Iterator<Food> it = f.iterator();

        while(it.hasNext()){
            Food fd = it.next();

        }
    }


}
