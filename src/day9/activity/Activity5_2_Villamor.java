package day9.activity;

import java.util.Scanner;

public class Activity5_2_Villamor {
    static void main(String[] args) {
        // Activity 5.2 - Product of 1 to N
        Scanner input = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = input.nextInt();
        System.out.println();

        long product = 1;

        for (int i = 1; i <= n; i++) {
            product = product * i; // update the running product each loop
            System.out.println("i = " + i + ", product = " + product);
        }

        System.out.println("Final Product: " + product);
    }
}
