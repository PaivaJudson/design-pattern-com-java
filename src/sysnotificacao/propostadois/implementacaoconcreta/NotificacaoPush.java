package sysnotificacao.propostadois.implementacaoconcreta;

import sysnotificacao.propostadois.Notificacao;

public class NotificacaoPush implements Notificacao {
    @Override
    public void enviar(String mensagem) {
        IO.println("Enviando notificacao PUSH: " + mensagem);
    }
}
