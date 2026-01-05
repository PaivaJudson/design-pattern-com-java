package interfaceSegregation.Vehicle;

public class MotorCycle implements IVehicle{
    private String color;
    private String year;
    private double engine;


    public MotorCycle(String color, String year, double engine) {
        configureMotorCycle(color, year, engine);
    }

    @Override
    public void configureCar(String color, String year, double engine, int seats) {

    }

    @Override
    public void configureMotorCycle(String color, String year, double engine) {
        this.color = color;
        this.year = year;
        this.engine = engine;
        IO.println("DebitCard configureCar method "+color+" "+year+" "+engine);
        startVehicle();
    }

    @Override
    public void startVehicle() {
        IO.println("MotorCycle startVehicle method");
    }
}
