package day25.discussion.enumeration;

public enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY


}


class Printer{
    static void main(String[] args) {
        for (Day day : Day.values()){
            System.out.println(day);
        }
    }
}