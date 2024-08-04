package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] countOccurences = new int[100];
        System.out.println("Enter number between 1 and 100");

        int numbers = scanner.nextInt();

        while(numbers !=0){
            countOccurences[numbers]++;
            numbers= scanner.nextInt();

        }
        for(int i = 0; i < countOccurences.length; i++) {
            if(countOccurences[i] !=0) {
                System.out.println((i + 1) + " occurs " + countOccurences[i] + (countOccurences[i] > 1 ? " times ": " time "));
            }
        }
    }
}