package com.example.nunomorais.GitFit.Logs;

import com.example.nunomorais.GitFit.Food.FoodClass;
import com.example.nunomorais.GitFit.Food.MealClass;
import com.example.nunomorais.GitFit.Workouts.Exercise;

import java.io.Serializable;
import java.util.Date;
import java.util.Iterator;

interface Log extends Serializable {


    Iterator<MealClass> getMealClasses();

    Iterator<Exercise> getExercises();

    int getSpentCal();

    Date getDate();

    void addMeal(MealClass m);

    void addFoodToMeal(MealClass mealClass, FoodClass foodClass);

    void addWorkout(String type);
}
