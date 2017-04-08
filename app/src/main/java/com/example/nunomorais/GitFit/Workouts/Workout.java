package com.example.nunomorais.GitFit.Workouts;

import java.util.LinkedList;
import java.util.List;


public class Workout {
    private List<Exercise> exercises;
    String name;

    public Workout(String name){
        this.name = name;
        exercises = new LinkedList<>();
    }

    public void addExerciseToWorkout(Exercise e){
        exercises.add(e);
    }
}
