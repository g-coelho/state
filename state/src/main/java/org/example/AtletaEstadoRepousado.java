package org.example;

public class AtletaEstadoRepousado extends AtletaEstado{
    private AtletaEstadoRepousado(){};
    private static AtletaEstadoRepousado instance = new AtletaEstadoRepousado();
    public static AtletaEstadoRepousado getInstance(){
        return instance;
    }


    public String getEstado() {
       return "Repousado.";
    }
}
