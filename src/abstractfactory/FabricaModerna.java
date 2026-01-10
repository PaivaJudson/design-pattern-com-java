package abstractfactory;

public class FabricaModerna implements MoveisFactory{
    @Override
    public Cadeira createCadeira() {
        return new CadeiraModerna();
    }

    @Override
    public Mesa createMesa() {
        return new MesaModerna();
    }
}
