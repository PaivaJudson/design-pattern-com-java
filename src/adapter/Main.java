package adapter;

public class Main {

    public static void main(String[] args) {

        GatewayPagamento gateway1 = new PayPalAdapter(new PayPalAPI());
        GatewayPagamento gateway2 = new StripeAdapter(new StripeAPI());

        processarPagamento(gateway1, 100.550);
        processarPagamento(gateway1, 100.550);

    }

    private static void processarPagamento(GatewayPagamento gateway, double v) {
        if (gateway.autorizar()) {
            gateway.pagar(v);
        }
    }

}

