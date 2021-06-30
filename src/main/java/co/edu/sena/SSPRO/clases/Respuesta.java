package co.edu.sena.SSPRO.clases;

import java.util.Date;

public class Respuesta {

    private int IdAvance;
    private String DescAvance;
    private Date FechaEntreAvance;
    private String ArchAvance;

    //Constructor

    public Respuesta(int idAvance, String descAvance, Date fechaEntreAvance, String archAvance) {
        this.IdAvance = idAvance;
        this.DescAvance = descAvance;
        this.FechaEntreAvance = fechaEntreAvance;
        this.ArchAvance = archAvance;
    }

    //Relacion

    private Usuario usuario;
    private Observacion observacion;

    //Metodos

    public void responderObservacion() {
    }

    public void visualizarRespuesta() {
    }

    public void eliminarRespuesta() {
    }

    public void editarRespuesta() {
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
