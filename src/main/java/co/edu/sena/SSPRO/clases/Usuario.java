package co.edu.sena.SSPRO.clases;

import java.util.Date;
import java.util.HashSet;

public class Usuario {

    private int IdUsuario;
    private String NombUsuario;
    private String ApelUsuario;
    private String TipoDocuUsuario;
    private Date FechaNaciUsuario;
    private String CorreoUsuario;
    private String ContUsuario;

    //Constructor

    public Usuario(int idUsuario, String nombUsuario, String apelUsuario, String tipoDocuUsuario, Date fechaNaciUsuario, String correoUsuario, String contUsuario) {
        this.IdUsuario = idUsuario;
        this.NombUsuario = nombUsuario;
        this.ApelUsuario = apelUsuario;
        this.TipoDocuUsuario = tipoDocuUsuario;
        this.FechaNaciUsuario = fechaNaciUsuario;
        this.CorreoUsuario = correoUsuario;
        this.ContUsuario = contUsuario;
    }

    //Relaciones

    HashSet<Observacion> observaciones=new HashSet<Observacion>();
    HashSet<Respuesta> respuestas=new HashSet<Respuesta>();
    HashSet<Ficha> fichas=new HashSet<Ficha>();
    private Rol rol;
    private GrupoDeProyecto grupoDeProyecto;

    //agregar objetos

    public void setObservaciones (Observacion observacion){
        observaciones.add(observacion);
    }

    public void setRespuestas(Respuesta respuesta){
        respuestas.add(respuesta);
    }

    public void setFichas(Ficha ficha){
        fichas.add(ficha);
    }

    //Metodos

    public void registrarUsuario() {
    }

    public void consultarUsuario() {
    }

    public void actualizarUsuario() {
    }

    public void inhabilitarUsuario() {
    }


    //Getters y Setters nativos de la clase

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        IdUsuario = idUsuario;
    }

    public String getNombUsuario() {
        return NombUsuario;
    }

    public void setNombUsuario(String nombUsuario) {
        NombUsuario = nombUsuario;
    }

    public String getApelUsuario() {
        return ApelUsuario;
    }

    public void setApelUsuario(String apelUsuario) {
        ApelUsuario = apelUsuario;
    }

    public String getTipoDocuUsuario() {
        return TipoDocuUsuario;
    }

    public void setTipoDocuUsuario(String tipoDocuUsuario) {
        TipoDocuUsuario = tipoDocuUsuario;
    }

    public Date getFechaNaciUsuario() {
        return FechaNaciUsuario;
    }

    public void setFechaNaciUsuario(Date fechaNaciUsuario) {
        FechaNaciUsuario = fechaNaciUsuario;
    }

    public String getCorreoUsuario() {
        return CorreoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        CorreoUsuario = correoUsuario;
    }

    public String getContUsuario() {
        return ContUsuario;
    }

    public void setContUsuario(String contUsuario) {
        ContUsuario = contUsuario;
    }


}
