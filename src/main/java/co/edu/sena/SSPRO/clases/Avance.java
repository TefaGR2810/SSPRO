package co.edu.sena.SSPRO.clases;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

public class Avance {

    private int IdAvance;
    private String DescAvance;
    private Date FechaEntreAvance;
    private String ArchAvance;

    //Constructor

    public Avance(int idAvance, String descAvance, Date fechaEntreAvance, String archAvance) {
        this.IdAvance = idAvance;
        this.DescAvance = descAvance;
        this.FechaEntreAvance = fechaEntreAvance;
        this.ArchAvance = archAvance;
    }
//relacion

    HashSet<Observacion> observaciones = new HashSet<Observacion>();
    private GrupoDeProyecto grupoDeProyecto;
    private Entregable entregable;

    //agregar objetos

    public void setObservaciones(Observacion observacion) {
        observaciones.add(observacion);
    }

    //Metodos

    public void visualizarAvance() {
    }

    public void descargarAvance() {
    }

    public void cargarAvance() {
    }

    public void eliminarAvance() {
    }


    //Getters y Setters nativos de la clase
    public int getIdAvance() {
        return IdAvance;
    }

    public void setIdAvance(int idAvance) {
        IdAvance = idAvance;
    }

    public String getDescAvance() {
        return DescAvance;
    }

    public void setDescAvance(String descAvance) {
        DescAvance = descAvance;
    }

    public Date getFechaEntreAvance() {
        return FechaEntreAvance;
    }

    public void setFechaEntreAvance(Date fechaEntreAvance) {
        FechaEntreAvance = fechaEntreAvance;
    }

    public String getArchAvance() {
        return ArchAvance;
    }

    public void setArchAvance(String archAvance) {
        ArchAvance = archAvance;
    }
}
