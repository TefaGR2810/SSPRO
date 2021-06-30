package co.edu.sena.SSPRO.clases;

import java.util.HashSet;

public class Rol {

    private int IdRol;
    private String TipoRol;

    //Constructores

    public Rol(int idRol, String tipoRol) {
        this.IdRol = idRol;
        this.TipoRol = tipoRol;
    }

    //Relacion

    HashSet<Usuario> usuarios=new HashSet<Usuario>();

    //agregar objetos

    public void setUsuarios(Usuario usuario){
        usuarios.add(usuario);
    }

    //Metodos

    public void asociarRolUsuario() {
    }

    public void editarRolUsuario() {
    }

    //Getters y Setters nativos de la clase

    public int getIdRol() {
        return IdRol;
    }

    public void setIdRol(int idRol) {
        IdRol = idRol;
    }

    public String getTipoRol() {
        return TipoRol;
    }

    public void setTipoRol(String tipoRol) {
        TipoRol = tipoRol;
    }
}
