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
public class GrupoInvestigacion {
    
    private int gi_id;
    private String gi_nombre;
    private String gi_siglas;

    public GrupoInvestigacion() {
    	
    }
    
    public GrupoInvestigacion(int id_gi, String gi_desc, String gi_siglas) {
        this.gi_id = id_gi;
        this.gi_nombre = gi_desc;
        this.gi_siglas = gi_siglas;
    }

    public int getId_gi() {
        return gi_id;
    }

    public void setId_gi(int id_gi) {
        this.gi_id = id_gi;
    }

    public String getGi_desc() {
        return gi_nombre;
    }

    public void setGi_desc(String gi_desc) {
        this.gi_nombre = gi_desc;
    }

    public String getGi_siglas() {
        return gi_siglas;
    }

    public void setGi_siglas(String gi_siglas) {
        this.gi_siglas = gi_siglas;
    }
    
    
    
}
