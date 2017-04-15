package com.example.nunomorais.GitFit.Workouts;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

//TODO fix collisions ???
public class WorkoutClass implements Workout {


    Map<Integer, Exercise> exercises;


    public WorkoutClass() {
        this.exercises = new TreeMap<>();
    }

    @Override
    public void addExerciseToWorkout(Exercise e, int exercise_number) {
        this.exercises.put(exercise_number, e);
    }

    @Override
    public Iterator<Exercise> getAllExercises() {
        return exercises.values().iterator();
    }

    @Override
    public Exercise getExercise(int exercise_number) {
        return exercises.get(exercise_number);
    }
}