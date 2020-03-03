package com.codurance.bowling_calculator;

public class BowlingCalculator {

    public static final String SPARE = "/";

    public int calculateTry(String pinsScored) {
        if (pinsScored.equals("-")) {
            return 0;
        }
        return Integer.parseInt(pinsScored);
    }

    public int calculateFrame(String frame) {
        String[] rolls = frame.split("");

        int sum = 0;
        for (int currentTry = 0; currentTry < rolls.length; currentTry++) {
            if (rolls[currentTry].equals("X")) {
                return 10 + calculateTry(rolls[currentTry + 2]) + calculateTry(
                    rolls[currentTry + 3]);
            }
            if (rolls[currentTry].equals(SPARE)) {
                return 10 + calculateTry(rolls[currentTry + 2]);
            }
            sum += calculateTry(rolls[currentTry]);
        }
        return sum;
    }
}
