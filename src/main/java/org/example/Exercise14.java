package org.example;

import java.util.Scanner;

public class Exercise14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers: ");
        for(int i = 0; i < numbers.length; i++)
            numbers[i] = sc.nextInt();

        int[] distinctNumbers = eliminatesDuplicates(numbers);
        System.out.print("The distinct numbers are:");
        for (int e: distinctNumbers) {
            if (e > 0)
                System.out.print(" " + e);
        }
        System.out.println();
    }
    private static int[] eliminatesDuplicates(int[] numbers) {
        int[] distinctList = new int[numbers.length];
        int i = 0;
        for(int e: numbers) {
            if(linearSearch(distinctList, e) == -1) {
                distinctList[i] = e;
            }
            }
        return distinctList;
        }

    private static int linearSearch(int[] distinctList, int e) {
        for(int i = 0; i < distinctList.length; i++) {
            if(e == distinctList[i])
                return i;
        }
        return -1;
    }

}
