package day21.activity;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========== User Account Registration ==========");

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Middle Name: ");
        String middleName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        // Keep asking until a valid email is entered
        String email;
        while (true) {
            System.out.print("Enter Email: ");
            email = scanner.nextLine();
            if (UserAccount.isValidEmail(email)) {
                break;
            }
            System.out.println("Invalid email format. Example: juan.delacruz@gmail.com");
        }

        // Keep asking until a valid password is entered
        String password;
        while (true) {
            System.out.print("Enter Password: ");
            password = scanner.nextLine();
            if (UserAccount.isValidPassword(password)) {
                break;
            }
            System.out.println("Password must be at least 8 characters and contain "
                    + "\nan uppercase letter, a lowercase letter, a digit, "
                    + "and a special character.");
        }

        UserAccount user = new UserAccount(firstName, middleName, lastName,
                address, email, password);

        System.out.println("\n========== Registration Successful ==========");
        System.out.println("Full Name: " + user.getFullName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Address: " + user.getAddress());

        scanner.close();
    }
}
