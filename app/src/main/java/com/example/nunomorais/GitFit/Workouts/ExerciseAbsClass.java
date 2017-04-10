package com.example.nunomorais.GitFit.Workouts;


public abstract class ExerciseAbsClass implements Exercise {


    // the name of the exercise
    private String name;


    public ExerciseAbsClass(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}