package day6.activity;

public class Activity3_Villamor {
    static void main(String[] args) {
        // 2. Logical AND (&&) - allowed to enter an event
        int age = 20;
        boolean hasValidID = true;

        // Must be 18 or above AND have a valid ID
        String allowedToEnter = age >= 18 && hasValidID ? "Allowed" : "Access Denined";
        System.out.println("Allowed to enter the event: " + allowedToEnter);

        // 3. Logical OR (||) - no classes today
        boolean isWeekend = true;
        boolean isHoliday = false;

        // No classes if it is a weekend OR a holiday
        boolean noClasses = isWeekend || isHoliday;
        System.out.println("No classes today?: " + noClasses);

        // 4. Ternary (? :) - passed or failed
        int score = 85;
        String result = score >= 75 ? "Passed" : "Failed";
        System.out.println("Student result: " + result);

        // 5. Ternary (? :) - larger number
        int num1 = 10;
        int num2 = 25;
        int largerNumber = num1 > num2 ? num1 : num2;
        System.out.println("The larger number is: " + largerNumber);
    }
}
