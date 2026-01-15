package sysdocuments.factorys;

import sysdocuments.Documento;
import sysdocuments.DocumentoFactory;
import sysdocuments.concretas.DocumentoTexto;

public class TextoFactory extends DocumentoFactory {
    @Override
    public Documento criarDocumento() {
        return new DocumentoTexto();
    }
}
