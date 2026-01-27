package singleton;

public class Direcao {
    private String nome;

    public Direcao(String nome) {
        this.nome = nome;
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
