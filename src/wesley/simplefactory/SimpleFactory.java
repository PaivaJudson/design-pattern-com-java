package wesley.simplefactory;

public class SimpleFactory {


    public PaymentProcessor simplePaymentFactory(String type){

        switch (type){
            case "PagarMe":
                return new PagarMe();
            case "MercadoPago":
                return new MercadoPago();
            default:
                return null;
        }
    }
}
