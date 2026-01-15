package sysdocuments.factorys;

import sysdocuments.Documento;
import sysdocuments.DocumentoFactory;
import sysdocuments.concretas.Apresentacao;

public class ApresentacaoFactory extends DocumentoFactory {
    @Override
    public Documento criarDocumento() {
        return new Apresentacao();
    }
}
