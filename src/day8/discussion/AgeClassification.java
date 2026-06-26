package day8.discussion;

import java.util.Scanner;

public class AgeClassification {
    public static void main(String[] args) {

        //Using nested if-else-if

        Scanner input = new Scanner(System.in);
        /*
            Age: 0 - 12 -> Child
                Age: 0 - 5 ->  Specifically, Toddler
                Age: 6 - 12 ->  Specifically, Pre-Teen
            Age: 13 - 19 -> Teenager
                Age: 13 - 15 ->  Specifically, Eary Teen
                Age: 16 - 19 ->  Specifically, Late Teen
            Age: 20 - 59 -> Adult
                Age: 20 - 35 ->  Specifically, Young Adult
                Age: 36 - 59 ->  Specifically, Middle-Aged
            Age: 60 - 120 -> Senior Citizen
                Age: 60 - 75 ->  Specifically, Young Senior
                Age: 76 - 120 ->  Specifically, Elderly
            Invalid Age -> Invalid Input
        */

        System.out.print("Please Enter Age: ");
        int age = input.nextInt();

        if (age < 0 || age > 120) {
            System.out.println("Invalid age.");
        } else if (age <= 12) {
            System.out.println("Child");
            System.out.println(age <= 5 ? "Toddler" : "Pre-Teen");
        } else if (age <= 19) {
            System.out.println("Teenager");
            System.out.println(age <= 15 ? "Early Teen" : "Late Teen");
        } else if (age <= 59) {
            System.out.println("Adult");
            System.out.println(age <= 35 ? "Young Adult" : "Middle-Aged");
        } else {
            System.out.println("Senior Citizen");
            System.out.println(age <= 75 ? "Young Senior" : "Elderly");
        }

        input.close();
    }
}