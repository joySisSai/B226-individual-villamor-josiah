package day9.activity;

import java.util.Scanner;

public class Activity5_3_Villamor {
    static void main(String[] args) {
        // Activity 5.3 - Arithmetic Sequence (Sum Only)
        Scanner input = new Scanner(System.in);

        System.out.print("Enter start number: ");
        int startNumber = input.nextInt();

        System.out.print("Enter common difference: ");
        int commonDifference = input.nextInt();

        System.out.print("Enter number of terms (n): ");
        int n = input.nextInt();
        System.out.println();

        int current = startNumber;
        int sum = 0;
        String process = "";

        for (int i = 1; i <= n; i++) {
            sum = sum + current; // add the current term to the running total

            // build the visible process string, e.g. 1 + 6 + 11
            if (i == 1) {
                process = process + current;
            } else {
                process = process + " + " + current;
            }

            current = current + commonDifference; // move to the next term
        }

        System.out.println(process + " = " + sum);
    }
}
