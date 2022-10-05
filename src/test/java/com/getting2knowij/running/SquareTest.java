package com.getting2knowij.running;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareTest {
    @Test
    void shouldBeAbleToSetALabelForASquare() {
        Square square = new Square("Square for testing");

        assertEquals("Square for testing", square.getLabel());
    }

    @Test
    void shouldIncludeNumberOfSidesAndLabelInToString() {
        Square square = new Square("Square for testing");

        String actualToString = square.toString();

        assertEquals("Square{sides=4, label='Square for testing'}", actualToString);
    }
}