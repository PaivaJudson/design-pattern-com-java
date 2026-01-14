package sysnotificacao.propostadois.fabricasconcretas;

import sysnotificacao.propostadois.Notificacao;
import sysnotificacao.propostadois.NotificacaoFactory;
import sysnotificacao.propostadois.implementacaoconcreta.NotificacaoSMS;

public class SMSFactory extends NotificacaoFactory {
    @Override
    public Notificacao criarNotificacao() {
        return new NotificacaoSMS();
    }
}
