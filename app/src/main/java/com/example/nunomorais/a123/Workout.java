package com.example.nunomorais.a123;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by messuped on 3/25/17.
 */

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
