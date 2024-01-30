package com.assignment;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        question1();
        question2();
        question3();
        question4();
        question5();
        question7();
        question8();
        question9();
    }

    public static void question1() {
        // 1. Write a program to check whether a number is positive or negative.
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("Number is: " + (num >= 0 ? "Positive" : "Negative") + "\n");
    }

    public static void question2() {
        // 2. Write a program to check whether a character is an alphabet or not.
        System.out.println("Enter a character: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println("Character is: " + ((Character.isAlphabetic(input.charAt(0))) ? "Alphabetic" : "Not Alphabetic") + "\n");
    }

    public static void question3() {
        // 3. Write a program to compute quotient and reminder
        System.out.println("Enter two numbers for division (please don't enter 0): ");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("Dividing, quotient: " + num1 / num2 + " remainder: " + num1 % num2 + "\n");
    }

    public static void question4() {
        // 4. Write a program to check whether a year is a leap year
        System.out.println("Enter a year: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        // if a year is divisible by 4 then its a leap year.
        // if a year is divisible by 100, then it has to be divisible by 400 too to be a leap year.
        if (year % 4 == 0 && (year % 100 != 0 || (year % 100 == 0 && year % 400 == 0))) {
            System.out.println("It's a leap year" + "\n");
        } else {
            System.out.println("It's not a leap year" + "\n");
        }
    }

    public static void question5() {
        // 5. Write a program to assign the grade on the basis of percentage
        System.out.println("Enter a percentage value: ");
        Scanner scanner = new Scanner(System.in);
        int percent = scanner.nextInt();
        char grade;
        if (percent > 90) grade = 'A';
        else if(percent > 75) grade = 'B';
        else grade = 'C';
        System.out.println("Grade: " + grade + "\n");
    }

    public static void question7() {
        // 7. Write a program in JAVA to break and continue based on user's input
        System.out.println("Lets play a game");
        while(true) {
            System.out.println("Enter a number: ");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            if (num < 0) {
                System.out.println("It's over" + "\n");
                break;
            } else {
                System.out.println("Good going, play again" + "\n");
            }
        }
    }

    public static void question8() {
        // 8. Calculate tax paid by an employee based on income.
        System.out.println("Enter your income: ");
        Scanner scanner = new Scanner(System.in);
        long income = scanner.nextLong();
        int taxPercent = 0;
        if (income > 1200000 ) taxPercent = 25;
        else if (income > 600000) taxPercent = 18;
        else if (income > 250000) taxPercent = 10;
        System.out.println("Your tax is: " + income * ((float)taxPercent / 100) + "\n");
    }

    public static void question9() {
        // 9. Calculate electricity bill based on units used
        System.out.println("Enter units of electricity used: ");
        Scanner scanner = new Scanner(System.in);
        int units = scanner.nextInt();

        float subtotal = 0;
        int[] levels = new int[]{60, 90, 120};
        float[] chargePerUnit = new float[]{0.3f, 0.75f, 1.1f};
        int i = 0;
        while(units > 0 && i < levels.length) {
            subtotal += Math.min(units, levels[i]) * chargePerUnit[i];
            units -= levels[i];
            i++;
        }
        if (units > 0) subtotal += units * 2.5f;
        float total = subtotal * 1.2f;
        System.out.println("Total bill is: " + total + "\n");
    }
}