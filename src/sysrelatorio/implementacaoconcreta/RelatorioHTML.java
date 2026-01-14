package sysrelatorio.implementacaoconcreta;

import sysrelatorio.Relatorio;

public class RelatorioHTML implements Relatorio {
    @Override
    public void gerarRelatorio() {
        IO.println("Gerando Relatorio em HTML");
    }
}
