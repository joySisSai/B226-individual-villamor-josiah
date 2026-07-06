package day15.discussion;

public class RandomNumber {
    static void main(String[] args) {
//        double randomNumber = Math.random();
//
//        int lotto =  (int)(Math.random() * 58) + 1;
//
//                System.out.println(lotto);
//
//        //Lotto Simulator
//
//        String x  = "10";
//
//        int num = Integer.valueOf(x);
//        System.out.println(num);


        for (int i = 1; i <= 6; i++) {
            int lottoNumbers = (int)(Math.random() * 58) + 1;
            System.out.print(lottoNumbers + " ");
        }

    }
}

/*
Casting and Parsing
 */
