package org.example;

public class AtletaEstadoContratado extends AtletaEstado{
    
    private AtletaEstadoContratado(){};
    private static AtletaEstadoContratado instance = new AtletaEstadoContratado();
    public static AtletaEstadoContratado getInstance(){
        return instance;
    }

    public String getEstado() {
        return "Contratado.";
    }

    public boolean treinarFisico(Atleta atleta){
        atleta.setEstado(AtletaEstadoTreinadoFisico.getInstance());
        return true;
    }

    public boolean treinarTecnico(Atleta atleta){
        atleta.setEstado(AtletaEstadoTreinadoTecnico.getInstance());
        return true;
    }

    public boolean repousar(Atleta atleta){
        atleta.setEstado(AtletaEstadoRepousado.getInstance());
        return true;
    }

    public boolean aquecer(Atleta atleta){
        atleta.setEstado(AtletaEstadoAquecido.getInstance());
        return true;
    }

    public boolean recuperar(Atleta atleta){
        atleta.setEstado(AtletaEstadoRecuperado.getInstance());
        return true;
    }

    public boolean competir(Atleta atleta){
        atleta.setEstado(AtletaEstadoCompetiu.getInstance());
        return true;
    }


}
