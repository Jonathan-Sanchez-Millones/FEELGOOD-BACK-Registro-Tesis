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
public class Rol {
    private int rol;
    private String rol_desc;
    private String rol_desc_min;
    private String rol_desc_ini;

    public Rol() {

    }
    
    public Rol(int rol, String rol_desc, String rol_desc_min, String rol_desc_ini) {
        this.rol = rol;
        this.rol_desc = rol_desc;
        this.rol_desc_min = rol_desc_min;
        this.rol_desc_ini = rol_desc_ini;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public String getRol_desc() {
        return rol_desc;
    }

    public void setRol_desc(String rol_desc) {
        this.rol_desc = rol_desc;
    }

    public String getRol_desc_min() {
        return rol_desc_min;
    }

    public void setRol_desc_min(String rol_desc_min) {
        this.rol_desc_min = rol_desc_min;
    }

    public String getRol_desc_ini() {
        return rol_desc_ini;
    }

    public void setRol_desc_ini(String rol_desc_ini) {
        this.rol_desc_ini = rol_desc_ini;
    }
    
    
    
}
