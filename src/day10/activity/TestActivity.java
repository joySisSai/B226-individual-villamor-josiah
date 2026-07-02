package day10.activity;

import java.util.Scanner;

public class TestActivity {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);



//        System.out.print("Enter number you want to?: ");
//        int multiplier = input.nextInt();
//
//        System.out.println("multiplication by " + multiplier);
//
//        for (int i = 1; i <= 10 ; i++) {
//            System.out.println(i + " X "+ multiplier + " = " + i*multiplier);
//
//        }

        for (int num = 1; num <= 10; num++) {
            System.out.println("");
            for (int i = 1; i <=10 ; i++) {
                System.out.println(num + " X " + i + " = " + num * i);

            }
        }







    }
}
