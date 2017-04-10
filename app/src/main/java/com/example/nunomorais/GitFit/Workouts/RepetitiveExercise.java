package com.example.nunomorais.GitFit.Workouts;

import java.util.Iterator;

interface RepetitiveExercise {


    Set createSet(int reps, int weight);

    Set deleteSet(int setNumber);

    Set setRepsToSet(int reps);

    Iterator<Set> getSets();


}
