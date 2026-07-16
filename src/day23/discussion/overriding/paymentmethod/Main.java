package day23.discussion.overriding.paymentmethod;

public class Main {
    static void main(String[] args) {
        Payment cash = new CashPayment();
        Payment cc = new CreditCardPayment();
        Payment gcash = new GCashPayment();

        cash.pay(123.00);
        cc.pay(33.2);
        gcash.pay(521);
    }
}
