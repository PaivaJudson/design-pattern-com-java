package interfaceSegregation.Vehicle;

public class Main {
    private static String type;
    public static void main(String[] args) {

        type = "Motorcycle";
        if (type.equals("Car")) {
            Car car = new Car("Branco", "2022", 2.6, 4);
        }else if (type.equals("Motorcycle")) {
            MotorCycle motorCycle = new MotorCycle("Branca", "2022", 250);
        }

    }
}
