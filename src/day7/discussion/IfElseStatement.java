package day7.discussion;

public class IfElseStatement {
    static void main(String[] args) {
        int number = 7;

        // Simple if: runs only when the condition is true
        if (number > 0) {
            System.out.println("The number is positive.");
        }

        // if-else: one branch runs when true, the other when false
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }
}
