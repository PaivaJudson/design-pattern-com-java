package adapter;

interface GatewayPagamento {
    void pagar(double valor);
    boolean autorizar();
}


