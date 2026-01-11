package simplefactory;

public class MercadoPago implements PaymentProcessor {
    @Override
    public void pay() {
        IO.println("Pagando com MercadoPago");
    }
}
