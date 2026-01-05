package interfaceSegregation.Vehicle;

public interface IVehicle {

    public void configureCar(String color, String year, double engine, int seats);
    public void configureMotorCycle(String color, String year, double engine);
    public void startVehicle();

    
}
