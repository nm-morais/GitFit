package com.example.nunomorais.GitFit.Workouts;

public interface CardioExercise {

    /**
     * returrns the duration of the exercise
     *
     * @return integer duration
     */
    int getDuration();


    /**
     * sets the duration to the desired amount
     *
     * @param duration the duration that the user has done the exercise for
     */
    void setDuration(int duration);


}
