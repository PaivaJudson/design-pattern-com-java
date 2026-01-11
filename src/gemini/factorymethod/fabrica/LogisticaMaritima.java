package gemini.factorymethod.fabrica;

import gemini.factorymethod.logistica.produto.produto.Navio;
import gemini.factorymethod.logistica.produto.produto.Transporte;

public class LogisticaMaritima extends Logistica{
    @Override
    public Transporte criarTransporte() {
        return new Navio();
    }
}
