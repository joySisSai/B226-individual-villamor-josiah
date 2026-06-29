package day10.activity;

import java.util.Scanner;

public class Activity6_1_Villamor {
    static void main(String[] args) {
        // Activity 6 Part 1 - Display a single chosen multiplication table
        Scanner input = new Scanner(System.in);

        System.out.print("Which multiplication table do you want to display? ");
        int number = input.nextInt();
        System.out.println();

        System.out.println("Multiplication Table of " + number);

        // show this number multiplied from 1 up to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
