package day25.discussion.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDiscussion {
    static void main(String[] args) {
        //instantiation of arrayList
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Toyota");
        cars.add("Honda");
        cars.add("Suzuki");
        cars.add("KIA");
        cars.add("FORD");
        cars.add(0,"BYD");

        System.out.println(cars.get(cars.size()-1));
        cars.set(0,"Bading and driver");
        System.out.println(cars);
        cars.remove(0);
        System.out.println(cars);
        cars.remove("KIA");
        System.out.println(cars);
//        cars.removeAll(cars);
//        cars.clear();
//        System.out.println(cars);
        Collections.reverse(cars);
        System.out.println(cars);

        Collections.sort(cars);
        System.out.println(cars);

    }
}

/*
    CRUD operation
    Create - add()
    Read - get ()
    Update - set()
    Delete - remove()
    Delete all - clear() || removeAll()
 */
