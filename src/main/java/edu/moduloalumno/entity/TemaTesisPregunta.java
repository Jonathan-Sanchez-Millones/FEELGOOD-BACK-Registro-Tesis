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
public class TemaTesisPregunta {
    private int id_pregunta; // llave primaria
    private int id_pclave; // llave foranea
    private int estado_id; // llave foranea
    private String pregunta_orden;
    private String pregunta_desc;
    private String pregunta_desc_min;

    public TemaTesisPregunta(int id_pregunta, int id_pclave, int estado_id, String pregunta_orden, String pregunta_desc, String pregunta_desc_min) {
        this.id_pregunta = id_pregunta;
        this.id_pclave = id_pclave;
        this.estado_id = estado_id;
        this.pregunta_orden = pregunta_orden;
        this.pregunta_desc = pregunta_desc;
        this.pregunta_desc_min = pregunta_desc_min;
    }

    public int getId_pregunta() {
        return id_pregunta;
    }

    public void setId_pregunta(int id_pregunta) {
        this.id_pregunta = id_pregunta;
    }

    public int getId_pclave() {
        return id_pclave;
    }

    public void setId_pclave(int id_pclave) {
        this.id_pclave = id_pclave;
    }

    public int getEstado_id() {
        return estado_id;
    }

    public void setEstado_id(int estado_id) {
        this.estado_id = estado_id;
    }

    public String getPregunta_orden() {
        return pregunta_orden;
    }

    public void setPregunta_orden(String pregunta_orden) {
        this.pregunta_orden = pregunta_orden;
    }

    public String getPregunta_desc() {
        return pregunta_desc;
    }

    public void setPregunta_desc(String pregunta_desc) {
        this.pregunta_desc = pregunta_desc;
    }

    public String getPregunta_desc_min() {
        return pregunta_desc_min;
    }

    public void setPregunta_desc_min(String pregunta_desc_min) {
        this.pregunta_desc_min = pregunta_desc_min;
    }
    
    
    
            
    
    
   
    
}
