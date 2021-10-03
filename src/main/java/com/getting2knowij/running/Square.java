package com.getting2knowij.running;

public class Square {
    private final int sides = 4;
    private final String label;

    public Square(String label) {
        this.label = label;
    }

    public int getSides() {
        return sides;
    }

    @Override
    public String toString() {
        String str = "Square{" +
                "sides=" + sides +
                ", label='" + sides + '\'' +
                '}';
        return str;
    }
}
