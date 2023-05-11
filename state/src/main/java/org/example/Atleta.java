package org.example;

public class Atleta {
    private String nome;
    private AtletaEstado estado;

    public Atleta(){
        this.estado = AtletaEstadoContratado.getInstance();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public AtletaEstado getEstado() {
        return estado;
    }

    public void setEstado(AtletaEstado estado) {
        this.estado = estado;
    }


    public boolean contratar(){
        return estado.contratar(this);
    }

    public boolean treinarFisico(){
        return estado.treinarFisico(this);
    }

    public boolean treinarTecnico(){
        return estado.treinarTecnico(this);
    }

    public boolean repousar(){
        return estado.repousar(this);
    }

    public boolean aquecer(){
        return estado.aquecer(this);
    }

    public boolean recuperar(){
        return estado.recuperar(this);
    }

    public boolean competir(){
        return estado.competir(this);
    }








}





