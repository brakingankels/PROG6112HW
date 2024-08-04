package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Total Number of students: ");
        int Students = scanner.nextInt();
        int[] scores = new int[Students];

        for (int i = 0; i < Students; i++) {
            System.out.println("Enter student marks for student " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
        }

        int bestscore = scores[0];
        for (int j : scores) {
            if (j > bestscore) {
                bestscore = j;
            }
        }

        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];
            char grade;
            if (score >= bestscore - 10) {
                grade = 'A';
            } else if (score >= bestscore - 20) {
                grade = 'B';
            } else if (score >= bestscore - 30) {
                grade = 'C';
            } else if (score >= bestscore - 40) {
                grade = 'D';
            } else {
                grade = 'F';
            }
            System.out.println("Student " + (i + 1) + " score is " + score + " and grade is " + grade);
        }
    }
}
