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

    @Override
    public boolean treinarFisico(Atleta atleta) {
        atleta.setEstado(AtletaEstadoTreinadoFisico.getInstance());
        return true;
    }

    @Override
    public boolean treinarTecnico(Atleta atleta) {
        atleta.setEstado(AtletaEstadoTreinadoTecnico.getInstance());
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
