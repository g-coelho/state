package org.example;

public class AtletaEstadoTreinadoFisico extends AtletaEstado{

    private AtletaEstadoTreinadoFisico(){};
    private static AtletaEstadoTreinadoFisico instance = new AtletaEstadoTreinadoFisico();
    public static AtletaEstadoTreinadoFisico getInstance(){
        return instance;
    }


    public String getEstado() {
        return "Físico treinado.";
    }
}
