package Liskov;

public class MainPayment {
    public static void main(String[] args) throws Exception {

        NubankRewards creditCard = new NubankRewards();

        creditCard.validate();
        creditCard.collectPayment();
    }
}
