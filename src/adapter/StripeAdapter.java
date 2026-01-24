package adapter;

public class StripeAdapter implements GatewayPagamento {

    private StripeAPI stripe;

    public StripeAdapter(StripeAPI stripe){
        this.stripe = stripe;
    }

    @Override
    public void pagar(double valor) {
        stripe.processarCobranca(valor);
    }

    @Override
    public boolean autorizar() {
        return stripe.validarAPIKey();
    }
}
