package edu.moduloalumno.entity;
import java.util.Date;
public class Tesiss {

	private int id_atematesis;
	private String titulo;
	private String situacion;
	private String problema;
	private String justificacion;
	private Date fecha;
	private String comentario;
	private String codigo;
	private String alumno;
	private String programa;
	private String grupo_investigacion;
	private String curso;
	private Integer plan_estudios;
	private String docente;
	private String estado;
	private String rol;
	
	public Tesiss() {}
	
	public Tesiss(int id_atematesis, String titulo, String situacion, String problema, String justificacion, Date fecha,
			String comentario, String codigo, String alumno, String programa, String grupo_investigacion, String curso,
			Integer plan_estudios, String docente, String estado, String rol) {
		super();
		this.id_atematesis = id_atematesis;
		this.titulo = titulo;
		this.situacion = situacion;
		this.problema = problema;
		this.justificacion = justificacion;
		this.fecha = fecha;
		this.comentario = comentario;
		this.codigo = codigo;
		this.alumno = alumno;
		this.programa = programa;
		this.grupo_investigacion = grupo_investigacion;
		this.curso = curso;
		this.plan_estudios = plan_estudios;
		this.docente = docente;
		this.estado = estado;
		this.rol = rol;
	}

	public int getId_atematesis() {
		return id_atematesis;
	}

	public void setId_atematesis(int id_atematesis) {
		this.id_atematesis = id_atematesis;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSituacion() {
		return situacion;
	}

	public void setSituacion(String situacion) {
		this.situacion = situacion;
	}

	public String getProblema() {
		return problema;
	}

	public void setProblema(String problema) {
		this.problema = problema;
	}

	public String getJustificacion() {
		return justificacion;
	}

	public void setJustificacion(String justificacion) {
		this.justificacion = justificacion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getAlumno() {
		return alumno;
	}

	public void setAlumno(String alumno) {
		this.alumno = alumno;
	}

	public String getPrograma() {
		return programa;
	}

	public void setPrograma(String programa) {
		this.programa = programa;
	}

	public String getGrupo_investigacion() {
		return grupo_investigacion;
	}

	public void setGrupo_investigacion(String grupo_investigacion) {
		this.grupo_investigacion = grupo_investigacion;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Integer getPlan_estudios() {
		return plan_estudios;
	}

	public void setPlan_estudios(Integer plan_estudios) {
		this.plan_estudios = plan_estudios;
	}

	public String getDocente() {
		return docente;
	}

	public void setDocente(String docente) {
		this.docente = docente;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}
	
	
	
	
	
}
