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
public class TemaTesisPClave {
    private int id_pclave;
    private String pclave_desc;

    public TemaTesisPClave(int id_pclave, String pclave_desc) {
        this.id_pclave = id_pclave;
        this.pclave_desc = pclave_desc;
    }

    public int getId_pclave() {
        return id_pclave;
    }

    public void setId_pclave(int id_pclave) {
        this.id_pclave = id_pclave;
    }

    public String getPclave_desc() {
        return pclave_desc;
    }

    public void setPclave_desc(String pclave_desc) {
        this.pclave_desc = pclave_desc;
    }
    
    
}
