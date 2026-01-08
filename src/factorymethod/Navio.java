package factorymethod;

public class Navio implements Transporte {

    @Override
    public void entregar() {
        IO.println("Entrega por navio");
    }
}
