package day7.discussion;

import java.util.Scanner;

public class UserInput {

    static void main(String[] args) {
        //instantiate / Create object of scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = input.nextLine();

        System.out.print("Enter age: ");
        int age = input.nextInt();

        System.out.print("Enter Salary: ");
        double salary = input.nextDouble();

        // Output input by user
        System.out.println("Name: " + name) ;
        System. out.println ("Age: " + age) ;
        System.out.println("Salary: " + salary) ;

        System.out.print("Name:" + name);
        System.out.print("Age:" + age);
        System.out.print("Salary:" + salary);



    }

}
