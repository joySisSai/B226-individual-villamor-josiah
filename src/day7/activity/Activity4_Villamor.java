package day7.activity;

import java.util.Scanner;

public class Activity4_Villamor {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Main Menu
        System.out.println("========== MAIN MENU ==========");
        System.out.println("1. Start Game");
        System.out.println("2. Load Game");
        System.out.println("3. Settings");
        System.out.println("4. Exit");
        System.out.println("===============================\n");

        System.out.print("Enter a number (1-4): ");
        int choice = input.nextInt();

        System.out.println();

        if (choice == 1) {
            System.out.println("You selected Option 1: Start Game");
        } else if (choice == 2) {
            System.out.println("You selected Option 2: Load Game");
        } else if (choice == 3) {
            System.out.println("You selected Option 3: Settings");
        } else if (choice == 4) {
            System.out.println("You selected Option 4: Exit");
        } else {
            System.out.println("Invalid choice. Please try again.");
        }
    }
}
