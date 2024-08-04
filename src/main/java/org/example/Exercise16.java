package org.example;

import java.util.Scanner;

public class Exercise16 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = sc.nextDouble();

        bubbleSort(numbers);

        for (double e : numbers) {
            System.out.println(e + " ");
        }
        System.out.println();
    }
        public static void bubbleSort(double[] list) {
            double temp;
            boolean swapped;
            do{
                swapped = false;
                for(int i =0;i<list.length - 1; i++) {
                    if(list[i] > list[i + 1]) {
                        temp = list[i];
                        list[i] = list[i +1];
                        list[i +1] = temp;
                        swapped=true;
                    }
                }

            }while (swapped);
        }
    }
