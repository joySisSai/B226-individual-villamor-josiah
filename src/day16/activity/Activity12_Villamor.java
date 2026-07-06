package day16.activity;

import java.util.Random;
import java.util.Scanner;

public class Activity12_Villamor {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=========================================");
            System.out.println("                  MENU                   ");
            System.out.println("=========================================");
            System.out.println("1. Identify if a number is odd or even");
            System.out.println("2. Print your name 50 times");
            System.out.println("3. Get the square root of a number");
            System.out.println("4. Get the power of a number");
            System.out.println("5. Print a random number between 1 and 100");
            System.out.println("6. Get the area of a circle");
            System.out.println("7. Identify if a person is a voter or not");
            System.out.println("8. Get the length of a word");
            System.out.println("9. Print a word in reverse order");
            System.out.println("10. Print your full name and age");
            System.out.println("0. Exit");
            System.out.println("=========================================");
            System.out.print("Enter your choice (0-10): ");

            choice = scanner.nextInt();
            scanner.nextLine();

            System.out.println();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    int num = scanner.nextInt();
                    checkOddEven(num);
                    break;

                case 2:
                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();
                    printName50Times(name);
                    break;

                case 3:
                    System.out.print("Enter a number to find its square root: ");
                    double sqrtNum = scanner.nextDouble();
                    System.out.println("Square Root: " + getSquareRoot(sqrtNum));
                    break;

                case 4:
                    System.out.print("Enter the base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the exponent: ");
                    double exponent = scanner.nextDouble();
                    System.out.println("Result: " + getPower(base, exponent));
                    break;

                case 5:
                    printRandomNumber();
                    break;

                case 6:
                    System.out.print("Enter the radius of the circle: ");
                    double radius = scanner.nextDouble();
                    System.out.println("Area of the circle: " + getCircleArea(radius));
                    break;

                case 7:
                    System.out.print("Enter the person's age: ");
                    int ageForVoting = scanner.nextInt();
                    checkVoterEligibility(ageForVoting);
                    break;

                case 8:
                    System.out.print("Enter a word: ");
                    String wordToCount = scanner.nextLine();
                    System.out.println("Length of the word: " + getWordLength(wordToCount));
                    break;

                case 9:
                    System.out.print("Enter a word to reverse: ");
                    String wordToReverse = scanner.nextLine();
                    printReverseWord(wordToReverse);
                    break;

                case 10:
                    System.out.print("Enter your full name: ");
                    String fullName = scanner.nextLine();
                    System.out.print("Enter your age: ");
                    int age = scanner.nextInt();
                    printNameAndAge(fullName, age);
                    break;

                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please select a number from 0 to 10.");
                    break;
            }

        } while (choice != 0);

        scanner.close();
    }

    // 1. A method to identify if a number is odd or even
    public static void checkOddEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is Even.");
        } else {
            System.out.println(number + " is Odd.");
        }
    }

    // 2. A method to print your name 50 times
    public static void printName50Times(String name) {
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + ". " + name);
        }
    }

    // 3. A method to get the square root of a certain variable
    public static double getSquareRoot(double number) {
        return Math.sqrt(number);
    }

    // 4. A method to get the power of a number using base and exponent
    public static double getPower(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // 5. A method to print a random number between 1 and 100
    public static void printRandomNumber() {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;
        System.out.println("Random Number (1-100): " + randomNumber);
    }

    // 6. A method to get the area of a circle using the given radius
    public static double getCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // 7. A method to identify if a person is a voter or not
    public static void checkVoterEligibility(int age) {
        if (age >= 18) {
            System.out.println("This person is eligible to vote.");
        } else {
            System.out.println("This person is NOT eligible to vote.");
        }
    }

    // 8. A method to get the length of a certain word
    public static int getWordLength(String word) {
        return word.length();
    }

    // 9. A method to print a certain word in reverse order
    public static void printReverseWord(String word) {
        StringBuilder reversed = new StringBuilder(word);
        System.out.println("Reversed word: " + reversed.reverse().toString());
    }

    // 10. A method to print your full name and age
    public static void printNameAndAge(String fullName, int age) {
        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + age);
    }
}
