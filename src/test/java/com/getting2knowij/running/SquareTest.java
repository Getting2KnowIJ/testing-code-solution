package com.getting2knowij.running;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareTest {
    @Test
    void shouldBeAbleToSetAndReadALabelForTheSquare() {
        Square square = new Square("Square for testing");

        assertEquals("Square for testing", square.getLabel());
    }

}