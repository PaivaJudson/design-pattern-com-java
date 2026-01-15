package sysdocuments.concretas;

import sysdocuments.Documento;

public class DocumentoTexto implements Documento {
    @Override
    public void abrir() {
        IO.println("abrir doc de texto");
    }

    @Override
    public void salvar() {
        IO.println("salvar doc de texto");
    }

    @Override
    public void fechar() {
        IO.println("fechar doc de texto");
    }
}
