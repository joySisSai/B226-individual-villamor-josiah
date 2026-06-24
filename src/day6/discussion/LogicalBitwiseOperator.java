package day6.discussion;

public class LogicalBitwiseOperator {
    static void main(String[] args) {
        int x = 1;
        int y = 2;

        // Logical: && || ! returns boolean
        boolean result = x != y && x >= y;

        System.out.println(result);
        System.out.println(x < y || x > y);
        System.out.println(!(x == y));

        // Bitwise: & | ^ ~ << >> works on bits
        System.out.println(x & y);
        System.out.println(x | y);
        System.out.println(x ^ y);
        System.out.println(x << 1);
    }
}
