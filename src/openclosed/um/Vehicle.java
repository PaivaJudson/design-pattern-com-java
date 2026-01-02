package openclosed.um;

public class Vehicle{

    private String color;
    private String year;
    private double engine;
    private int seats;

    public Vehicle(String color, String year, double engine, int seats){
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;
    }

    void car(){
        System.out.println("Criando um carro: " + color + " year " + year + " com " + seats + " assentos");
        startVehicle();
    }

    void motorCycle(){
        System.out.println("Criando um motor cycle: " + year + " com " + engine + " cilindradas");
    }

    void startVehicle(){
        System.out.println("Ligando motores");
    }
}
