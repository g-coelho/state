package org.example;

public class AtletaEstadoTreinadoTecnico extends AtletaEstado{

    private AtletaEstadoTreinadoTecnico(){};
    private static AtletaEstadoTreinadoTecnico instance = new AtletaEstadoTreinadoTecnico();
    public static AtletaEstadoTreinadoTecnico getInstance(){
        return instance;
    }


    public String getEstado() {
        return "Técnico treinado.";
    }
}
