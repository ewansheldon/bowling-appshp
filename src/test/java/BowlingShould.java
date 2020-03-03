import static org.junit.jupiter.api.Assertions.assertEquals;

import com.codurance.bowling_calculator.BowlingCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BowlingShould {

    private BowlingCalculator bowling;

    @BeforeEach
    void setUp() {
        bowling = new BowlingCalculator();
    }

    @Test
    void return_0_when_no_pins_scored() {
        int score = bowling.calculateTry("-");
        assertEquals(0, score);
    }

    @Test
    void return_1_when_1_pin_scored() {
        int score = bowling.calculateTry("1");
        assertEquals(1, score);
    }

    @Test
    void return_2_when_2_pins_scored() {
        int score = bowling.calculateTry("2");
        assertEquals(2, score);
    }

    @Test
    void return_3_when_3_pins_scored() {
        int score = bowling.calculateTry("3");
        assertEquals(3, score);
    }

    @Test
    public void return_6_when_3_and_3_pins_are_scored_in_a_single_frame() {
        int score = bowling.calculateFrame("33");
        assertEquals(6, score);
    }

    @Test
    public void return_8_when_5_and_3_pins_are_scored_in_a_single_frame() {
        int score = bowling.calculateFrame("53");
        assertEquals(8, score);
    }

    @Test
    public void return_9_when_5_and_4_pins_are_scored_in_a_single_frame() {
        int score = bowling.calculateFrame("54");
        assertEquals(9, score);
    }

    @Test
    public void return_7_when_7_and_0_pins_are_scored_in_a_single_frame() {
        int score = bowling.calculateFrame("7-");
        assertEquals(7, score);
    }

    @Test
    public void return_16_when_spare_and_6_pins_scored_on_next_try() {
        int score = bowling.calculateFrame("3/|6");
        assertEquals(16, score);
    }

    @Test
    public void return_19_when_spare_and_9_pins_scored_on_next_frame() {
        int score = bowling.calculateFrame("3/|9");
        assertEquals(19, score);
    }

    @Test
    public void return_10_when_spare_and_0pins_scored_on_next_frame() {
        int score = bowling.calculateFrame("9/|-");
        assertEquals(10, score);
    }

    @Test
    public void return_10_when_strike_and_0_pins_scored_on_next_frame() {
        int score = bowling.calculateFrame("X|--");
        assertEquals(10, score);
    }

}
