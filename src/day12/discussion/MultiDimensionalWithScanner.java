package day12.discussion;

import java.util.Scanner;

public class MultiDimensionalWithScanner {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] numbers = new  int[2][5];

        for (int i = 0; i < numbers.length ; i++) {
            for (int j = 0; j < numbers[i].length ; j++) {
                System. out.print ("Enter a number[" + i + "] [" + j + "] : ");
                numbers[i][j] = sc.nextInt();
            }
        }
        System. out.println("\nPrinting all the numbers: ");
        for (int[] row : numbers) {
            for (int column : row) {
                System.out.println(column);
            }
            System.out.println("");
        }

    }
}
