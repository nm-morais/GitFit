package com.example.nunomorais.a123.Logs;

import com.example.nunomorais.a123.Food.Meal;
import com.example.nunomorais.a123.Workouts.Exercise;
import com.example.nunomorais.a123.Workouts.Workout;

import java.io.Serializable;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by messuped on 3/25/17.
 */

public class Log implements Serializable{

    private static final int DEFAULT_CAL = 0;

    private List<Meal> meals;
    private List<Exercise> exercises;
    private List<Workout> workouts;
    private int spentCal;
    private Date date;

    public Log() {

        meals = new LinkedList<Meal>();
        exercises = new LinkedList<Exercise>();
        workouts = new LinkedList<Workout>();
        spentCal = DEFAULT_CAL;
        date = new Date();
    }

    public Iterator<Meal> getMeals() {
        return meals.iterator();
    }

    public Iterator<Exercise> getExercises(){
        return exercises.iterator();
    }

    public int getSpentCal() {
        return spentCal;
    }

    public Date getDate() {
        return date;
    }

    public void addMeal(Meal m){
        meals.add(m);
    }

    public void addWorkout(String type){

    }
}
