package factorydois;

public class NotificacaoEmail implements Notificacao {

    @Override
    public void enviar(String mensagem) {
        IO.println("LOG: Conectando ao servidor SMTP...");
        IO.println("Enviando Email formatado em HTML: " + mensagem);
    }
}
