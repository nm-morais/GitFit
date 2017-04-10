package com.example.nunomorais.GitFit.Workouts;

/**
 * each set has a different weight to it,
 */
public interface Set {

    /**
     * returns the weight the user has done in this set of the exercise
     *
     * @return integer weight
     */
    int getWeight();

    /**
     * sets the weight the user has done in this set of the exercise
     */
    void setWeight(int weight);

    /**
     * returns the exercise that this set belongs to
     *
     * @return Object exercise
     */
    Exercise getExercise();


    /**
     * returns the reps of the exercisee in this set
     *
     * @return integer reps
     */
    int getReps();


    /**
     * sets the reps of this set
     */
    void setReps();


}
