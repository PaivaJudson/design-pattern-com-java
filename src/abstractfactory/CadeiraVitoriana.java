package abstractfactory;

public class CadeiraVitoriana implements Cadeira {
    @Override
    public void sentar() {
        IO.println("Cadeira Vitoriana");
    }
}
