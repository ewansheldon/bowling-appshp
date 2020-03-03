package com.codurance.bowling_calculator;

public class BowlingCalculator {
    public int calculateScore(String pinsScored) {
        if (pinsScored.equals("-")) return 0;
        return Integer.parseInt(pinsScored);
    }
}
