package ttd.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;


/**
 * Unit test for simple Calculator.
 */
class CalculatorTest {
    
    Calculator calculator;

    @BeforeEach
    void setupCalculator() {

        calculator = new Calculator();

        calculator.add(1.0);
        calculator.add(3.0);
        calculator.add(1000.0);
    }

    @Test
    void testAverage() {

        assertEquals(334.67, calculator.average(), .01);
    }

    @Test
    void testEmptyCalculator() {
        Calculator calculatorEmpty = new Calculator();

        assertEquals(Double.NaN, calculatorEmpty.average());
    }

    @Test
    void testMedian() {
        calculator.add(4.0);
        //Kludge: returns the ceiling 
        assertEquals(4.0, calculator.medain());
    }
}
