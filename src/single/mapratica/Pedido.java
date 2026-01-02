package single.mapratica;

public class Pedido {

    public void adicionarItem(String item){
        System.out.println("Adicionando "+item);
    }

    public double calcular(){
        return 100.0;
    }

    public void salvarNoBanco(){
        System.out.println("Salvo com sucesso no MYSQL...!");
    }

    public void enviarConfirmarEmail(){
        System.out.println("Enviando email de confirmacao...");
    }
}
