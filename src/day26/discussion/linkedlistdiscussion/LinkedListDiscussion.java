package day26.discussion.linkedlistdiscussion;

import java.util.LinkedList;

public class LinkedListDiscussion {
    static void main(String[] args) {
        LinkedList<Integer> evenNumbers = new LinkedList<>();
        evenNumbers.add(4);
        evenNumbers.add(6);
        evenNumbers.add(8);

        evenNumbers.addFirst(2);
        evenNumbers.addLast(10);

        System.out.println(evenNumbers);

        evenNumbers.removeFirst();
        evenNumbers.removeLast();

        System.out.println(evenNumbers);

        System.out.println(evenNumbers.getFirst());
        System.out.println(evenNumbers.getLast());
    }
}
