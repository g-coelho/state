package org.example;

public class AtletaEstadoRecuperado extends AtletaEstado{

    private AtletaEstadoRecuperado(){};
    private static AtletaEstadoRecuperado instance = new AtletaEstadoRecuperado();
    public static AtletaEstadoRecuperado getInstance(){
        return instance;
    }  

    public String getEstado() {
        return "Recuperado.";
    }
}
