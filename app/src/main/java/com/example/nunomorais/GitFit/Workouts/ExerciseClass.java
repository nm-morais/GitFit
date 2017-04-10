package com.example.nunomorais.GitFit.Workouts;


public abstract class ExerciseClass implements Exercise {


    // the name of the exercise
    private String name;


    public ExerciseClass(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}