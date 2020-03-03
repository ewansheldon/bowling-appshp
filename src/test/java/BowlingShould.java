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
    }        BowlingCalculator bowling = new BowlingCalculator();

        BowlingCalculator bowling = new BowlingCalculator();

        BowlingCalculator bowling = new BowlingCalculator();

        BowlingCalculator bowling = new BowlingCalculator();


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
    public void return_6_when_6_pins_are_scored_in_a_single_frame() {
        int score = bowling.calculateFrame("33");
        assertEquals(6, score);
    }

}
