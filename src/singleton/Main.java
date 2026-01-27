package singleton;

public class Main {
    public static void main(String[] args) {

        Direcao direcao = Direcao.getDirecao("IPIL");

        Direcao direcao2 = Direcao.getDirecao("ISPTEC");
        System.out.println(direcao);
        System.out.println(direcao2);

    }
}
