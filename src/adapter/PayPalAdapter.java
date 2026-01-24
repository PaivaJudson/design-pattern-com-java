package adapter;

public class PayPalAdapter implements GatewayPagamento {

    private PayPalAPI paypal;

    public PayPalAdapter(PayPalAPI paypal) {
        this.paypal = paypal;
    }

    @Override
    public void pagar(double valor) {
        paypal.enviarPagamento(valor);
    }

    @Override
    public boolean autorizar() {
        return paypal.verificarConexao();
    }
}
