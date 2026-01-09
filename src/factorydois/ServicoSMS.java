package factorydois;

public class ServicoSMS implements Notificacao {

    @Override
    public void enviar(String mensagem) {
        IO.println("LOG: Verificando sinal da operadora...");
        IO.println("Enviando SMS: " + mensagem);
    }
}
