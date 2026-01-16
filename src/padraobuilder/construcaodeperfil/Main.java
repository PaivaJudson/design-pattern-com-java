package padraobuilder.construcaodeperfil;

import padraobuilder.construcaodeperfil.bom.Utilizador;
import padraobuilder.construcaodeperfil.ruim.Usuario;

public class Main {
    public static void main(String[] args) {
        Utilizador usuario = new Utilizador.UtilizadorBuilder("Judson Paiva", "judson.paiva@hotmail.com")
                .telefone("123456789")
                .endereco("Luanda")
                .ativo(true)
                .idade(14)
                .build();

        IO.println(usuario);
    }
}
