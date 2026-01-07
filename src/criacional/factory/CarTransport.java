package criacional.factory;

import criacional.factory.veiculo.Car;
import criacional.factory.veiculo.Ivehicle;

public class CarTransport extends Transport{


    @Override
    protected Ivehicle createTransport() {
        return new Car();
    }
}
