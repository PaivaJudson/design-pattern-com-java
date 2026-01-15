package sysdocuments.concretas;

import sysdocuments.Documento;

public class Planilha implements Documento {
    @Override
    public void abrir() {
        IO.println("abrir planilha");
    }

    @Override
    public void salvar() {
        IO.println("salvar planilha");
    }

    @Override
    public void fechar() {
        IO.println("fechar planilha");
    }
}
