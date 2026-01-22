package adapter;

public class PayPalAPI {
    public void enviarPagamento(double valor) {
        IO.println("Pagamento PayPal: R$ "+ valor);
    }

    public boolean verificarConexao(){
        return true;
    }
}
