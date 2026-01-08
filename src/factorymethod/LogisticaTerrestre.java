package factorymethod;

public class LogisticaTerrestre extends Logistica {
    @Override
    protected Transporte criarTransporte() {
        return new Camiao();
    }
}
