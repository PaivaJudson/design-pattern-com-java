package gemini.factorymethod.fabrica;

import gemini.factorymethod.logistica.produto.produto.Transporte;

public abstract class Logistica {

    public abstract Transporte criarTransporte();

    public void organizarEntrega(){
        Transporte transporte = criarTransporte();
        transporte.entregar();
    }
}
