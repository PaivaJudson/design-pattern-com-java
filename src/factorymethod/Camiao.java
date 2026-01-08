package factorymethod;

public class Camiao implements Transporte {

    @Override
    public void entregar() {
        IO.println("Entrega por camiao");
    }
}
