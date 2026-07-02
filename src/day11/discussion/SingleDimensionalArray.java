package day11.discussion;

import java.util.Scanner;

public class SingleDimensionalArray {
    static void main(String[] args) {
        int[] ages = {2,4,5,6,24,12};
        String[] names = {"test", "test2", "test3"};

        //simple for loop
        System.out.println("For Loop");
        for (int i = 0; i <ages.length ; i++) {

            System.out.println(ages[i]);
        }

        //enhance for lop/ for each
        System.out.println("for-each");
        for (int age : ages){
            System.out.println(age);
        }


        // Array Declaration with specified size only
        Scanner scanner = new Scanner(System.in);
        String[] anime = new String[5];

        for (int i = 0; i < anime.length; i++) {
            System.out.print("Enter anime title: ");
            anime[i] = scanner.nextLine();
        }

        System.out.println("\nAnime you entered: ");
        for (String title : anime) {
            System.out.println(title);
        }
    }
}
