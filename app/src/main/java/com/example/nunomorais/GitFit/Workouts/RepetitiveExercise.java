package com.example.nunomorais.GitFit.Workouts;


public class RepetitiveExercise extends Exercise {
    private int reps, sets;

    public RepetitiveExercise(String name, int reps, int sets) {
        super(name);
        this.reps = reps;
        this.sets = sets;
    }
}
