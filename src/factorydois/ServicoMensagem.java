package factorydois;

public abstract class ServicoMensagem {

    protected abstract Notificacao criarNotificacao();

    public void processarEnvio(String mensagem) {
        Notificacao notificacao = this.criarNotificacao();
        notificacao.enviar(mensagem);
    }
}
