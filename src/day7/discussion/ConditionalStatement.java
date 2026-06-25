package day7.discussion;

public class ConditionalStatement {
    static void main(String[] args) {
        /*
            Requirements: Identify if the number is Neutral, Positive or Negative

            int num = -1;

            String result = (num == 0) ? "Neutral"
                : (num > 0) ? "Positive"
                : (num > 100) ? "Number is greater than 100"
                : "Negative";
        */

        int num = 0;

        String numberType;

//        Simple-if - if-else
//        if (num> 0) {
//            numberType = "Positive";
//        } else if (num < 0) {
//            numberType= "Negative";
//        } else {
//            numberType = "Neutral";
//        }
//
//        System.out.println(numberType);



        // Fever or Normal Temp
        float temp = 38.5f;

        String tempResult;
        if (temp >= 38.5) {
            tempResult = "Fever";
        } else {
            tempResult = "Normal Temp";
        }
        System.out.println(tempResult);



    }
}
