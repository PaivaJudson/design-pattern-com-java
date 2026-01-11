package gemini.factorymethod.logistica.produto.produto;

public class Navio implements Transporte {
    @Override
    public void entregar() {
        IO.println("Entrega feita por Navio");
    }
}
