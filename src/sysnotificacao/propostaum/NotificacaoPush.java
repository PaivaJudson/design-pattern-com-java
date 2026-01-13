package sysnotificacao.propostaum;

public class NotificacaoPush {

    public void enviar(String mensagem){
        IO.println("Push: " + mensagem);
    }
}
