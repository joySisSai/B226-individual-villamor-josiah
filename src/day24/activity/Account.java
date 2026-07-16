package day24.activity;

public abstract class Account implements Transaction {
    protected String accountNumber;
    protected String accountHolder;
    protected double balance;

    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Each account type identifies itself (e.g. "Savings", "Checking").
    protected abstract String getAccountType();

    // Subclasses print their own extra fields (interest rate, overdraft limit, ...).
    protected abstract void displayExtraInfo();

    // Deposit behaves the same for every account type, so it lives here.
    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit failed: Amount must be greater than zero.");
            return;
        }

        balance += amount;
        System.out.printf("Deposited PHP %,.2f into %s account. New balance: PHP %,.2f%n",
                amount, getAccountType().toLowerCase(), balance);
    }

    // Common header, then each subclass appends its specific details.
    public void displayAccountInfo() {
        System.out.println(getAccountType() + " Account");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.printf("Balance: PHP %,.2f%n", balance);
        displayExtraInfo();
    }
}
