package builder.pedidorestaurante;

public class Main {
    public static void main(String[] args) {

        Pedido pedido = new Pedido.PedidoBuilder("Fumbua")
                .sobremesa("Yougurte")
                .paraViagem(true)
                .bebida("Sumo natural")
                .acompanhamento("salada de carnes picantes")
                .build();
        IO.println(pedido);
    }
}
