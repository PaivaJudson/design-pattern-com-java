package sysrelatorio;

public abstract class RelatorioFactory {

    protected abstract Relatorio criarRelatorio();

    public void elaborarRelatorio() {
        Relatorio relatorio = criarRelatorio();
        relatorio.gerarRelatorio();
    }
}
