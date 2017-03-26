package com.example.nunomorais.GitFit.Logs;

import com.example.nunomorais.GitFit.Food.Food;
import com.example.nunomorais.GitFit.Food.Meal;
import com.example.nunomorais.GitFit.Workouts.Exercise;
import com.example.nunomorais.GitFit.Workouts.Workout;

import java.io.Serializable;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by messuped on 3/25/17.
 */

public class Log implements Serializable {

    private static final int DEFAULT_CAL = 0;

    private List<Meal> meals;
    private List<Exercise> exercises;
    private List<Workout> workouts;
    private int spentCal;
    private Date date;

    public Log(Date d) {

        meals = new LinkedList<Meal>();
        exercises = new LinkedList<Exercise>();
        workouts = new LinkedList<Workout>();
        spentCal = DEFAULT_CAL;
        date = d;
    }

    public Iterator<Meal> getMeals() {
        return meals.iterator();
    }

    public Iterator<Exercise> getExercises() {
        return exercises.iterator();
    }

    public int getSpentCal() {
        return spentCal;
    }

    public Date getDate() {
        return date;
    }

    public void addMeal(Meal m) {
        meals.add(m);
    }

    public void addFoodToMeal(Meal meal, Food food) {
        meal.addFood(food);
    }

    public void addWorkout(String type) {

    }
}
