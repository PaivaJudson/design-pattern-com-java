package abstractfactory;

public class CadeiraModerna implements Cadeira {

    @Override
    public void sentar() {
        IO.println("Cadeira Moderna");
    }
}
