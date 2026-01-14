package sysnotificacao.propostadois.fabricasconcretas;

import sysnotificacao.propostadois.Notificacao;
import sysnotificacao.propostadois.NotificacaoFactory;
import sysnotificacao.propostadois.implementacaoconcreta.NotificacaoPush;

public class PushFactory extends NotificacaoFactory {
    @Override
    public Notificacao criarNotificacao() {
        return new NotificacaoPush();
    }
}
