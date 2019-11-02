package edu.moduloalumno.entity;

import java.util.Date;

public class Tesisss {

	private String atematesis_titulo;
	private String atematesis_situacion;
	private String atematesis_problema;
	private String atematesis_justificacion;
	private Date atematesis_fecha;
	private String atematesis_comentario;
	private int gi_id;
	private Integer id_curso;
	private Integer planestudios;
	private Integer id_docente;
	private int estado_id;
	private Integer rol_id;
	
	public Tesisss() {}
	
	public Tesisss(String atematesis_titulo, String atematesis_situacion, String atematesis_problema,
			String atematesis_justificacion, Date atematesis_fecha, String atematesis_comentario, int gi_id,
			Integer id_curso, Integer planestudios,Integer id_docente,int estado_id, Integer rol_id) {
		
		this.atematesis_titulo = atematesis_titulo;
		this.atematesis_situacion = atematesis_situacion;
		this.atematesis_problema = atematesis_problema;
		this.atematesis_justificacion = atematesis_justificacion;
		this.atematesis_fecha = atematesis_fecha;
		this.atematesis_comentario = atematesis_comentario;
		this.gi_id = gi_id;
		this.id_curso = id_curso;
		this.planestudios=planestudios;
		this.id_docente=id_docente;
		this.estado_id = estado_id;
		this.rol_id = rol_id;
	}

	
	public Integer getPlanestudios() {
		return planestudios;
	}

	public void setPlanestudios(Integer planestudios) {
		this.planestudios = planestudios;
	}

	public Integer getId_docente() {
		return id_docente;
	}

	public void setId_docente(Integer id_docente) {
		this.id_docente = id_docente;
	}

	public String getAtematesis_titulo() {
		return atematesis_titulo;
	}

	public void setAtematesis_titulo(String atematesis_titulo) {
		this.atematesis_titulo = atematesis_titulo;
	}

	public String getAtematesis_situacion() {
		return atematesis_situacion;
	}

	public void setAtematesis_situacion(String atematesis_situacion) {
		this.atematesis_situacion = atematesis_situacion;
	}

	public String getAtematesis_problema() {
		return atematesis_problema;
	}

	public void setAtematesis_problema(String atematesis_problema) {
		this.atematesis_problema = atematesis_problema;
	}

	public String getAtematesis_justificacion() {
		return atematesis_justificacion;
	}

	public void setAtematesis_justificacion(String atematesis_justificacion) {
		this.atematesis_justificacion = atematesis_justificacion;
	}

	public Date getAtematesis_fecha() {
		return atematesis_fecha;
	}

	public void setAtematesis_fecha(Date atematesis_fecha) {
		this.atematesis_fecha = atematesis_fecha;
	}

	public String getAtematesis_comentario() {
		return atematesis_comentario;
	}

	public void setAtematesis_comentario(String atematesis_comentario) {
		this.atematesis_comentario = atematesis_comentario;
	}

	public int getGi_id() {
		return gi_id;
	}

	public void setGi_id(int gi_id) {
		this.gi_id = gi_id;
	}

	public Integer getId_curso() {
		return id_curso;
	}

	public void setId_curso(Integer id_curso) {
		this.id_curso = id_curso;
	}

	public int getEstado_id() {
		return estado_id;
	}

	public void setEstado_id(int estado_id) {
		this.estado_id = estado_id;
	}

	public Integer getRol_id() {
		return rol_id;
	}

	public void setRol_id(Integer rol_id) {
		this.rol_id = rol_id;
	}
	
	
	
}
