package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SumCalculatorTest{
    private SumCalculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new SumCalculator();
    }

    @Test
    public void testSumWith1() {
        assertEquals(1, calculator.sum(1));
    }

    @Test
    public void testSumWith3() {
        assertEquals(6, calculator.sum(3));
    }

    @Test
    public void testSumWithZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.sum(0));
    }

}