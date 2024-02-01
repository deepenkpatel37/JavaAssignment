package com.assignment;

import java.util.*;
import java.util.stream.Collectors;

public class Task7 {
    public static void main(String[] args){
        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question7();
        question8();
        question9();
        question10();
        question11();
    }

    public static void question1() {
        // 1. find the first non-repeated character in the String
        System.out.println("Enter a string to find first non repeating character: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        HashMap<Character, Integer> count =  new HashMap<>();
        for(char c : s.toCharArray()) count.put(c, count.getOrDefault(c,0) + 1);

        for(char c: s.toCharArray()){
            if(count.get(c) == 1) {
                System.out.println("first non repeating character: " + c + "\n");
                return;
            }
        }
        System.out.println("No non repeating character found.\n");
    }

    public static void question2() {
        // 2. find the intersection of two arrays
        int[] arr1 = new int[]{2,45,8,4,1,5,6,87};
        int[] arr2 = new int[]{58,56,2,8,23,5,23};

        Set<Integer> uniqueElementsInArr1 = Arrays.stream(arr1).boxed().collect(Collectors.toSet());
        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
        System.out.print("Array intersection: ");
        for(int num: arr2){
            if(uniqueElementsInArr1.contains(num)) System.out.print(num + " ");
        }
        System.out.println("\n");
    }

    public static void question3() {
        // 3. find if String has all Unique Characters
        System.out.println("Enter a String to check if all characters are unique: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        HashSet<Character> charSet = new HashSet<>();
        for( char c: s.toCharArray()) {
            if(charSet.contains(c)) {
                System.out.println("All characters are not unique.\n");
                return;
            }
            charSet.add(c);
        }
        System.out.println("All characters are unique\n");
    }

    public static void question4() {
        // 4. Count the number of words in the String.
        String s = "Hello World I am a Software Engineer";

        System.out.println("String: " + s + ", Number of words: " + s.split("\\s+").length+ "\n");
    }

    public static void question5() {
        // 5. check the Armstrong number
        System.out.println("Enter a number to check if it's an Armstrong number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int total = 0, length = String.valueOf(num).length(), temp = num;

        while(temp > 0) {
           int digit = temp % 10;
           total += (int) Math.pow(digit, length);
           temp /= 10;
        }

        if(total == num) System.out.println("Armstrong number\n");
        else System.out.println("Not an Armstrong number\n");
    }

    public static void question6() {
        // 6. Count occurrences of characters in a string
        System.out.println("Enter a string to count occurrences of characters: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        HashMap<Character, Integer> count =  new HashMap<>();
        for(char c : s.toCharArray()) count.put(c, count.getOrDefault(c,0) + 1);
        System.out.println(count + "\n");
    }

    public static void question7() {
        // 7. Print all permutations of the String
        System.out.println("Enter a string to print all permutations: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println("Permutations: ");
        permutate(s, 0, s.length()-1);
        System.out.println();
    }

    public static void permutate(String s, int left, int right){
        if(left == right) System.out.println(s);
        else{
            for(int i = left; i<= right; i++){
                s = swap(s, i, left);
                permutate(s, left + 1, right);
                s = swap(s, i, left);
            }
        }
    }

    public static String swap(String s, int idx1, int idx2) {
        char[] charArr = s.toCharArray();
        char temp = charArr[idx1];
        charArr[idx1] = charArr[idx2];
        charArr[idx2] = temp;
        return String.valueOf(charArr);
    }

    public static void question8(){
        int[] arr = new int[]{3,6,377,5,7,57,3,24};
        System.out.println("Array: " + Arrays.toString(arr));
        int max = Integer.MIN_VALUE;

        for(int num: arr) if(num > max) max = num;
        System.out.println("Max value: " + max + "\n");
    }

    public static void question9() {
        System.out.println("Enter a string to print all combinations: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        printCombinations(s, new StringBuilder(), 0, s.length());
        System.out.println();
    }

    public static void printCombinations(String s, StringBuilder sb, int index, int length){
        if( index >= length) {
            System.out.println(sb.toString());
            return;
        }

        printCombinations(s, sb, index+1, length);
        sb.append(s.charAt(index));
        printCombinations(s, sb, index+1, length);
        sb.deleteCharAt(sb.length()-1);
    }

    public static void question10(){
        // 10. Sort hashmap by keys
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1,14);
        map.put(5,42);
        map.put(9,64);
        map.put(2,40);
        map.put(11,20);
        map.put(10,3);
        map.put(4,5);

        List<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);
        System.out.println("Hashmap sorted on keys: ");
        for(Integer key: keys) System.out.println(key + " : " + map.get(key));

        // sort hashmap by values
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort(Comparator.comparingInt(Map.Entry::getValue));
        System.out.println("\nHashmap sorted on values: ");
        for(Map.Entry<Integer, Integer> entry: entryList){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println();
    }

    public static void question11(){
        // 11. find all the subarray whose sum is equal to the given number
        int[] arr = new int[]{4,8,3,2,7,-3,15};
        int target = 12;

        int total = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Subarrays that sum up to target = 12: ");
        for(int i = 0; i < arr.length; i++){
            total += arr[i];
            if(map.containsKey(total - target)) printSubArray(arr, map.get(total - target) + 1, i);
            map.put(total, i);
        }
    }

    public static void printSubArray(int[] arr, int start, int end){
        for(int i = start; i<= end; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
