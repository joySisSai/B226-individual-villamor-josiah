package day24.activity;

public class Activity15_Villamor {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(
                "SA-1001", "Josiah Villamor", 10000.00, 3.50);
        CheckingAccount checking = new CheckingAccount(
                "CA-2001", "Josiah Villamor", 5000.00, 2000.00);

        System.out.println("========== ACCOUNT INFORMATION ==========");
        savings.displayAccountInfo();
        System.out.println();
        checking.displayAccountInfo();

        System.out.println("\n========== SAVINGS TRANSACTIONS ==========");
        savings.deposit(1500.00);
        savings.withdraw(2000.00);

        System.out.println("\n========== CHECKING TRANSACTIONS ==========");
        checking.deposit(1000.00);
        checking.withdraw(9000.00);

        System.out.println("\n========== UPDATED ACCOUNT INFORMATION ==========");
        savings.displayAccountInfo();
        System.out.println();
        checking.displayAccountInfo();
    }
}
