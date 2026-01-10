package abstractfactory;

public class MesaVitoriana implements Mesa {
    @Override
    public void colocarObjeto() {
        IO.println("Colocando objeto na mesa Vitoriana");
    }
}
