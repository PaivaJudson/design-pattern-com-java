package gemini.factorymethod.logistica.produto.produto;

public class Caminhao implements Transporte {
    @Override
    public void entregar() {
        IO.println("Entrega feita por Caminhao");
    }
}
