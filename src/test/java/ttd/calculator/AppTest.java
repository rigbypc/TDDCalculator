package ttd.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testAverage() {
        Calculator calculator;

        calculator.add(1);
        calculator.add(3);
        calculator.add(1000);

        assertEquals(334.67, calulator.average());
    }
}
