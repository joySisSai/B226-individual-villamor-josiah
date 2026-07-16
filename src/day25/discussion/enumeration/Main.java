package day25.discussion.enumeration;

public class Main {
    static void main(String[] args) {
        Day today = Day.THURSDAY;

        switch (today){
            case FRIDAY -> System.out.println("Today is Friday");
            case SATURDAY -> System.out.println("Today is Saturday");
            case SUNDAY -> System.out.println("Today is Sunday");
            case MONDAY -> System.out.println("Today is Monday");
            case TUESDAY -> System.out.println("Today is Tuesday");
            case WEDNESDAY -> System.out.println("Today is Wednesday");
            case THURSDAY -> System.out.println("Today is Thursday");
            default -> System.out.println("Day off");

        }

        if (today == Day. MONDAY || today == Day. TUESDAY) {
            System.out.println("Start of the week");
        } else if (today == Day. WEDNESDAY || today == Day. THURSDAY) {
            System.out.println("It's midweek");
        } else if (today == Day. FRIDAY) {
            System. out.println("Weekend is near");
        } else {
            System.out.println("Weekend!");
        }




    }
}
