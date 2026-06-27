package day9.activity;

import java.util.Scanner;

public class Activity5_1_Villamor {
    static void main(String[] args) {
        // Activity 5.1 - Summation of 1 to N
        Scanner input = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = input.nextInt();
        System.out.println();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i; // update the running total each loop
            System.out.println("i = " + i + ", sum = " + sum);
        }

        System.out.println("Final Sum: " + sum);
    }
}
