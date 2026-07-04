package day14.activity;

import java.util.Scanner;

public class Activity10_Villamor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MATH CLASS MENU =====");
            System.out.println(" 1. abs()     2. max()     3. min()");
            System.out.println(" 4. pow()     5. sqrt()    6. round()");
            System.out.println(" 7. ceil()    8. floor()   9. random()");
            System.out.println("10. log()    11. log10()  12. exp()");
            System.out.println("13. sin()    14. cos()    15. tan()");
            System.out.println(" 0. Exit");
            System.out.print("Pick a method: ");
            choice = scanner.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    System.out.println("Math.abs() removes the negative sign.");
                    System.out.println("Math.abs(-5) -> " + Math.abs(-5));
                    break;
                case 2:
                    System.out.println("Math.max() gives the bigger of two values.");
                    System.out.println("Math.max(7, 3) -> " + Math.max(7, 3));
                    break;
                case 3:
                    System.out.println("Math.min() gives the smaller of two values.");
                    System.out.println("Math.min(7, 3) -> " + Math.min(7, 3));
                    break;
                case 4:
                    System.out.println("Math.pow() raises a number to a power.");
                    System.out.println("Math.pow(2, 3) -> " + Math.pow(2, 3));
                    break;
                case 5:
                    System.out.println("Math.sqrt() gives the square root.");
                    System.out.println("Math.sqrt(25) -> " + Math.sqrt(25));
                    break;
                case 6:
                    System.out.println("Math.round() rounds to the nearest whole number.");
                    System.out.println("Math.round(4.6) -> " + Math.round(4.6));
                    break;
                case 7:
                    System.out.println("Math.ceil() always rounds up.");
                    System.out.println("Math.ceil(4.1) -> " + Math.ceil(4.1));
                    break;
                case 8:
                    System.out.println("Math.floor() always rounds down.");
                    System.out.println("Math.floor(4.9) -> " + Math.floor(4.9));
                    break;
                case 9:
                    System.out.println("Math.random() gives a random decimal from 0.0 to below 1.0.");
                    System.out.println("Math.random() -> " + Math.random());
                    break;
                case 10:
                    System.out.println("Math.log() is the natural logarithm (base e).");
                    System.out.println("Math.log(Math.E) -> " + Math.log(Math.E));
                    break;
                case 11:
                    System.out.println("Math.log10() is the logarithm base 10.");
                    System.out.println("Math.log10(1000) -> " + Math.log10(1000));
                    break;
                case 12:
                    System.out.println("Math.exp() raises e (about 2.718) to a power.");
                    System.out.println("Math.exp(1) -> " + Math.exp(1));
                    break;
                case 13:
                    System.out.println("Math.sin() gives the sine of an angle in radians.");
                    System.out.println("Math.sin(Math.toRadians(90)) -> " + Math.sin(Math.toRadians(90)));
                    break;
                case 14:
                    System.out.println("Math.cos() gives the cosine of an angle in radians.");
                    System.out.println("Math.cos(Math.toRadians(0)) -> " + Math.cos(Math.toRadians(0)));
                    break;
                case 15:
                    System.out.println("Math.tan() gives the tangent of an angle in radians.");
                    System.out.println("Math.tan(Math.toRadians(45)) -> " + Math.round(Math.tan(Math.toRadians(45))));
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Pick 0 to 15.");
            }
        } while (choice != 0);
    }
}
