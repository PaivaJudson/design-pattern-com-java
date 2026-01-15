package sysdocuments.concretas;

import sysdocuments.Documento;

public class Apresentacao implements Documento {
    @Override
    public void abrir() {
        IO.println("abrir doc de apresentacao");
    }

    @Override
    public void salvar() {
        IO.println("salvar doc de apresentacao");
    }

    @Override
    public void fechar() {
        IO.println("fechar doc de apresentacao");
    }
}
