package day26.discussion.hashsetdiscussion;

import java.util.HashSet;
import java.util.Set;

public class HashSetDiscussion {
    static void main(String[] args) {
        Set<Integer> lottoNumbers = new HashSet<>();
        while (lottoNumbers.size() < 6){
            int randomNumbers = (int) (Math.random() * 58 )+ 1;
            lottoNumbers.add(randomNumbers);
        }


//        for (Integer num : lottoNumbers){
//            System.out.println(num);
//        }

//        lottoNumbers.forEach(num -> System.out.println(num));
        System.out.println(lottoNumbers);

    }
}
