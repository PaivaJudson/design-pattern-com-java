package builder.ecommerce;

import builder.cominterface.IProdutoBuilder;
import builder.cominterface.Produto;

import java.math.BigDecimal;

public class ProdutoBuilder implements IProdutoBuilder {

    private String nome;
    private double preco;
    private String categoria = "Geral";
    private String descricao = "";
    private boolean disponivel = true;
    private int estoque = 0;


    public ProdutoBuilder(){

    }

    public ProdutoBuilder(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public IProdutoBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public IProdutoBuilder preco(double preco) {
        this.preco = preco;
        return this;
    }

    @Override
    public IProdutoBuilder categoria(String categoria) {
        this.categoria = categoria;
        return this;
    }

    @Override
    public IProdutoBuilder descricao(String descricao) {
        this.descricao = "🔥 PROMOÇÃO: " + descricao + " 🔥";
        return this;
    }

    @Override
    public IProdutoBuilder estoque(boolean disponivel) {
        this.disponivel = disponivel;
        return this;
    }

    @Override
    public Produto build() {
        return new Produto(nome, preco, categoria, descricao, disponivel, estoque);
    }

    public static ProdutoBuilder criar() {
        return new ProdutoBuilder();
    }

    public static ProdutoBuilder criar(String nome, double preco) {
        return new ProdutoBuilder(nome, preco);
    }
}
