package abstractfactory;

public class MesaModerna implements Mesa {

    @Override
    public void colocarObjeto() {
        IO.println("Colocando objeto na mesa Moderna.");
    }
}
