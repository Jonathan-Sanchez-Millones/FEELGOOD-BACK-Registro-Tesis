package edu.moduloalumno.entity;

import java.io.Serializable;
import java.util.List;

public class Curso implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private int id_curso;
    
    private String nom_curso;
    
    private String numciclo;
    
    private String numcreditaje;
    
    private String tipocurso;
    
    private String planestudios;
    
    private int id_programa;
    
    private List<Preferencia> preferenciaList;

    public Curso() {
    }

    public Curso(int idCurso) {
        this.id_curso = idCurso;
    }

    public Curso(int idCurso, String nomCurso, String numciclo, String numcreditaje, String tipocurso, String planestudios) {
        this.id_curso = idCurso;
        this.nom_curso = nomCurso;
        this.numciclo = numciclo;
        this.numcreditaje = numcreditaje;
        this.tipocurso = tipocurso;
        this.planestudios = planestudios;
    }

    public int getIdCurso() {
        return id_curso;
    }

    public void setIdCurso(int idCurso) {
        this.id_curso = idCurso;
    }

    public String getNomCurso() {
        return nom_curso;
    }

    public void setNomCurso(String nomCurso) {
        this.nom_curso = nomCurso;
    }

    public String getNumciclo() {
        return numciclo;
    }

    public void setNumciclo(String numciclo) {
        this.numciclo = numciclo;
    }

    public String getNumcreditaje() {
        return numcreditaje;
    }

    public void setNumcreditaje(String numcreditaje) {
        this.numcreditaje = numcreditaje;
    }

    public String getTipocurso() {
        return tipocurso;
    }

    public void setTipocurso(String tipocurso) {
        this.tipocurso = tipocurso;
    }

    public String getPlanestudios() {
        return planestudios;
    }

    public void setPlanestudios(String planestudios) {
        this.planestudios = planestudios;
    }

    public int getIdPrograma() {
        return id_programa;
    }

    public void setIdPrograma(int idPrograma) {
        this.id_programa = idPrograma;
    }

    public List<Preferencia> getPreferenciaList() {
        return preferenciaList;
    }

    public void setPreferenciaList(List<Preferencia> preferenciaList) {
        this.preferenciaList = preferenciaList;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_curso;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		if (id_curso != other.id_curso)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Curso [idCurso=" + id_curso + ", nomCurso=" + nom_curso + ", numciclo=" + numciclo + ", numcreditaje="
				+ numcreditaje + ", tipocurso=" + tipocurso + ", planestudios=" + planestudios + ", idPrograma="
				+ id_programa + ", preferenciaList=" + preferenciaList + "]";
	}
   
}
