package org.example;

import javax.swing.*;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] integer = new int[10];

        System.out.println("Enter 10 integers: ");
        for (int i = 0; i < 10; ++i) {
            integer[i] = scanner.nextInt();
        }
        System.out.println("The integers in reverse: ");
        for (int i = 9; i >= 0; i--) {
            System.out.println(integer[i] + " ");
        }
    }
}