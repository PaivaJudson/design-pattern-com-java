package Liskov;

public class NubankRewards implements IPaymentInstrument{

    @Override
    public void validate() throws Exception {
        IO.println("NubankRewards validate method OK");
    }

    @Override
    public void collectPayment() {
        IO.println("NubankRewards collectPayment method Sucesso");
        IO.println("Pontuacao realizada com sucesso");
    }
}
