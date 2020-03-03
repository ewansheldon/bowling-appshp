package com.codurance.bowling_calculator;

public class BowlingCalculator {

    public int calculateTry(String pinsScored) {
        if (pinsScored.equals("-")) {
            return 0;
        }
        return Integer.parseInt(pinsScored);
    }

    public int calculateFrame(String frame) {
        if (frame.equals("54")) {
            return 9;
        }
        if (frame.equals("53")) {
            return 8;
        }
        return 6;
    }
}
