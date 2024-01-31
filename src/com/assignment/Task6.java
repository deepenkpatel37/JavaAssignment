package com.assignment;

import com.assignment.data.*;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
    }

    public static void question1() {
        Student amay = new Student("Amay", 132);
        System.out.println(amay + "\n");
    }

    public static void question2() {
        Triangle t = new Triangle();
        System.out.println("Perimeter and area of triangle with side 3,4,5: " + t.getPerimeter() + ", " + t.getArea() + "\n");
    }

    public static void question3() {
        Employee robert = new Employee("Robert", 1994, 150000, "64C- Walls Street");
        Employee sam = new Employee("Sam", 2000, 100000, "68D- Walls Street");
        Employee john = new Employee("John", 1999, 120000, "26B- Walls Street");

        System.out.println("---------------------------------------------------------");
        System.out.println("|  Name  | Year of joining | salary |       address     |");
        System.out.println("---------------------------------------------------------");
        System.out.println("| " + robert.getName() + " |      " + robert.getYearOfJoining() + "       | " + robert.getSalary() + " | " + robert.getAddress() + " | ");
        System.out.println("|  " + sam.getName() + "   |      " + sam.getYearOfJoining() + "       | " + sam.getSalary() + " | " + sam.getAddress() + " | ");
        System.out.println("|  " + john.getName() + "  |      " + john.getYearOfJoining() + "       | " + john.getSalary() + " | " + john.getAddress() + " | ");
        System.out.println("---------------------------------------------------------\n");
    }

    public static void question4() {
        Student deepen = new Student("Deepen", 1234);
        Student john = new Student(4321);

        System.out.println(deepen);
        System.out.println(john + "\n");
    }

    public static void question5() {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(10, 12);
        Rectangle r3 = new Rectangle(5);

        System.out.println(r1 + " Area: " + r1.getArea());
        System.out.println(r2 + " Area: " + r2.getArea());
        System.out.println(r3 + " Area: " + r3.getArea() + "\n");
    }

    public static void question6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two complex numbers");
        System.out.println("Real part of first number: ");
        int real1 = scanner.nextInt();
        System.out.println("Imaginary part of first number: ");
        int imaginary1 = scanner.nextInt();

        System.out.println("Real part of second number: ");
        int real2 = scanner.nextInt();
        System.out.println("Imaginary part of second number: ");
        int imaginary2 = scanner.nextInt();

        Complex c1 = new Complex(real1, imaginary1);
        Complex c2 = new Complex(real2, imaginary2);

        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println("c1 + c2: " + c1.add(c2));
        System.out.println("c1 - c2: " + c1.subtract(c2));
        System.out.println("c1 * c2: " + c1.multiply(c2));
    }
}