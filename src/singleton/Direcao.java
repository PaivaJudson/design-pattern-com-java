package singleton;

public class Direcao {
    private static Direcao direcao;
    private String nome;

    private Direcao(String nome) {
        this.nome = nome;
    }

    public static Direcao getDirecao(String nome) {
        if (direcao == null) {
            direcao = new Direcao(nome);
        }
        return direcao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Direcao {" +
                "nome='" + nome + '\'' +
                '}';
    }
}
