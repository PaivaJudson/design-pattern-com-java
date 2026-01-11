package gemini.factorymethod;

import gemini.factorymethod.fabrica.Logistica;
import gemini.factorymethod.fabrica.LogisticaMaritima;
import gemini.factorymethod.fabrica.LogisticaTerrestre;

public class SistemaPrincipal {
    public static void main(String[] args) {

        Logistica logistica;

        String type = "terra";

        if (type.equals("terra")) {
            logistica = new LogisticaTerrestre();
        }else {
            logistica = new LogisticaMaritima();
        }

        executarNegocio(logistica);

    }

    private static void executarNegocio(Logistica logistica) {
        IO.println("Iniciando Negocio... ");
        logistica.organizarEntrega();
    }
}
