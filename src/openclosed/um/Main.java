package openclosed.um;

public class Main {

    private static TypeVehicle typeVehicle;

    public static void main(String[] args) {

        typeVehicle = TypeVehicle.CAR;

        if (typeVehicle == TypeVehicle.CAR){
            Vehicle vehicle = new Vehicle("Amarelo", "2021", 2.0, 4);
            vehicle.car();
        } else if (typeVehicle == TypeVehicle.MOTORCYCLE) {
            Vehicle vehicle = new Vehicle("", "2021", 2.0, 1);
            vehicle.motorCycle();
        }


    }

}
