package com.assignment;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        question1();
        question2();
        question3();
        question4();
        question5();
        question7();
        question8();
        question10();
    }

    public static void question1() {
        // 1. Write a program to display Fibonacci series.
        System.out.println("Enter length of fibonacci series (>0): ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        if (length <= 2) {
            System.out.println("Fibonacci series: " + (length == 1 ? " 0 \n" : " 0 1 \n"));
            return;
        }
        length -= 2;
        int first = 0, second = 1;
        System.out.print("Fibonacci series: 0 1 ");

        while (length > 0) {
            second = first + second;
            first = second - first;
            System.out.print(second + " ");
            length--;
        }
        System.out.println("\n");
    }

    public static void question2() {
        // 2. Write a program to Find Factorial of a number.
        System.out.println("Enter a number to find its factorial: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int factorial = 1;
        while (num > 1) {
            factorial *= num;
            num--;
        }
        System.out.println("Factorial: " + factorial + "\n");
    }

    public static void question3() {
        // 3. Write a program to Check Palindrome.
        System.out.println("Enter a string to check if it's a palindrome: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                System.out.println("Not a palindrome \n");
                return;
            }
            left++;
            right--;
        }
        System.out.println("Palindrome \n");
    }

    public static void question4() {
        // 4. Write a program to Check Whether a number if prime or not.
        System.out.println("Enter a number to find if it's prime or not: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.println("Not Prime \n");
                return;
            }
        }
        System.out.println("Prime \n");
    }

    public static void question5() {
        // 5. Write a program to sum first n even numbers using a while loop.
        System.out.println("Finding sum of first n even numbers, enter n : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), sum = 0;

        while (n >= 1) {
            sum += 2 * n;
            n--;
        }
        System.out.println("Sum: " + sum + "\n");
    }

    public static void question7() {
        // 7. Print the following pattern
        /*      *
               **
              ***
             ****
            *****
         */
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++)
                System.out.print(" ");
            for (int k = 1; k <= i; k++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println();
    }

    public static void question8() {
        // 8. Display the largest and smallest numbers from user's input.
        System.out.print("Lets play a game to find smallest and largest number. ");
        int largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;
        while (true) {
            System.out.println("Enter a number: ");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            largest = Math.max(largest, num);
            smallest = Math.min(smallest, num);

            System.out.println("You want to play again? Enter 'yes' to play again, and 'no' to end the game: ");
            String input = scanner.next();
            if (input.equals("no")) break;
        }
        System.out.println("Smallest: " + smallest + " Largest: " + largest + "\n");
    }

    public static void question10() {
        // 10. Print the following pattern.
        /*
             *                   *
             * * *           * * *
             * * * * *   * * * * *
             * * * * * * * * * * *
         */
        for(int i = 1; i <= 4; i++) {
            int left = 2*i - 1, spaces = Math.max(11 - 2*left, 0), right = 11 - (left + spaces);

            for(int j = 1; j <= left; j++)
                System.out.print("* ");
            for(int j = 1; j <= spaces; j++)
                System.out.print("  ");
            for(int j = 1; j <= right; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}