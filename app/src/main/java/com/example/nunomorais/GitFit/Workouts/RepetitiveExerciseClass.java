package com.example.nunomorais.GitFit.Workouts;


import java.util.Iterator;
import java.util.SortedMap;
import java.util.TreeMap;

public class RepetitiveExerciseClass extends ExerciseAbsClass implements RepetitiveExercise {

    private SortedMap<Integer, Set> sets;
    private int setCounter;

    public RepetitiveExerciseClass(String name) {
        super(name);
        this.sets = new TreeMap<Integer, Set>();
        this.setCounter = 0;
    }


    @Override
    public Set createSet(int reps, int weight) {
        Set new_set = new SetClass(reps, weight, this);
        sets.put(setCounter++, new_set);
        return new_set;
    }

    @Override
    public Set deleteSet(int setNumber) {
        return sets.remove(setNumber);
    }

    @Override
    public Set setRepsToSet(int reps, int setNumber) {
        Set set = sets.get(setNumber);
        set.setReps(reps);
        return set;
    }

    @Override
    public Iterator<Set> getSets() {
        return sets.values().iterator();
    }
}
