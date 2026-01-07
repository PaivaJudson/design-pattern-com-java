package criacional.factory;

import criacional.factory.veiculo.Ivehicle;
import criacional.factory.veiculo.MotorCycle;

public class MotorCycleTransport extends Transport {


    @Override
    protected Ivehicle createTransport() {
        return new MotorCycle();
    }
}
