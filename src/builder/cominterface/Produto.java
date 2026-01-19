package builder.cominterface;

import java.math.BigDecimal;

public class Produto {
    private final   String nome;
    private final BigDecimal preco;
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
}
