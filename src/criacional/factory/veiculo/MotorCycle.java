package criacional.factory.veiculo;

public class MotorCycle implements Ivehicle {

    @Override
    public void startRoute() {
        IO.println("Iniciamos a entrega");
    }

    @Override
    public void getCargo() {
        IO.println("Pegamos a encomenda");
    }
}
