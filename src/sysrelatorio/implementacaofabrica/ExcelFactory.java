package sysrelatorio.implementacaofabrica;

import sysrelatorio.Relatorio;
import sysrelatorio.RelatorioFactory;
import sysrelatorio.implementacaoconcreta.RelatorioExcel;

public class ExcelFactory extends RelatorioFactory {
    @Override
    public Relatorio criarRelatorio() {
        return new RelatorioExcel();
    }
}
