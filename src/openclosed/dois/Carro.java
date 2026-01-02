package openclosed.dois;

public class Carro extends Veiculo{

    private int acentos;

    public Carro(String cor, String year, double engine, int acentos) {
        super(cor, year, engine);
        this.acentos = acentos;
    }

    public void car(){
        System.out.println("Criando um carro: " + cor + " year " + year + " com " + acentos + " assentos");
        startVehicle();
    }
}
