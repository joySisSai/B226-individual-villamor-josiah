package day23.discussion.overriding.paymentmethod;

public class CashPayment extends Payment {
    @Override
    public void pay(double amount){
        System.out.println("Paid P" + amount + " using Cash");
    }
}
