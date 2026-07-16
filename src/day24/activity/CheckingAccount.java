package day24.activity;

public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, String accountHolder,
                           double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    protected String getAccountType() {
        return "Checking";
    }

    @Override
    protected void displayExtraInfo() {
        System.out.printf("Overdraft Limit: PHP %,.2f%n", overdraftLimit);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal failed: Amount must be greater than zero.");
        } else if (amount > balance + overdraftLimit) {
            System.out.println("Withdrawal failed: Amount exceeds the available balance and overdraft limit.");
        } else {
            balance -= amount;
            System.out.printf("Withdrew PHP %,.2f from checking account. New balance: PHP %,.2f%n",
                    amount, balance);
        }
    }
}
