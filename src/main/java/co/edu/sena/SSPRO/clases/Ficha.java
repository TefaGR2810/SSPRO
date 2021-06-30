package co.edu.sena.SSPRO.clases;

import java.util.Date;
import java.util.HashSet;

public class Ficha {

    private int IdFicha;
    private Date IniEtapaElecFicha;
    private Date FinEtapaElecFicha;
    private int JornFicha;
    private int NumbFicha;

    //Constructor

    public Ficha(int idFicha, Date iniEtapaElecFicha, Date finEtapaElecFicha, int jornFicha, int numbFicha) {
        this.IdFicha = idFicha;
        this.IniEtapaElecFicha = iniEtapaElecFicha;
        this.FinEtapaElecFicha = finEtapaElecFicha;
        this.JornFicha = jornFicha;
        this.NumbFicha = numbFicha;
    }

    //Relacion

    HashSet<Usuario> usuarios = new HashSet<Usuario>();
    HashSet<GrupoDeProyecto> grupoDeProyectos = new HashSet<GrupoDeProyecto>();

    //Agregar objetos

    public void setUsuarios(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void setGrupoDeProyectos(GrupoDeProyecto grupoDeProyecto) {
        grupoDeProyectos.add(grupoDeProyecto);
    }

    //Metodos

    public void crearFicha() {
    }

    public void asociarFicha() {
    }

    public void editarFicha() {
    }


    //Getters y Setters nativos de la clase

    public int getIdFicha() {
        return IdFicha;
    }

    public void setIdFicha(int idFicha) {
        IdFicha = idFicha;
    }

    public Date getIniEtapaElecFicha() {
        return IniEtapaElecFicha;
    }

    public void setIniEtapaElecFicha(Date iniEtapaElecFicha) {
        IniEtapaElecFicha = iniEtapaElecFicha;
    }

    public Date getFinEtapaElecFicha() {
        return FinEtapaElecFicha;
    }

    public void setFinEtapaElecFicha(Date finEtapaElecFicha) {
        FinEtapaElecFicha = finEtapaElecFicha;
    }

    public int getJornFicha() {
        return JornFicha;
    }

    public void setJornFicha(int jornFicha) {
        JornFicha = jornFicha;
    }

    public int getNumbFicha() {
        return NumbFicha;
    }

    public void setNumbFicha(int numbFicha) {
        NumbFicha = numbFicha;
    }
}
