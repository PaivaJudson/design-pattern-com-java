package sysrelatorio.implementacaoconcreta;

import sysrelatorio.Relatorio;

public class RelatorioExcel implements Relatorio {
    @Override
    public void gerarRelatorio() {
        IO.println("Gerando Relatorio em Excel");
    }
}
