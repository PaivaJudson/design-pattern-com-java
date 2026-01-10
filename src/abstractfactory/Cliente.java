package abstractfactory;

public class Cliente {
    private Cadeira cadeira;
    private Mesa mesa;


    public Cliente(MoveisFactory factory) {
        cadeira = factory.createCadeira();
        mesa = factory.createMesa();
    }

    void testarMoveis(){
        cadeira.sentar();
        mesa.colocarObjeto();
    }


    public static void main(String[] args) {

        MoveisFactory moveisFactory = new FabricaModerna();
        Cliente cliente = new Cliente(moveisFactory);
        cliente.testarMoveis();
    }
}
