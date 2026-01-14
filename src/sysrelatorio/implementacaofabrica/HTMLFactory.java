package sysrelatorio.implementacaofabrica;

import sysrelatorio.Relatorio;
import sysrelatorio.RelatorioFactory;
import sysrelatorio.implementacaoconcreta.RelatorioHTML;

public class HTMLFactory extends RelatorioFactory {
    @Override
    public Relatorio criarRelatorio() {
        return new RelatorioHTML();
    }
}
