package day8.discussion;

import java.util.Scanner;

public class ConditionalStatement {
     static void main(String[] args) {
        String username = "admin";
        String password = "123";

        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Username: ");
        String getUsername = input.nextLine();

        System.out.print("Please Enter Password: ");
        String getPassword = input.nextLine();

        if (getUsername.equals(username) && getPassword.equals(password)) {
            System.out.println("Login successful! Welcome, " + getUsername + ".");
        } else {
            System.out.println("Invalid username or password.");
        }

        input.close();

    }
}
