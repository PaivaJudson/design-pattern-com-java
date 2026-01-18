package builder.ecommerce;

public class Produto {

    private final String nome;
    private final String descricao;
    private final double preco;
    private final String categoria;
    private final String marca;
    private final int estoque;
    private final boolean disponivel;

    private Produto(Builder builder) {
        this.nome = builder.nome;
        this.descricao = builder.descricao;
        this.preco = builder.preco;
        this.categoria = builder.categoria;
        this.marca = builder.marca;
        this.estoque = builder.estoque;
        this.disponivel = builder.disponivel;
    }

    public static class Builder {
        private final String nome;
        private String descricao = "";
        private double preco = 0.0;
        private String categoria = "";
        private String marca = "";
        private int estoque = 0;
        private boolean disponivel = false;

        public Builder(String nome) {
            this.nome = nome;
        }

        public Builder descricao(String descricao) {
            this.descricao = descricao;
            return this;
        }

        public Builder preco(double preco) {
            this.preco = preco;
            return this;
        }

        public Builder categoria(String categoria) {
            this.categoria = categoria;
            return this;
        }

        public Builder marca(String marca) {
            this.marca = marca;
            return this;
        }

        public Builder estoque(int estoque) {
            this.estoque = estoque;
            return this;
        }

        public Builder disponivel(boolean disponivel) {
            this.disponivel = disponivel;
            return this;
        }

        public Produto build() {
            if (this.nome == null) {
                throw new IllegalStateException("Definir nome do Produto");
            }
            return new Produto(this);
        }
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", categoria='" + categoria + '\'' +
                ", marca='" + marca + '\'' +
                ", estoque=" + estoque +
                ", disponivel=" + disponivel +
                '}';
    }
}
