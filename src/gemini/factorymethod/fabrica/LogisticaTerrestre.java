package gemini.factorymethod.fabrica;

import gemini.factorymethod.logistica.produto.produto.Caminhao;
import gemini.factorymethod.logistica.produto.produto.Transporte;

public class LogisticaTerrestre extends Logistica {

    @Override
    public Transporte criarTransporte() {
        return new Caminhao();
    }
}
