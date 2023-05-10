package org.example;

public abstract class AtletaEstado {

    public abstract String getEstado();

    public boolean contratar(Atleta atleta){
        return false;
    }

    public boolean treinarFisico(Atleta atleta){
        return false;
    }

    public boolean treinarTecnico(Atleta atleta){
        return false;
    }

    public boolean repousar(Atleta atleta){
        return false;
    }

    public boolean aquecer(Atleta atleta){
        return false;
    }

    public boolean recuperar(Atleta atleta){
        return false;
    }

    public boolean competir(Atleta atleta){
        return false;
    }






}