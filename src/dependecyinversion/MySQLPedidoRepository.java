package dependecyinversion;

public class MySQLPedidoRepository implements PedidoRepository {

    @Override
    public void salvarPedido(String pedido) {
        IO.println("salvando pedido no MYSQL");
    }
}
