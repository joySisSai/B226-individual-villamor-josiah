package day10.discussion;

import java.util.Scanner;

public class AtmPinEntry {
    static void main(String[] args) {

        // Program for ATM PIN Entry
        Scanner input = new Scanner(System.in);

        int pin = 123456;
        int enteredPin;

        int attempts = 0;
        int maxAttempts = 3;

        System.out.print("Enter your PIN: ");
        enteredPin = input.nextInt();
        attempts++;

        while (pin != enteredPin && attempts < maxAttempts) {
            System.out.println("Incorrect PIN! Try again");
            System.out.println("Attempts remaining: " + (maxAttempts - attempts));
            System.out.print("Enter your PIN: ");
            enteredPin = input.nextInt();
            attempts++;
        }

        if (pin == enteredPin) {
            System.out.println("Access Granted!");
        } else {
            System.out.println("Account locked! Too many incorrect attempts.");
        }

        input.close();
    }
}