package simplefactory;

public class PagarMe implements PaymentProcessor {
    @Override
    public void pay() {
        IO.println("Pagando com PagarMe");
    }
}
