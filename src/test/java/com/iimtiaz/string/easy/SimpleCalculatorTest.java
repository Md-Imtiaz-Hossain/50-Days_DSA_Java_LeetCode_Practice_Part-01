package com.iimtiaz.string.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void testAdditionWithPositiveNumbers() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();

        int a = 2, b = 2, sum = a + b;
        assertEquals(sum, simpleCalculator.add(a, b));
    }

    @Test
    void testAdditionWithNegativeNumbers() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();

        int a = -2, b = -3, sum = a + b;
        assertEquals(sum, simpleCalculator.add(a, b));
    }

    @Test
    void testAdditionWithZero() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();

        int a = 5, b = 0, sum = a + b;
        assertEquals(sum, simpleCalculator.add(a, b));
    }

    @Test
    void testAdditionWithNegative() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();

        int a = 5, b = -5, sum = a + b;
        assertThrows(IllegalArgumentException.class,
                () -> {
                    simpleCalculator.add(a, b);
                });
    }
}