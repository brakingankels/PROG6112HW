package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise12 {
    static final int SIZE = 10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] counts = new int[SIZE];
        System.out.println("Enter ten number to exclude from random(1-54");
        for (int i = 0; i < counts.length; i++) counts[i] = sc.nextInt();

        System.out.println("Number generated: " + getRandom(counts));

    }

    private static String getRandom(int[] counts) {
        int random = (int)(Math.random() * 54 + 1);
        for(int i = 0; i < counts.length; i++) {
            if(random == counts[i]) {
                random = (int)(Math.random() *54+1 );
                i= -1;
            }
        }
        return String.valueOf(random);
    }
}
