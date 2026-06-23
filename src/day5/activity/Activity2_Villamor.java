package day5.activity;

public class Activity2_Villamor {
    public static void main(String[] args) {
        // Given values
        double income = 50_000;
        double foodAllowance = 15_000;
        double transportation = 2_500;
        double rent = 4_500;
        double utilityBill = 3_500;

        // Total expenses and remaining balance
        double totalExpenses = foodAllowance + transportation + rent + utilityBill;
        double remainingBalance = income - totalExpenses;

        // Display results, percentages rounded to 1 decimal place using printf
        System.out.printf("Income: %.0f%n", income);
        System.out.printf("Food Allowance: %.1f %%%n", foodAllowance / income * 100);
        System.out.printf("Transportation: %.1f %%%n", transportation / income * 100);
        System.out.printf("Rent: %.1f %%%n", rent / income * 100);
        System.out.printf("Utility Bill: %.1f %%%n", utilityBill / income * 100);
        System.out.printf("Remaining Balance: %.0f%n", remainingBalance);
    }
}
