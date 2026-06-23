package day5.discussion;

public class UnaryOperator {
    static void main(String[] args) {
        // negating an expression (- negative sign)
        int x = 10;
        System.out.println(-x);

        //negative boolean (!)
        boolean isTrue = false;
        System.out.println(!isTrue);

        //increment/decrement value by one (++/--)
        //post/pre
        int y = 50;
//        System.out.println(++y);
//        System.out.println(--y);
        System.out.println(y++);
        System.out.println(--y);
    }
}
