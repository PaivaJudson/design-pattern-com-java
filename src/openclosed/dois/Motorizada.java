package openclosed.dois;

public class Motorizada extends Veiculo{


    public Motorizada(String cor, String year, double engine) {
        super(cor, year, engine);
        motorCycle();
    }

    public void motorCycle(){
        System.out.println("Criando um motor cycle: " + year + " com " + engine + " cilindradas");
        startVehicle();
    }
}
