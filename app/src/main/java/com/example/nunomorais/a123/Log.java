package com.example.nunomorais.a123;

import java.util.Date;
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
    private Date date;

    public Log() {

        meals = new LinkedList<Meal>();
        spentCal = DEFAULT_CAL;
        date = new Date();
    }

    public Iterator<Meal> getMeals() {
        return meals.iterator();
    }

    public int getSpentCal() {
        return spentCal;
    }

    public Date getDate() {
        return date;
    }
}
