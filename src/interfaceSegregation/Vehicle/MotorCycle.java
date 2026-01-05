package interfaceSegregation.Vehicle;

public class MotorCycle implements IVehicle, VeiculoMotorCycle{
    private String color;
    private String year;
    private double engine;


    public MotorCycle(String color, String year, double engine) {
        configureMotorCycle(color, year, engine);
    }

    @Override
    public void configureMotorCycle(String color, String year, double engine) {
        this.color = color;
        this.year = year;
        this.engine = engine;
        IO.println("Motor configureCar method "+color+" "+year+" "+engine);
        startVehicle();
    }

    @Override
    public void startVehicle() {
        IO.println("MotorCycle startVehicle method");
    }
}
