package co.edu.sena.SSPRO.clases;

import java.util.Date;
import java.util.HashSet;

public class Entregable {

    private int IdEntregable;
    private String TituEntregable;
    private String TrimEntregable;
    private String DescEntregable;
    private Date FechaInicEntregable;
    private Date FechaFinEntregable;
    private String ArchEntregable;
    private int InstructorSegEntregable;


    //Constructor

    public Entregable(int idEntregable, String tituEntregable, String trimEntregable, String descEntregable, Date fechaInicEntregable, Date fechaFinEntregable, String archEntregable) {
        this.IdEntregable = idEntregable;
        this.TituEntregable = tituEntregable;
        this.TrimEntregable = trimEntregable;
        this.DescEntregable = descEntregable;
        this.FechaInicEntregable = fechaInicEntregable;
        this.FechaFinEntregable = fechaFinEntregable;
        this.ArchEntregable = archEntregable;
    }

    //relacion
    HashSet<Avance> avances = new HashSet<Avance>();
    private Fase fase;

    //agregar objetos

    public void setAvances(Avance avance) {
        avances.add(avance);
    }

    //Metodos

    public void visualizarEntregable() {
    }

    public void descargarEntregable() {
    }

    public void cargarEntregable() {
    }

    public void eliminarEntregable() {
    }

    public void crearEspacioEntregable() {
    }


    //Getters y Setters nativos de la clase

    public int getIdEntregable() {
        return IdEntregable;
    }

    public void setIdEntregable(int idEntregable) {
        IdEntregable = idEntregable;
    }

    public String getTituEntregable() {
        return TituEntregable;
    }

    public void setTituEntregable(String tituEntregable) {
        TituEntregable = tituEntregable;
    }

    public String getTrimEntregable() {
        return TrimEntregable;
    }

    public void setTrimEntregable(String trimEntregable) {
        TrimEntregable = trimEntregable;
    }

    public String getDescEntregable() {
        return DescEntregable;
    }

    public void setDescEntregable(String descEntregable) {
        DescEntregable = descEntregable;
    }

    public Date getFechaInicEntregable() {
        return FechaInicEntregable;
    }

    public void setFechaInicEntregable(Date fechaInicEntregable) {
        FechaInicEntregable = fechaInicEntregable;
    }

    public Date getFechaFinEntregable() {
        return FechaFinEntregable;
    }

    public void setFechaFinEntregable(Date fechaFinEntregable) {
        FechaFinEntregable = fechaFinEntregable;
    }

    public String getArchEntregable() {
        return ArchEntregable;
    }

    public void setArchEntregable(String archEntregable) {
        ArchEntregable = archEntregable;
    }

    public int getInstructorSegEntregable() {
        return InstructorSegEntregable;
    }

    public void setInstructorSegEntregable(int instructorSegEntregable) {
        InstructorSegEntregable = instructorSegEntregable;
    }
}
