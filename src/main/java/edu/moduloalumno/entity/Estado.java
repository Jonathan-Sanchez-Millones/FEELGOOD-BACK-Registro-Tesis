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
public class Estado {
    private int estado_id;
    private String estado_descripcion;
    private String estado_abrev;

    public Estado() {
    	
    }
    public Estado(int estado_id, String estado_descripcion, String estado_abrev) {
        this.estado_id = estado_id;
        this.estado_descripcion = estado_descripcion;
        this.estado_abrev = estado_abrev;
    }

    public int getEstado_id() {
        return estado_id;
    }

    public void setEstado_id(int estado_id) {
        this.estado_id = estado_id;
    }

    public String getEstado_descripcion() {
        return estado_descripcion;
    }

    public void setEstado_descripcion(String estado_descripcion) {
        this.estado_descripcion = estado_descripcion;
    }

    public String getEstado_abrev() {
        return estado_abrev;
    }

    public void setEstado_abrev(String estado_abrev) {
        this.estado_abrev = estado_abrev;
    }
    
    
    
    
}
