package day25.discussion.enumeration;

public class MainMenu {
    enum Month {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER,
        OCTOBER, NOVEMBER, DECEMBER
    }

    static void main(String[] args) {
        Month currentMonth = Month.JULY;
        switch (currentMonth){
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                System.out.println("It's Winter season!");
                break;
            case MARCH:
            case APRIL:
            case MAY:
                System.out.println("It's Spring season!");
                break;
            case JUNE:
            case JULY:
            case AUGUST:
                System.out.println("It's Summer season!");
                break;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                System.out.println("It's Fall season!");
                break;
            default:
                System.out.println("Unknown month");
        }
    }
}
