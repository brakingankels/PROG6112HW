package org.example;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        String[] students = new String[sc.nextInt()];
        int[] scores = new int[students.length];

        System.out.println("Enter the name a score for each student: ");
        for(int i = 0; i < students.length; i++) {
            System.out.println("Student " + (i + 1) + ": ");
            students[i] = sc.next();
            System.out.println("Score: ");
            scores[i] = sc.nextInt();
        }
        sortDecreasing(students, scores);
        for(String c : students) {
            System.out.println(c);
        }
    }
    public static void sortDecreasing(String[] strs, int[] nums) {
        for(int i = 0; i < nums.length;i++) {
            int max = nums[i];
            int maxIndex = i;
            String temp;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > max) {
                    max = nums[j];
                    maxIndex = j;
                }
            }

            if (maxIndex != i) {
                // Swap string array
                temp = strs[i];
                strs[i] = strs[maxIndex];
                strs[maxIndex] = temp;

                // Swap int array
                nums[maxIndex] = nums[i];
                nums[i] = max;
            }
        }
    }
}