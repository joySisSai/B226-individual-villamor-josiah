package day23.discussion.overriding.paymentmethod;

public class GCashPayment extends Payment {

    @Override
    public void pay(double amount){
        System.out.println("Paid P" + amount + " using Gcash");
    }
}
