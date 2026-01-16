package padraobuilder.construcaodeperfil.bom;

public class Utilizador {

    private final String nome;
    private final String email;

    private final String telefone;
    private final String endereco;
    private final int idade;
    private final boolean ativo;

    private Utilizador(UtilizadorBuilder builder){
        this.nome = builder.nome;
        this.email = builder.email;
        this.telefone = builder.telefone;
        this.endereco = builder.endereco;
        this.idade = builder.idade;
        this.ativo = builder.ativo;
    }

    public static class UtilizadorBuilder{
        private final String nome;
        private final String email;

        private String telefone = "";
        private String endereco = "";
        private int idade = 0;
        private boolean ativo = true;


        public UtilizadorBuilder(String nome, String email) {
            this.nome = nome;
            this.email = email;
        }

        public UtilizadorBuilder telefone(String telefone) {
            this.telefone = telefone;
            return this;
        }

        public UtilizadorBuilder endereco(String endereco) {
            this.endereco = endereco;
            return this;
        }

        public UtilizadorBuilder idade(int idade) {
            this.idade = idade;
            return this;
        }

        public UtilizadorBuilder ativo(boolean ativo) {
            this.ativo = ativo;
            return this;
        }

        public Utilizador build(){
            if (nome == null || email == null) {
                throw new IllegalArgumentException("Nome e email sao obrigatorios");
            }
            return new Utilizador(this);
        }
    }


    @Override
    public String toString() {
        return "Utilizador{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", endereco='" + endereco + '\'' +
                ", idade=" + idade +
                ", ativo=" + ativo +
                '}';
    }
}
