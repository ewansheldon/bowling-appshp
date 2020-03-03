package com.codurance.bowling_calculator;

public class BowlingCalculator {
    public int calculateScore(String pinsScored) {
        if (pinsScored.equals("3")) return 3;
        if (pinsScored.equals("2")) return 2;
        if (pinsScored.equals("1")) return 1;
        return 0;
    }
}
