package openclosed.dois;

public class Veiculo {

    protected String cor;
    protected String year;
    protected double engine;

    public Veiculo(String cor, String year, double engine) {
        this.cor = cor;
        this.year = year;
        this.engine = engine;
    }

    void startVehicle(){
        System.out.println("Ligando motores");
    }
}
