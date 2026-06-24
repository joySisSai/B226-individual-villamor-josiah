package day6.discussion;

public class TernaryOperator {
    static void main(String[] args) {
        // condition ? valueIfTrue : valueIfFalse
        int x = 1;
        int y = 2;

        String result = x > y ? "x is bigger" : "y is bigger";

        System.out.println(result);
        System.out.println(x == y ? "equal" : "not equal");
    }
}
