package day11.activity;

import java.util.Scanner;

public class Activity7_Villamor {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // array that will hold the 5 numbers entered by the user
        int[] inputs = new int[5];

        // fill the array: indexed loop is needed so we can store into each slot
        System.out.println("Enter 5 numbers");
        for (int i = 0; i < inputs.length; i++) {
            System.out.print("Enter numbers: ");
            inputs[i] = scanner.nextInt();
        }

        int index = 0;  // manual counter so we can show the index in a for-each
        int sum = 0;    // running total of all the numbers

        // read back each value: print it with its index and add it to the sum
        System.out.println("\nYour numbers:");
        for (int input : inputs) {
            System.out.println("Index " + index + " = " + input);
            index++;
            sum += input;
        }

        //double so the division keeps its decimals
        double average = (double) sum / inputs.length;

        System.out.println("\nSum: " + sum);
        System.out.printf("Average: %.2f%%", average);

        scanner.close();
    }
}
