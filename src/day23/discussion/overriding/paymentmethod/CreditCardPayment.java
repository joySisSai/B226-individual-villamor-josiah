package day23.discussion.overriding.paymentmethod;

public class CreditCardPayment extends Payment {
    @Override
    public void pay(double amount){
        System.out.println("Paid P" + amount + " using CC");
    }
}
