package Liskov;

public interface IPaymentInstrument {

    void validate() throws Exception;
    void collectPayment();
}
