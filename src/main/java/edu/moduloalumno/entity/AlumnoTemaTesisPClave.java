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
public class AlumnoTemaTesisPClave {
    private int id_atematesis;
    private int id_pclave;

    public AlumnoTemaTesisPClave(int id_atematesis, int id_pclave) {
        this.id_atematesis = id_atematesis;
        this.id_pclave = id_pclave;
    }

    public int getId_atematesis() {
        return id_atematesis;
    }

    public void setId_atematesis(int id_atematesis) {
        this.id_atematesis = id_atematesis;
    }

    public int getId_pclave() {
        return id_pclave;
    }

    public void setId_pclave(int id_pclave) {
        this.id_pclave = id_pclave;
    }
    
    
}
