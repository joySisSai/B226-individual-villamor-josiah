package day24.activity;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder,
                          double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    @Override
    protected String getAccountType() {
        return "Savings";
    }

    @Override
    protected void displayExtraInfo() {
        System.out.printf("Interest Rate: %.2f%%%n", interestRate);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal failed: Amount must be greater than zero.");
        } else if (amount > balance) {
            System.out.println("Withdrawal failed: Insufficient balance in savings account.");
        } else {
            balance -= amount;
            System.out.printf("Withdrew PHP %,.2f from savings account. New balance: PHP %,.2f%n",
                    amount, balance);
        }
    }
}
