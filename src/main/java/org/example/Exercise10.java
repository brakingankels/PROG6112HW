package org.example;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] smallestElement = new double[10];
        System.out.println("Enter ten numbers: ");

        for(int i = 0; i < smallestElement.length; i++)
            smallestElement[i] = scanner.nextDouble();

        System.out.println("The smallest number is: " + smallestElement[indexOfSmallestElement(smallestElement)] +" index " + indexOfSmallestElement(smallestElement));
    }

    private static int indexOfSmallestElement(double[] smallestElement) {
        if(smallestElement.length<= 1)
        return 0;

        double minimum = smallestElement[0];
        int minimumIndex= 0;
        for(int i = 1; i < smallestElement.length; i++) {
            if(smallestElement[i] < minimum) {
                minimum = smallestElement[i];
                minimumIndex = i;
            }
        }
        return minimumIndex;
    }

}
