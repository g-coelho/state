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

    @Override
    public boolean treinarFisico(Atleta atleta) {
        atleta.setEstado(AtletaEstadoTreinadoFisico.getInstance());
        return true;
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

    @Override
    public boolean competir(Atleta atleta) {
        atleta.setEstado(AtletaEstadoCompetiu.getInstance());
        return true;
    }

    @Override
    public boolean aquecer(Atleta atleta) {
        atleta.setEstado(AtletaEstadoAquecido.getInstance());
        return true;
    }






}


