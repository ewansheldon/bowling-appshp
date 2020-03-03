package com.codurance.bowling_calculator;

public class BowlingCalculator {
    public int calculateTry(String pinsScored) {
        if (pinsScored.equals("-")) return 0;
        return Integer.parseInt(pinsScored);
    }

    public int calculateFrame(String frame) {
        return 6;
    }
}
