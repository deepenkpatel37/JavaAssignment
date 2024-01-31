package com.assignment.data;

public class Triangle {
    private final int side1 = 3;
    private final int side2 = 4;
    private final int side3 = 5;
    public Triangle() {}

    public int getPerimeter(){
        return side1 + side2 + side3;
    }
    public double getArea() {
        float semiPerimeter = (float) getPerimeter() / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
    }

}
