package com.assignment.data;

public class Rectangle {
    private final int breadth;
    private final int length;

    public Rectangle() {
        this.breadth = 0;
        this.length = 0;
    }

    public Rectangle(int breadth) {
        this.breadth = breadth;
        this.length = breadth;
    }

    public Rectangle(int breadth, int length) {
        this.breadth = breadth;
        this.length = length;
    }

    public int getArea() {
        return length * breadth;
    }

    @Override
    public String toString() {
        return "Breadth: " + breadth + " length: " + length;
    }
}
