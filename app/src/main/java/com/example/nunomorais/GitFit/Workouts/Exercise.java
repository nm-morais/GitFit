package com.example.nunomorais.GitFit.Workouts;


public abstract class Exercise {
    private String name;

    public Exercise(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
