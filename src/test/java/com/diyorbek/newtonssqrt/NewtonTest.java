package com.diyorbek.newtonssqrt;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class NewtonTest {
    @Test
    void shouldReadNumber1() {
        Newton newton = new Newton();
        double result = newton.squareRoot(1, 0.00001);
        assertEquals(1, result);
    }
    @Test
    void ifGuessNumberIsNegative() {
        Newton newton = new Newton();
        double result = newton.squareRoot(-1, 0.00001);
        assertEquals(0, result);
    }
    @Test
    void shouldReadNumber36() {
        Newton newton = new Newton();
        double result = newton.squareRoot(36, 0.00001);
        assertEquals(6.0, result);
    }
    @Test
    void shouldReadNumber4() {
        Newton newton = new Newton();
        double result = newton.squareRoot(4, 0.00001);
        assertEquals(2, result);
    }
    @Test
    void shouldReadNumber9() {
        Newton newton = new Newton();
        double result = newton.squareRoot(9, 0.00001);
        assertEquals(3, result);
    }
    @Test
    void shouldReadNumber16() {
        Newton newton = new Newton();
        double result = newton.squareRoot(16, 0.00001);
        assertEquals(4, result);
    }
    @Test
    void shouldReadNumber427() {
        Newton newton = new Newton();
        double result = newton.squareRoot(427, 0.00001);
        assertEquals(20.7, result);
    }
    @Test
    void ifNumberIsNull() {
        Newton newton = new Newton();
        double result = newton.squareRoot(0, 0.00001);
        assertEquals(0, result);
    }
}
