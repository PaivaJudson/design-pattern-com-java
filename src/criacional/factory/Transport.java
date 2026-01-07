package criacional.factory;

import criacional.factory.veiculo.Ivehicle;

public abstract class Transport {
    void startTransport() {
        Ivehicle vehicle = createTransport();
    }
    protected abstract Ivehicle createTransport();
}
