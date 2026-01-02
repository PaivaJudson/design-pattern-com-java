package openclosed.dois;

import openclosed.um.TypeVehicle;
import openclosed.um.Vehicle;


public class Main {

    private static TypeVehicle typeVehicle;

    public static void main(String[] args) {

        typeVehicle = TypeVehicle.MOTORCYCLE;

        if (typeVehicle == TypeVehicle.CAR){
            Carro vehicle = new Carro("Amarelo", "2021", 2.0, 4);
            vehicle.car();
        } else if (typeVehicle == TypeVehicle.MOTORCYCLE) {
            Motorizada vehicle = new Motorizada("2021", "2025", 1);
            vehicle.motorCycle();
        }

    }

}
