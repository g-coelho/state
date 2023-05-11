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

    @Override
    public boolean contratar(Atleta atleta) {
        atleta.setEstado(AtletaEstadoContratado.getInstance());
        return true;
    }

    @Override
    public boolean treinarTecnico(Atleta atleta) {
        atleta.setEstado(AtletaEstadoTreinadoTecnico.getInstance());
        return true;
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

