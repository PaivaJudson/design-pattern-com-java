package criacional.factory;

import criacional.factory.veiculo.MotorCycle;

public class Main {
    private static Transport transport;

    public static void main(String[] args) {
        configure(args[0]);
        if (transport != null) {
            runTransport();
        }
    }

    private static void runTransport() {
        transport.startTransport();
    }

    private static void configure(String arg) {
        switch (arg) {
            case "uber":
                transport = new CarTransport();
                break;
            case "log":
                transport = new MotorCycleTransport();
        }
    }
}
