package com.assignment;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question8();
        question10();
    }

    public static void question1() {
        // 1. Write a program to print an array populated by user.
        System.out.println("Enter the size of array and then elements: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr) + "\n");
    }

    public static void question2() {
        // 2. Write a program to calculate average of array.
        System.out.println("Enter the size of array and then elements: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int total = 0;

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
            total += arr[i];
        }
        System.out.println(Arrays.toString(arr) + " average: " + total / size + "\n");
    }

    public static void question3() {
        // 3. Search an element in an array (LInear search).
        System.out.println("Enter the size of array and then elements: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the element to search: ");
        int numToSearch = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            if (arr[i] == numToSearch) {
                System.out.println("Element found at index: " + i + "\n");
                return;
            }
        }
        System.out.println("Element is not present\n");
    }

    public static void question4() {
        // 4. Search an element in an array (Binary search).
        System.out.println("Enter the size of array and then elements in sorted manner: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the element to search: ");
        int numToSearch = scanner.nextInt();
        int left = 0, right = size - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == numToSearch) {
                System.out.println("Element found at index: " + mid + "\n");
                return;
            } else if (arr[mid] < numToSearch) left = mid + 1;
            else right = mid - 1;
        }

        System.out.println("Element is not present\n");
    }

    public static void question5() {
        // 5. Write a program to add 2 matrices of same size.
        int[][] matrixA = new int[][]{{2, 45, 7}, {4, 8, 71}};
        int[][] matrixB = new int[][]{{1, 87, 35}, {0, 8, 3}};
        int[][] result = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        System.out.println("matrixA | matrixB | Sum");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.print(" | ");
            for (int j = 0; j < 3; j++) {
                System.out.print(matrixB[i][j] + " ");
            }
            System.out.print(" | ");
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void question6() {
        // 6. Write a program to find 2 elements in an array that sum up to a target
        int[] arr = new int[]{1, 2, 4, 5, 6};
        System.out.println(Arrays.toString(arr) + "\nEnter an amount to find 2 elements that sum up to it: ");
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();

        HashSet<Integer> map = new HashSet<>();
        for (int num : arr) {
            if (map.contains(target - num)) {
                System.out.println("Found: " + num + " and " + (target - num) + "\n");
                return;
            }
            map.add(num);
        }
        System.out.println("No pair found\n");
    }

    public static void question8() {
        // 8. Write a program to find 3rd largest element in an array
        int[] arr = new int[]{3, 67, 2, 56, 90};
        System.out.println("Array: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Third largest element: " + arr[2] + "\n");
    }

    public static void question10() {
        // 10. Write a Java program to check the equality of two arrays
        int[] arrA = new int[]{2, 45, 7};
        int[] arrB = new int[]{1, 87, 35};
        System.out.println(Arrays.toString(arrA) + " " + Arrays.toString(arrB));
        System.out.println("Are these 2 arrays equal: " + Arrays.equals(arrA, arrB));
    }
}