package interfaceSegregation.Vehicle;

import openclosed.um.Vehicle;

public class Car implements IVehicle{

    private String color;
    private String year;
    private double engine;
    private int seats;

    public Car(String color, String year, double engine, int seats) {
        configureCar(color, year, engine, seats);
    }

    @Override
    public void configureCar(String color, String year, double engine, int seats) {
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;
        IO.println("Car configured "+ engine + " " + color + " " + year + " " + seats);
        startVehicle();
    }

    @Override
    public void configureMotorCycle(String color, String year, double engine) {

    }

    @Override
    public void startVehicle() {
        IO.println("Car starting " + color + " " + year + " " + seats);
    }
}
