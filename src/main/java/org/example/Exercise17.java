package org.example;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // user prompt that asks user to enter a list of numbers
        System.out.print("Enter list: ");

        int[] list = new int[sc.nextInt()];
        for (int i = 0; i < list.length; i++)
            list[i] = sc.nextInt();

        System.out.println("The list is " + (isSorted(list) ? "already " : "not ") + "sorted");
    }
// isSorted returns true id list is already sorted if it isnt it returns false
    public static boolean isSorted(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1])
                return false;
        }
        return true;
    }
}
