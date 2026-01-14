package sysnotificacao.propostadois.implementacaoconcreta;

import sysnotificacao.propostadois.Notificacao;

public class NotificacaoEmail implements Notificacao {

    @Override
    public void enviar(String mensagem) {
        IO.println("Enviando email: " + mensagem);
    }
}
