package com.codurance.bowling_calculator;

public class BowlingCalculator {

    public int calculateTry(String pinsScored) {
        if (pinsScored.equals("-")) {
            return 0;
        }
        return Integer.parseInt(pinsScored);
    }

    public int calculateFrame(String frame) {
        String[] rolls = frame.split("");
        int sum = 0;

        if (rolls[1].equals("/")) {
            return 10 + calculateTry(rolls[3]);
        }

        for (String singleRoll : rolls) {
            sum += calculateTry(singleRoll);
        }
        return sum;
    }
}
