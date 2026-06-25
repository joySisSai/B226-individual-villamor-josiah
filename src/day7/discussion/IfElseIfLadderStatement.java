package day7.discussion;

public class IfElseIfLadderStatement {
    static void main(String[] args) {
        int score = 85;

        // if-else-if ladder: conditions are checked top to bottom,
        // the first true branch runs and the rest are skipped
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            // else handles everything no condition above matched
            System.out.println("Grade: F");
        }
    }
}
