package org.example;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers: ");
        for(int i = 0; i< numbers.length; i++) {
            numbers[i] = sc.nextInt();
            }
        System.out.println("The greatest common divisor is " + gcd(numbers));

        }
        public static int gcd(int...numbers) {
        int gcd = 1;
        boolean isDivisor;
        for(int i = 2; i < min(numbers);i++) {
        isDivisor = true;
        for(int e: numbers) {
            if(e % i !=0)
                isDivisor=false;
        }
        if(isDivisor)
            gcd = i;
        }
        return gcd;
    }
    public static int min(int...numbers) {
        int min = numbers[0];
        for(int e : numbers) {
            if(e< min)
                min=e;
        }
        return min;
    }
}

