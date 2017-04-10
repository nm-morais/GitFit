package com.example.nunomorais.GitFit.Workouts;


public class RepetitiveExerciseClass extends ExerciseClass implements RepetitiveExercise {

    private int sets;

    public RepetitiveExerciseClass(String name, int reps) {
        super(name);
        this.reps = reps;
    }


    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    private int reps;

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }


}
