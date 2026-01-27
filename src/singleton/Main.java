package singleton;

public class Main {
    public static void main(String[] args) {

        Direcao direcao = new Direcao("ISPTEC");
        Direcao direcao2 = new Direcao("ISPTEC");
        System.out.println(direcao);
        System.out.println(direcao2);
    }
}
