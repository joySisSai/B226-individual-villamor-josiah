package day15.discussion;

/*
Lotto Simulator - draws 6 unique numbers from 1 to 58

- (int)(Math.random() * 58) + 1  -> random number from 1 to 58
- while (count < 6)              -> keep spinning until 6 balls are KEPT
- inner for loop                 -> checks if the ball was already drawn (no repeats)
 */
public class LottoSimulator {
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
