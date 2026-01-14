package sysrelatorio.implementacaoconcreta;

import sysrelatorio.Relatorio;

public class RelatorioPDF implements Relatorio {
    @Override
    public void gerarRelatorio() {
        IO.println("Gerando Relatorio em PDF");
    }
}
