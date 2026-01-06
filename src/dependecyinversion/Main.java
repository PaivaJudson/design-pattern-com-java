package dependecyinversion;

public class Main {
    public static void main(String[] args) {

        PedidoRepository pedidoRepository = new MySQLPedidoRepository();
        PedidoRepository pedidoRepository2 = new MySQLPedidoRepository();

        pedidoRepository2.salvarPedido("pedido");



    }
}
