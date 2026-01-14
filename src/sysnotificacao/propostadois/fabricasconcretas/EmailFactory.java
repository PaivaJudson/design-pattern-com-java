package sysnotificacao.propostadois.fabricasconcretas;

import sysnotificacao.propostadois.Notificacao;
import sysnotificacao.propostadois.NotificacaoFactory;
import sysnotificacao.propostadois.implementacaoconcreta.NotificacaoEmail;


public class EmailFactory extends NotificacaoFactory {
    @Override
    public Notificacao criarNotificacao() {
        return new NotificacaoEmail();
    }
}
