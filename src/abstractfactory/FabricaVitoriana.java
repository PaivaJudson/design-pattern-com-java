package abstractfactory;

public class FabricaVitoriana implements MoveisFactory{
    @Override
    public Cadeira createCadeira() {
        return new CadeiraVitoriana();
    }

    @Override
    public Mesa createMesa() {
        return new MesaVitoriana();
    }
}
