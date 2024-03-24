package com.cydeo.tasks;

public class OddPredicate implements UnaryPredicate<Integer>{


    @Override
    public boolean test(Integer ojb) {
        return ojb %2!=0;
    }
}
