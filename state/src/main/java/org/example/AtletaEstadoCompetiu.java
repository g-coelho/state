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

    @Override
    public boolean repousar(Atleta atleta) {
        atleta.setEstado(AtletaEstadoRepousado.getInstance());
        return true;
    }

    @Override
    public boolean recuperar(Atleta atleta) {
        atleta.setEstado(AtletaEstadoRecuperado.getInstance());
        return true;
    }

    @Override
    public boolean contratar(Atleta atleta) {
        atleta.setEstado(AtletaEstadoContratado.getInstance());
        return true;
    }


}


