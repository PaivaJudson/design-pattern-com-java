package sysdocuments.factorys;

import sysdocuments.Documento;
import sysdocuments.DocumentoFactory;
import sysdocuments.concretas.Planilha;

public class PlanilhaFactory extends DocumentoFactory {
    @Override
    public Documento criarDocumento() {
        return new Planilha();
    }
}
