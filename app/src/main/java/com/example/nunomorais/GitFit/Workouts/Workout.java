package com.example.nunomorais.GitFit.Workouts;


import java.util.Iterator;

//TODO if a user inserts a new exercise with the number 5 and there is an exercise with the number 5
//TODO the old exercise must go to 6 and so on.
//todo implement a comparator, and fix collisions
//todo implement a way for the user to reorder the exercises, as order is important in a workout

interface Workout {


    /**
     * adds a new exercise to the workout
     *
     * @param e               Object exercise
     * @param exercise_number relevant to the order.
     */
    void addExerciseToWorkout(Exercise e, int exercise_number);

    /**
     * iterates through all th exercises in the workout
     *
     * @return Object Iterator
     */
    Iterator<Exercise> getAllExercises();


    /**
     * returns the exercise with the key equal to the inserteg number
     * the exercises are sorted by key so that the user can define the order
     *
     * @param exercise_number the number of the exercise (for order)
     * @return Object Exercise
     */
    Exercise getExercise (int exercise_number);

}
