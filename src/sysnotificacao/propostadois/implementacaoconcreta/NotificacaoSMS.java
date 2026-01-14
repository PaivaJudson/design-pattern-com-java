package sysnotificacao.propostadois.implementacaoconcreta;

import sysnotificacao.propostadois.Notificacao;

public class NotificacaoSMS implements Notificacao {
    @Override
    public void enviar(String mensagem) {
        IO.println("Enviando SMS: " + mensagem);
    }
}
