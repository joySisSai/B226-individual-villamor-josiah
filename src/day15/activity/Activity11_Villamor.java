package day15.activity;

public class Activity11_Villamor {
    static void main(String[] args) {
        int[] draw = new int[6];
        int count = 0;

        while (count < 6) {
            int ball = (int)(Math.random() * 58) + 1;

            // check: is this ball already in the array?
            boolean repeated = false;
            for (int i = 0; i < count; i++) {
                if (draw[i] == ball) {
                    repeated = true;
                }
            }

            // only keep it if it's new
            if (!repeated) {
                draw[count] = ball;
                count++;
            }
        }

        System.out.print("Winning numbers: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(draw[i] + " ");
        }
    }
}
