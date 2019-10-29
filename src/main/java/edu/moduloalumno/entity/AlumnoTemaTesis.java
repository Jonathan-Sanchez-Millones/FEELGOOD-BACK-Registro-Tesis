/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moduloalumno.entity;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Diego Lopez
 */
public class AlumnoTemaTesis {
    
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int id_atematesis;
    private String atematesis_titulo;
    private String atematesis_situacion;
    private String atematesis_problema;
    private String atematesis_justificacion;
    private Date atematesis_fecha;
    private String atematesis_comentario;
    private String cod_alumno; // foraneo de aca para abajo
    private int id_programa; // foraneo de aca para abajo
    private int id_archivo; // foraneo de aca para abajo
    private int gi_id; // foraneo de aca para abajo
    private int id_curso; // foraneo de aca para abajo
    private int planestudios; // foraneo de aca para abajo

    public AlumnoTemaTesis(int id_atematesis, String atematesis_titulo, String atematesis_situacion, String atematesis_problema, String atematesis_justificacion, Date atematesis_fecha, String atematesis_comentario, String cod_alumno, int id_programa, int id_archivo, int gi_id, int id_curso, int planestudios) {
        this.id_atematesis = id_atematesis;
        this.atematesis_titulo = atematesis_titulo;
        this.atematesis_situacion = atematesis_situacion;
        this.atematesis_problema = atematesis_problema;
        this.atematesis_justificacion = atematesis_justificacion;
        this.atematesis_fecha = atematesis_fecha;
        this.atematesis_comentario = atematesis_comentario;
        this.cod_alumno = cod_alumno;
        this.id_programa = id_programa;
        this.id_archivo = id_archivo;
        this.gi_id = gi_id;
        this.id_curso = id_curso;
        this.planestudios = planestudios;
    }

    public AlumnoTemaTesis() {
    }

    public int getId_atematesis() {
        return id_atematesis;
    }

    public void setId_atematesis(int id_atematesis) {
        this.id_atematesis = id_atematesis;
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

    public String getCod_alumno() {
        return cod_alumno;
    }

    public void setCod_alumno(String cod_alumno) {
        this.cod_alumno = cod_alumno;
    }

    public int getId_programa() {
        return id_programa;
    }

    public void setId_programa(int id_programa) {
        this.id_programa = id_programa;
    }

    public int getId_archivo() {
        return id_archivo;
    }

    public void setId_archivo(int id_archivo) {
        this.id_archivo = id_archivo;
    }

    public int getGi_id() {
        return gi_id;
    }

    public void setGi_id(int gi_id) {
        this.gi_id = gi_id;
    }

    public int getId_curso() {
        return id_curso;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    public int getPlanestudios() {
        return planestudios;
    }

    public void setPlanestudios(int planestudios) {
        this.planestudios = planestudios;
    }



    
    
    
    
}
