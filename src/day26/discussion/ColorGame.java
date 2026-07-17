package day26.discussion;

import java.util.ArrayList;
import java.util.Collections;

public class ColorGame {
    static void main(String[] args) {
        ArrayList<String> dice = new ArrayList<>();
        dice.add("Blue");
        dice.add("White");
        dice.add("Red");
        dice.add("Green");
        dice.add("Pink");
        dice.add("Yellow");

        for (int i = 0; i < 3 ; i++) {
            System.out.println("dice"+ (i+1)+" " + dice.get(i));
        }

//        Collections.shuffle(dice);
//        System.out.println("dice1: "+dice.get(0));
//        Collections.shuffle(dice);
//        System.out.println("dice2: "+dice.get(0));
//        Collections.shuffle(dice);
//        System.out.println("dice3: "+dice.get(0));

//        for (int i = 0; i < dice.size() ; i++) {
//            System.out.println(dice.get(i));
//        }

//        for (String i : dice){
//            System.out.println(i);
//        }
//        dice.forEach(i -> System.out.println(i));
//        dice.forEach(System.out::println);

//        Collections.addAll(colors, "Blue","White","Red","Green","Pink","Yellow");
//        System.out.println("normal: "+ dice);
//
//
//        ArrayList<String> dice2 = new ArrayList<>();
//        dice2.add("Black");
//        dice2.addAll(dice);
//        System.out.println("normal dice2: "+ dice2);
//
//        ArrayList<String> dice3 = new ArrayList<>(dice);
//        dice3.add("Red");
//        System.out.println("normal dice3: "+ dice3);
//        System.out.println(dice3.indexOf("Red"));
//        System.out.println(dice3.lastIndexOf("Red"));


//        System.out.println(colors.contains("Black"));

//        Collections.sort(colors);
//        System.out.println("sort: "+ colors);

//        Collections.reverse(colors);
//        System.out.println("reverse: "+colors);

//        Collections.shuffle(colors);
//        System.out.println("shuffle: "+colors);




    }
}
