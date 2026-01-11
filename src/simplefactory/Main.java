package simplefactory;

public class Main {
    public static void main(String[] args) {

        SimpleFactory simpleFactory = new SimpleFactory();
        PaymentProcessor metodo = simpleFactory.simplePaymentFactory("MercadoPago");
        metodo.pay();
    }
}
