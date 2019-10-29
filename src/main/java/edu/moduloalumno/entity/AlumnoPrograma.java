package edu.moduloalumno.entity;

import java.io.Serializable;

public class AlumnoPrograma implements Serializable {

    private static final long serialVersionUID = 1L;
   
    private String cod_alumno;
    
    private String ape_paterno;
    
    private String ape_materno;
    
    private String nom_alumno;
    
    private String cod_especialidad;
    
    private String cod_tip_ingreso;
    
    private String cod_situ;
    
    private String cod_perm;
    
    private String anio_ingreso;
    
    private String dni_m;
    
    private Integer id_programa;
    
	

	public String getCod_alumno() {
		return cod_alumno;
	}

	public void setCod_alumno(String cod_alumno) {
		this.cod_alumno = cod_alumno;
	}

	public String getApe_paterno() {
		return ape_paterno;
	}

	public void setApe_paterno(String ape_paterno) {
		this.ape_paterno = ape_paterno;
	}

	public String getApe_materno() {
		return ape_materno;
	}

	public void setApe_materno(String ape_materno) {
		this.ape_materno = ape_materno;
	}

	public String getNom_alumno() {
		return nom_alumno;
	}

	public void setNom_alumno(String nom_alumno) {
		this.nom_alumno = nom_alumno;
	}

	public String getCod_especialidad() {
		return cod_especialidad;
	}

	public void setCod_especialidad(String cod_especialidad) {
		this.cod_especialidad = cod_especialidad;
	}

	public String getCod_tip_ingreso() {
		return cod_tip_ingreso;
	}

	public void setCod_tip_ingreso(String cod_tip_ingreso) {
		this.cod_tip_ingreso = cod_tip_ingreso;
	}

	public String getCod_situ() {
		return cod_situ;
	}

	public void setCod_situ(String cod_situ) {
		this.cod_situ = cod_situ;
	}

	public String getCod_perm() {
		return cod_perm;
	}

	public void setCod_perm(String cod_perm) {
		this.cod_perm = cod_perm;
	}

	public String getAnio_ingreso() {
		return anio_ingreso;
	}

	public void setAnio_ingreso(String anio_ingreso) {
		this.anio_ingreso = anio_ingreso;
	}

	public String getDni_m() {
		return dni_m;
	}

	public void setDni_m(String dni_m) {
		this.dni_m = dni_m;
	}

	public Integer getId_programa() {
		return id_programa;
	}

	public void setId_programa(Integer id_programa) {
		this.id_programa = id_programa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cod_alumno == null) ? 0 : cod_alumno.hashCode());
		result = prime * result + ((id_programa == null) ? 0 : id_programa.hashCode());
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
		AlumnoPrograma other = (AlumnoPrograma) obj;
		if (cod_alumno == null) {
			if (other.cod_alumno != null)
				return false;
		} else if (!cod_alumno.equals(other.cod_alumno))
			return false;
		if (id_programa == null) {
			if (other.id_programa != null)
				return false;
		} else if (!id_programa.equals(other.id_programa))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AlumnoPrograma [codAlumno=" + cod_alumno + ", apePaterno=" + ape_paterno + ", apeMaterno=" + ape_materno
				+ ", nomAlumno=" + nom_alumno + ", codEspecialidad=" + cod_especialidad + ", codTipIngreso="
				+ cod_tip_ingreso + ", codSitu=" + cod_situ + ", codPerm=" + cod_perm + ", anioIngreso=" + anio_ingreso
				+ ", dniM=" + dni_m + ", idPrograma=" + id_programa + "]";
	}
    
    
    
}
