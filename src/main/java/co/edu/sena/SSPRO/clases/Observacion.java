package co.edu.sena.SSPRO.clases;

import java.util.Date;
import java.util.HashSet;

public class Observacion {

    private int IdObservacion;
    private String ContObservacion;
    private Date FechaObservacion;
//Constructor

    public Observacion(int idObservacion, String contObservacion, Date fechaObservacion) {
        this.IdObservacion = idObservacion;
        this.ContObservacion = contObservacion;
        this.FechaObservacion = fechaObservacion;
    }

    //Relacion

    HashSet<Respuesta> respuestas=new HashSet<Respuesta>();
    private Avance avance;
    private Usuario usuario;

    //Agregar objetos

    public void setRespuestas(Respuesta respuesta) {
        respuestas.add(respuesta);
    }

    //Metodos

    public void generarObservacion() {
    }

    public void visualizarObservacion() {
    }

    public void eliminarObservacion() {
    }

    public void editarObservacion() {
    }


    //Getters y Setters nativos de la clase

    public int getIdObservacion() {
        return IdObservacion;
    }

    public void setIdObservacion(int idObservacion) {
        IdObservacion = idObservacion;
    }

    public String getContObservacion() {
        return ContObservacion;
    }

    public void setContObservacion(String contObservacion) {
        ContObservacion = contObservacion;
    }

    public Date getFechaObservacion() {
        return FechaObservacion;
    }

    public void setFechaObservacion(Date fechaObservacion) {
        FechaObservacion = fechaObservacion;
    }
}
