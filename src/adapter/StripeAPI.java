package adapter;

public class StripeAPI {
    public void processarCobranca(double valor) {
        IO.println("Cobranca Striper: " + valor);
    }

    public boolean validarAPIKey(){
        return true;
    }
}
