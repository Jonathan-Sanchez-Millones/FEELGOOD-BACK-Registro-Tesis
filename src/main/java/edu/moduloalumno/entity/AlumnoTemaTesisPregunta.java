/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moduloalumno.entity;

import java.io.Serializable;

/**
 *
 * @author Diego Lopez
 */
public class AlumnoTemaTesisPregunta implements Serializable {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id_atematesis; // llave foranea
    private int id_pregunta; // llave foranea
    private String rpta;
    private String rpta_detallada;

    public AlumnoTemaTesisPregunta() {
    }
  
    public AlumnoTemaTesisPregunta(int id_atematesis, int id_pregunta, String rpta, String rpta_detallada) {
        this.id_atematesis = id_atematesis;
        this.id_pregunta = id_pregunta;
        this.rpta = rpta;
        this.rpta_detallada = rpta_detallada;
    }

    public int getId_atematesis() {
        return id_atematesis;
    }

    public void setId_atematesis(int id_atematesis) {
        this.id_atematesis = id_atematesis;
    }

    public int getId_pregunta() {
        return id_pregunta;
    }

    public void setId_pregunta(int id_pregunta) {
        this.id_pregunta = id_pregunta;
    }

    public String getRpta() {
        return rpta;
    }

    public void setRpta(String rpta) {
        this.rpta = rpta;
    }

    public String getRpta_detallada() {
        return rpta_detallada;
    }

    public void setRpta_detallada(String rpta_detallada) {
        this.rpta_detallada = rpta_detallada;
    }
    
    
    
}
