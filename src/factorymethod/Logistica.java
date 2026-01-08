package factorymethod;

public abstract class Logistica {

    protected abstract Transporte criarTransporte();

    public void planearEntrega() {
        Transporte transporte = criarTransporte();
        transporte.entregar();
    }

}
