package ttd.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class CalculatorTest {
    
    @Test
    void testAverage() {
        Calculator calculator = new Calculator();

        calculator.add(1.0);
        calculator.add(3.0);
        calculator.add(1000.0);

        assertEquals(334.67, calculator.average(), .01);
    }
}
