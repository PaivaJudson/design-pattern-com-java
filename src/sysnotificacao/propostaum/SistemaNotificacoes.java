package sysnotificacao.propostaum;

public class SistemaNotificacoes {

    public static void main(String[] args) {

        String tipo = "EMAIL";
        Object notificacao;

        if (tipo.equals("EMAIL")) {
            new NotificacaoEmail().enviar("Usando Email");
        } else if (tipo.equals("SMS")) {
            new NotificacaoSMS().enviar("Usando SMS");
        } else if (tipo.equals("PUSH")) {
            new NotificacaoPush().enviar("Usando Push");
        } else {
            throw new IllegalArgumentException("Tipo invlido");
        }
    }
}
