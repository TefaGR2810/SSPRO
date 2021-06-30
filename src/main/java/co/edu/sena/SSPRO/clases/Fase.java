package co.edu.sena.SSPRO.clases;

import java.util.HashSet;

public class Fase {

    private int IdFase;
    private String NombFase;

    //Constructor

    public Fase(int idFase, String nombFase) {
        this.IdFase = idFase;
        this.NombFase = nombFase;
    }

    //relacion
    HashSet<Entregable> entregables = new HashSet<Entregable>();

    //agregar objetos

    public void setEntregables(Entregable entregable) {
        entregables.add(entregable);
    }

    //Getters y Setters nativos de la clase

    public int getIdFase() {
        return IdFase;
    }

    public void setIdFase(int idFase) {
        IdFase = idFase;
    }

    public String getNombFase() {
        return NombFase;
    }

    public void setNombFase(String nombFase) {
        NombFase = nombFase;
    }
}
