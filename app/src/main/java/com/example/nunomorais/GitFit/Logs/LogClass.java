package com.example.nunomorais.GitFit.Logs;

import com.example.nunomorais.GitFit.Food.FoodClass;
import com.example.nunomorais.GitFit.Food.MealClass;
import com.example.nunomorais.GitFit.Workouts.ExerciseClass;
import com.example.nunomorais.GitFit.Workouts.WorkoutClass;

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class LogClass implements Log {

    private static final int DEFAULT_CAL = 0;

    private List<MealClass> mealClasses;
    private List<ExerciseClass> exercises;
    private List<WorkoutClass> workoutClasses;
    private int spentCal;
    private Date date;

    public LogClass(Date d) {

        mealClasses = new LinkedList<MealClass>();
        exercises = new LinkedList<ExerciseClass>();
        workoutClasses = new LinkedList<WorkoutClass>();
        spentCal = DEFAULT_CAL;
        date = d;
    }

    @Override
    public Iterator<MealClass> getMealClasses() {
        return mealClasses.iterator();
    }

    @Override
    public Iterator<ExerciseClass> getExercises() {
        return exercises.iterator();
    }

    @Override
    public int getSpentCal() {
        return spentCal;
    }

    @Override
    public Date getDate() {
        return date;
    }

    @Override
    public void addMeal(MealClass m) {
        mealClasses.add(m);
    }

    @Override
    public void addFoodToMeal(MealClass mealClass, FoodClass foodClass) {
        mealClass.addFood(foodClass);
    }

    @Override
    public void addWorkout(String type) {

    }
}
