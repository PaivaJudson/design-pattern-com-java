package padraobuilder.construcaodeperfil.ruim;

public class Usuario {
    private String nome;
    private String email;
    private String endereco;
    private String telefone;
    private int idade;
    private boolean ativo;


    public Usuario(String nome, String email, String endereco, String telefone, int idade, boolean ativo) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
        this.idade = idade;
        this.ativo = ativo;
    }

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this(nome,email,null,null,0,false);
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public int getIdade() {
        return idade;
    }

    public boolean isAtivo() {
        return ativo;
    }
}
