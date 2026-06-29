package day10.discussion;

public class InfiniteLoop {
    static void main(String[] args) {
        int counter = 1;

        //infinite loop
//        while (true){
//            System.out.println("Hello");
//            counter++;
//        }
        //correct Usage of while
        while (counter < 10){
            System.out.println("test");
            counter++;
        }


    }
}
