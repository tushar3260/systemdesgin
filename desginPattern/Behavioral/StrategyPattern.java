package desginPattern.Behavioral;

interface PaymentStrategy {
    void pay(int amount);
}
class UPI implements PaymentStrategy {
    private String upiId;

    public UPI(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Payment of " + amount + " made using UPI with ID: " + upiId);
    }
}
class card implements PaymentStrategy {
    private String cardNumber;

    public card(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Payment of " + amount + " made using Card with number: " + cardNumber);
    }
}

class wallet implements PaymentStrategy {
    private String walletId;

    public wallet(String walletId) {
        this.walletId = walletId;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Payment of " + amount + " made using Wallet with ID: " + walletId);
    }
}



public class StrategyPattern {
    public static void main(String[] args) {
        PaymentStrategy upiPayment = new UPI("tushar@upi");
        PaymentStrategy cardPayment = new card("1234-5678-9012-3456");
        PaymentStrategy walletPayment = new wallet("wallet123");

        upiPayment.pay(1000);
        cardPayment.pay(2000);
        walletPayment.pay(500);
    }   
}
