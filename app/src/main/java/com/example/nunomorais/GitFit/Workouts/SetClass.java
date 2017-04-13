package com.example.nunomorais.GitFit.Workouts;

public class SetClass implements Set {

    private int weight, reps;
    private Exercise exercise;

    public SetClass(int reps, int weight, Exercise exercise) {

        this.weight = weight;
        this.exercise = exercise;
        this.reps = reps;

    }


    @Override
    public int getWeight() {
        return this.weight;
    }

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public Exercise getExercise() {
        return this.exercise;
    }

    @Override
    public int getReps() {
        return this.reps;
    }

    @Override
    public void setReps(int rep) {
        this.reps = reps;
    }
}
