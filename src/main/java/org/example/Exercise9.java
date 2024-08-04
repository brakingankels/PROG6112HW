package org.example;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] smallest = new double[10];

        System.out.println("Enter ten values: ");
        for (int i = 0; i < smallest.length; ++i) {
            smallest[i] = sc.nextDouble();

        }
        System.out.println("The smallest value: " + min(smallest));
    }
    public static double min(double[] array) {
        double min = array[0];
        for(double i: array) {
            if(i < min)
                min= i;
        }
        return min;
    }
}