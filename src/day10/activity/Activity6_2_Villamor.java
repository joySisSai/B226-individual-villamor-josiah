package day10.activity;

public class Activity6_2_Villamor {
    static void main(String[] args) {
        // Activity 6 Part 2 - Display multiplication tables using nested for loops

        // outer loop picks which table to display (1 to 10)
        for (int number = 1; number <= 10; number++) {
            System.out.println("Multiplication Table of " + number);

            // inner loop lists the multiples from 1 up to 10
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }

            System.out.println(); // blank line between tables
        }
    }
}
