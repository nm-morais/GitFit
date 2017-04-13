package com.example.nunomorais.GitFit.Workouts;

import java.util.Iterator;

interface RepetitiveExercise extends Exercise {


    /**
     * creates a new set to add to the exercise
     *
     * @param reps   the ammount of reps that was done with the exercise
     * @param weight the weight that has been done in the set
     * @return
     */
    Set createSet(int reps, int weight);

    /**
     * deletes a set from the collection
     * @param setNumber in setNumber
     * @return the deleted set
     */
    Set deleteSet(int setNumber);

    /**
     * edits the reps the user has done in the set
     *
     * @param reps      the new amount of reps
     * @param setNumber the set number
     * @return the changed set
     */
    Set setRepsToSet(int reps, int setNumber);


    /**
     * returns an iterator of all the sets that has been dine of this type of exercise
     * @return Object iterator
     */
    Iterator<Set> getSets();


    /**
     * changes the weight that has been done in the set
     *
     * @param setNumber the set number
     * @param weight    the weight to change it to
     * @return the changed set
     */
    Set setWeightToSep(int setNumber,int weight);


}
