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

    @Override
    public boolean treinarTecnico(Atleta atleta) {
        atleta.setEstado(AtletaEstadoTreinadoTecnico.getInstance());
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
