package sysdocuments;

public abstract class DocumentoFactory {

    public abstract Documento criarDocumento();

    public void accoesDocumento() {
        Documento documento = criarDocumento();
        documento.abrir();
        documento.salvar();
        documento.fechar();
    }

}
