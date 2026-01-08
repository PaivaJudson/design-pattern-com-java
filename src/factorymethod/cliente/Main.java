package factorymethod.cliente;

import factorymethod.Logistica;
import factorymethod.LogisticaTerrestre;
import factorymethod.Transporte;

public class Main {
    public static void main(String[] args) {
        Logistica logistica = new LogisticaTerrestre();
        logistica.planearEntrega();
    }
}
