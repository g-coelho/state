package org.example;

public class AtletaEstadoCompetiu extends AtletaEstado{
    private AtletaEstadoCompetiu(){};
    private static AtletaEstadoCompetiu instance = new AtletaEstadoCompetiu();
    public static AtletaEstadoCompetiu getInstance(){
        return instance;
    }


    public String getEstado() {
        return "Competiu.";
    }
}
