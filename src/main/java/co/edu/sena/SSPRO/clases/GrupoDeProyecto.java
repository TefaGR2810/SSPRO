package co.edu.sena.SSPRO.clases;

import java.util.HashSet;

public class GrupoDeProyecto {

    private int IdGrupo;
    private String NombGrupo;
    private String DescGrupo;
    private String AlcaGrupo;

    //Constructor

    public GrupoDeProyecto(int idGrupo, String nombGrupo, String descGrupo, String alcaGrupo) {
        this.IdGrupo = idGrupo;
        this.NombGrupo = nombGrupo;
        this.DescGrupo = descGrupo;
        this.AlcaGrupo = alcaGrupo;
    }

    //Relacion

    HashSet<Usuario> usuarios=new HashSet<Usuario>();
    HashSet<Avance> avances=new HashSet<Avance>();
    private Ficha ficha;

    //Agregar objetos

    public void setUsuarios(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void setAvances(Avance avance){
        avances.add(avance);
    }

    //Metodos

    public void crearGrupo() {
    }

    public void visualizarGrupo() {
    }

    public void actualizarGrupo() {
    }

    public void editarGrupo() {
    }

    //Getters y Setters

    //Getters y Setters nativos de la clase

    public int getIdGrupo() {
        return IdGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        IdGrupo = idGrupo;
    }

    public String getNombGrupo() {
        return NombGrupo;
    }

    public void setNombGrupo(String nombGrupo) {
        NombGrupo = nombGrupo;
    }

    public String getDescGrupo() {
        return DescGrupo;
    }

    public void setDescGrupo(String descGrupo) {
        DescGrupo = descGrupo;
    }

    public String getAlcaGrupo() {
        return AlcaGrupo;
    }

    public void setAlcaGrupo(String alcaGrupo) {
        AlcaGrupo = alcaGrupo;
    }
}
