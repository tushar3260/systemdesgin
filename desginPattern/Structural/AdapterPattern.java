//Adapter converts one interface into another interface that client expects.

interface PaymentProcessor {
    void pay(int amount);
}

class OldPayGateway {
    public void makePayment(int amount) {
        System.out.println("Payment successful: " + amount);
    }
}

class PaymentAdapter implements PaymentProcessor {
    private OldPayGateway gateway;

    public PaymentAdapter(OldPayGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public void pay(int amount) {
        gateway.makePayment(amount);
    }
}

// Main class
public class AdapterPattern {
    public static void main(String[] args) {
        OldPayGateway oldGateway = new OldPayGateway();

        PaymentProcessor payment = new PaymentAdapter(oldGateway);

        payment.pay(500);
    }
}