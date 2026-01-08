package criacional.factory.veiculo;

public class Car implements Ivehicle {

    @Override
    public void startRoute() {
        IO.println("Iniciando o trajeto");
    }

    @Override
    public void getCargo() {
        IO.println("Pegamos os passageiros");
    }
}
