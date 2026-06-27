package day9.activity;

import java.util.Scanner;

public class Activity5_4_Villamor {
    static void main(String[] args) {
        // Activity 5.4 - Arithmetic Sequence (Sum and Product)
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
        long product = 1;
        String sumProcess = "";
        String productProcess = "";

        for (int i = 1; i <= n; i++) {
            sum = sum + current;         // running total
            product = product * current; // running product

            // build the visible processes, e.g. 1 + 6 + 11  and  1 * 6 * 11
            if (i == 1) {
                sumProcess = sumProcess + current;
                productProcess = productProcess + current;
            } else {
                sumProcess = sumProcess + " + " + current;
                productProcess = productProcess + " * " + current;
            }

            current = current + commonDifference; // move to the next term
        }

        System.out.println("Sum: " + sumProcess + " = " + sum);
        System.out.println("Product: " + productProcess + " = " + product);
    }
}
