package Liskov;

public class CreditCard extends NubankCard{

    @Override
    public void validate() throws Exception {
        IO.println("CreditCard validate method");
    }
}
