package builder.pedidorestaurante;

public class Pedido {
    private final String pratoPrincipal;
    private final String bebida;
    private final String sobremesa;
    private final String acompanhamento;
    private final boolean paraViagem;

    public Pedido(PedidoBuilder builder) {
        this.pratoPrincipal = builder.pratoPrincipal;
        this.bebida = builder.bebida;
        this.sobremesa = builder.sobremesa;
        this.acompanhamento = builder.acompanhamento;
        this.paraViagem = builder.paraViagem;
    }


    public static class PedidoBuilder {
        private final String pratoPrincipal;
        private String bebida = "";
        private String sobremesa = "";
        private String acompanhamento = "";
        private boolean paraViagem = false;

        public PedidoBuilder(String pratoPrincipal) {
            this.pratoPrincipal = pratoPrincipal;
        }

        public PedidoBuilder bebida(String bebida) {
            this.bebida = bebida;
            return this;
        }

        public PedidoBuilder sobremesa(String sobremesa) {
            this.sobremesa = sobremesa;
            return this;
        }

        public PedidoBuilder acompanhamento(String acompanhamento) {
            this.acompanhamento = acompanhamento;
            return this;
        }

        public PedidoBuilder paraViagem(boolean paraViagem) {
            this.paraViagem = paraViagem;
            return this;
        }
    }

}
