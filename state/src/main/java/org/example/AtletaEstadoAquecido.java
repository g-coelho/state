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

    @Override
    public boolean competir(Atleta atleta) {
        atleta.setEstado(AtletaEstadoCompetiu.getInstance());
        return true;
    }

    @Override
    public boolean contratar(Atleta atleta) {
        atleta.setEstado(AtletaEstadoContratado.getInstance());
        return true;
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
}
