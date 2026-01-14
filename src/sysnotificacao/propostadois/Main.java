package sysnotificacao.propostadois;

import sysnotificacao.propostadois.fabricasconcretas.EmailFactory;
import sysnotificacao.propostadois.fabricasconcretas.PushFactory;
import sysnotificacao.propostadois.fabricasconcretas.SMSFactory;

public class Main {
    public static void main(String[] args) {
        NotificacaoFactory emailFactory = new EmailFactory();
        NotificacaoFactory smsFactory = new SMSFactory();
        NotificacaoFactory pushFactory = new PushFactory();

        IO.println("Sistema de Notificacao");

        emailFactory.enviarNotificacao("Factura chegou...");
        smsFactory.enviarNotificacao("Verifica o codigo...");
        pushFactory.enviarNotificacao("Tem uma nova mensagem...");
    }
}
