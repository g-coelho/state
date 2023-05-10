package org.example;

public class AtletaEstadoAquecido extends AtletaEstado{

    private AtletaEstadoAquecido(){};
    private static AtletaEstadoAquecido instance = new AtletaEstadoAquecido();
    public static AtletaEstadoAquecido getInstance(){
        return instance;
    }    
    
    
    public String getEstado() {
        return "Aquecido.";
    }
}
