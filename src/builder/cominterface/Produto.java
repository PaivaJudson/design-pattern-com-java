package builder.cominterface;

import java.math.BigDecimal;
import java.util.Objects;

public class Produto {
    private final   String nome;
    private final double preco;
    private final String categoria;
    private final String descricao;
    private final boolean disponivel;
    private final int estoque;


    public Produto(String nome, BigDecimal preco, String categoria, String descricao,
                   boolean disponivel, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.descricao = descricao;
        this.disponivel = disponivel;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public int getEstoque() {
        return estoque;
    }

    public boolean temEstoque(){
        return estoque > 0;
    }

    public double calcularPrecoComDesconto(double percentualDesconto){
        if (percentualDesconto <= 0 || percentualDesconto > 100){
            throw new IllegalArgumentException("Desconto deve estar entre 0 e 100%");
        }
        return preco * (1 - percentualDesconto / 100);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", categoria='" + categoria + '\'' +
                ", descricao='" + descricao + '\'' +
                ", disponivel=" + disponivel +
                ", estoque=" + estoque +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(nome, produto.nome) && Objects.equals(categoria, produto.categoria) && Objects.equals(descricao, produto.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, categoria, descricao);
    }
}
