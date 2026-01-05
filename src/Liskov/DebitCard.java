package Liskov;

public class DebitCard extends NubankCard {

    @Override
    public void validate() throws Exception {
        IO.println("DebitCard validate method");
    }
}
