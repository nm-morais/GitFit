package com.example.nunomorais.a123;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by messuped on 3/25/17.
 */

public class Log {

    private static final int DEFAULT_CAL = 0;

    private List<Meal> meals;
    private int spentCal;

    public Log() {

        meals = new LinkedList<Meal>();
        spentCal = DEFAULT_CAL;
    }

    public Iterator<Meal> getMeals() {
        return meals.iterator();
    }

    public int getSpentCal() {
        return spentCal;
    }
}