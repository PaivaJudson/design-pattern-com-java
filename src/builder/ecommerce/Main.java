package builder.ecommerce;

public class Main {

    public static void main(String[] args) {

        Produto produto = new Produto.Builder("Teclado").build();
        IO.println(produto);

    }
}
