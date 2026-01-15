package sysdocuments;

import sysdocuments.concretas.DocumentoTexto;
import sysdocuments.factorys.ApresentacaoFactory;
import sysdocuments.factorys.PlanilhaFactory;
import sysdocuments.factorys.TextoFactory;

public class Main {
    public static void main(String[] args) {

        DocumentoFactory editorTexto = new TextoFactory();
        DocumentoFactory planilha = new PlanilhaFactory();
        DocumentoFactory apresentacao = new ApresentacaoFactory();


        editorTexto.accoesDocumento();
        planilha.accoesDocumento();
        apresentacao.accoesDocumento();



    }
}
