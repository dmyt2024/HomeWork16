package app.HomeWork16;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator;


    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }

    @Test
    void sum() {
        double a = 3;
        double b = 8;
        assertEquals(a + b, calculator.sum(a, b));
    }

    @Test
    void minus() {
        double a = 3;
        double b = 8;
        assertEquals(a - b, calculator.minus(a, b));
    }

    @Test
    void multiply() {
        double a = 3;
        double b = 8;
        assertEquals(a * b, calculator.multiply(a, b));
    }

    @Test
    void divideNotByZero() {
        double a = 3;
        double b = 8;
        assertEquals(a / b, calculator.divide(a, b));
    }

    @Test
    void divideByZero() {
        double a = 3;
        double b = 0;
        assertEquals(Double.NaN, calculator.divide(a, b));
    }
}