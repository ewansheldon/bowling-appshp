import com.codurance.bowling_calculator.BowlingCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingShould {
    @Test
    void return_0_when_no_pins_scored() {
        BowlingCalculator bowling = new BowlingCalculator();
        int score = bowling.calculateScore("-");
        assertEquals(0, score);
    }

    @Test
    void return_1_when_1_pin_scored() {
        BowlingCalculator bowling = new BowlingCalculator();
        int score = bowling.calculateScore("1");
        assertEquals(1, score);
    }
}
