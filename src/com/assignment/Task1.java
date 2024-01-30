package com.assignment;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        question1();
        question2();
        question3();
        question4();
        question5();
    }

    public static void question1() {
        // 1. Print your name using a pre-defined variable.
        String predefinedVariable = "PredefinedString";
        System.out.println("PredefinedVariable: " + predefinedVariable + "\n");
    }

    public static void question2() {
        // 2. Take the user's name as input and print it to the console.
        System.out.println("Please enter your name");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println("User's name is: " + input + "\n");
    }

    public static void question3() {
        // 3. Swap two numbers using the third variable as the result name and do the same task without using any third variable.
        int a = 1, b = 2;
        System.out.println("a = " + a + " b = " + b + "\nAfter swapping:");
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a + " b = " + b);

        System.out.println("Swapping values without temp variable: ");
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping: a = " + a + " b = " + b + "\n");
    }

    public static void question4() {
        // 4. Write a program to add two numbers.
        System.out.println("Enter two numbers to add:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Sum: " + (a + b) + "\n");
    }

    public static void question5(){
        System.out.println("Enter radius of a circle:");
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        System.out.println("Area of circle: " + (3.14 * radius * radius) + "\n");
    }
}