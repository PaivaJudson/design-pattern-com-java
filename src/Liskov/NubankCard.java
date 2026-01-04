package Liskov;

abstract public class NubankCard implements IPaymentInstrument{


    @Override
    public void validate() throws Exception {

    }

    @Override
    public void collectPayment() {
        IO.println("Pagamento realizado");
    }
}
