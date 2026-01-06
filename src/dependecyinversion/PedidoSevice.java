package dependecyinversion;

public class PedidoSevice {

    private PedidoRepository pedidoRepository;

    public PedidoSevice(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public void salvarPedido(String pedido){
        pedidoRepository.salvarPedido(pedido);
    }
}
