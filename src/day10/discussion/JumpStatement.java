package day10.discussion;

public class JumpStatement {
    static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 3 || i == 5 || i == 7)
                continue;
            System.out.println(i);
        }
    }
}
