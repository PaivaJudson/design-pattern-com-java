package sysrelatorio.implementacaofabrica;

import sysrelatorio.Relatorio;
import sysrelatorio.RelatorioFactory;
import sysrelatorio.implementacaoconcreta.RelatorioPDF;

public class PDFFactory extends RelatorioFactory {
    @Override
    public Relatorio criarRelatorio() {
        return new RelatorioPDF();
    }
}
