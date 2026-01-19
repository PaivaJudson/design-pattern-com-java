package builder.cominterface;

import java.math.BigDecimal;

public interface IProdutoBuilder {
    IProdutoBuilder nome(String nome);
    IProdutoBuilder preco(BigDecimal preco);
    IProdutoBuilder  categoria(String categoria);
    IProdutoBuilder descricao(String descricao);
    IProdutoBuilder estoque(boolean disponivel);
    Produto build();
}
