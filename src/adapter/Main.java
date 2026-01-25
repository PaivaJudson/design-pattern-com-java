package adapter;

public class Main {

    GatewayPagamento gateway1 = new PayPalAdapter(new PayPalAPI());
    GatewayPagamento gateway2 = new StripeAdapter(new StripeAPI());





}
