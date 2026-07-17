package day26.discussion.hashmapdiscussion;

import java.util.*;

public class HashMapDiscussion {
    static void main(String[] args) {
        Map<String, String> cofig = new HashMap<>();
        cofig.put("dbUrl","127.0.0.1:8080/mydb");
        cofig.put("maxConnection","100");
        System.out.println(cofig);

        Set<String> keys = cofig.keySet();

        for (String k : keys){
            System.out.println(k);
        }

        Collection hashValues = cofig.values();

        for (Object val : hashValues){
            System.out.println(val);
        }


    }
}
