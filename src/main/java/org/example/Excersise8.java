package org.example;

import java.util.Scanner;

public class Excersise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[10];

        System.out.println("Enter ten values of double types: ");
        for(int i = 0; i < numbers.length;++i ) {
            numbers[i] = sc.nextDouble();
        }
        System.out.println("The average value: " + average(numbers));
        }
    public static int average(int []array) {
        int average = 0;
        for(int i: array)
            average +=i;
        return average/ array.length;
    }
    public static double average(double[] array) {
        double average = 0;
        for(double i: array)
            average+= i;
        return average/ array.length;
    }
}
