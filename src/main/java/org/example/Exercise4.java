package org.example;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[100];
        int count = 0;
        System.out.println("Enter values between 1 and 100(Enter a negative number to end input): ");

        int num;
        int numberofScores;
        int average;
        numberofScores = average = 0;
        for (int i = 0; i < 100; ++i) {
            num = scanner.nextInt();
            if (num < 0)
                break;

            scores[i] = num;
            average += num;
            numberofScores++;

        }
        average /= numberofScores;
        int aboveOrEqual;
        int below;
        aboveOrEqual = below = 0;
        for (int i = 0; i < numberofScores; ++i) {
            if (scores[i] >= average)
                aboveOrEqual++;
            else
                below++;

            }
            System.out.println("\nAverage of scores: " + average);
            System.out.println("Number of scores above or equal to average: " + aboveOrEqual);
            System.out.println("Number of scores below average: " + below);

        }
    }
