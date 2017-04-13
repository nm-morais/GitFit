package com.example.nunomorais.GitFit.Workouts;

public class CardioExerciseClass extends ExerciseAbsClass implements CardioExercise {

    int duration;

    public CardioExerciseClass(String name) {
        super(name);
    }

    @Override
    public int getDuration() {
        return duration;
    }

    @Override
    public void setDuration(int duration) {

    }
}
