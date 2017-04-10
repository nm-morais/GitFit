package com.example.nunomorais.GitFit.Workouts;

import java.util.LinkedList;
import java.util.List;


public class WorkoutClass implements Workout {


    private List<ExerciseClass> exercises;
    String name;

    public WorkoutClass(String name) {
        this.name = name;
        exercises = new LinkedList<>();
    }

    @Override
    public void addExerciseToWorkout(ExerciseClass e) {
        exercises.add(e);
    }
}
