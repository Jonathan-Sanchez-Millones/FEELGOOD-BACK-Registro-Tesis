/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moduloalumno.entity;

/**
 *
 * @author Diego Lopez
 */
public class AlumnoTemaTesisDocente {
    
    private int id_docente; // llave foranea
    private int id_atematesis; // llave foranea
    private int estado_id; // llave foranea
    private int rol_id; // llave foranea

    public AlumnoTemaTesisDocente() {
    }

    public AlumnoTemaTesisDocente(int id_docente, int id_atematesis, int estado_id, int rol_id) {
        this.id_docente = id_docente;
        this.id_atematesis = id_atematesis;
        this.estado_id = estado_id;
        this.rol_id = rol_id;
    }

    public int getId_docente() {
        return id_docente;
    }

    public void setId_docente(int id_docente) {
        this.id_docente = id_docente;
    }

    public int getId_atematesis() {
        return id_atematesis;
    }

    public void setId_atematesis(int id_atematesis) {
        this.id_atematesis = id_atematesis;
    }

    public int getEstado_id() {
        return estado_id;
    }

    public void setEstado_id(int estado_id) {
        this.estado_id = estado_id;
    }

    public int getRol_id() {
        return rol_id;
    }

    public void setRol_id(int rol_id) {
        this.rol_id = rol_id;
    }
    
    
    
    
}
