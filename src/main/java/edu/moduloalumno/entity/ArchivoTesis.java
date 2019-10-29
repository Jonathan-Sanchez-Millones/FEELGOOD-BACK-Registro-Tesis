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
public class ArchivoTesis {
    private int id_archivo;
    private String archivo_desc;
    private String archivo_extension;

    public ArchivoTesis() {
    }

    public ArchivoTesis(int id_archivo, String archivo_desc, String archivo_extension) {
        this.id_archivo = id_archivo;
        this.archivo_desc = archivo_desc;
        this.archivo_extension = archivo_extension;
    }

    public int getId_archivo() {
        return id_archivo;
    }

    public void setId_archivo(int id_archivo) {
        this.id_archivo = id_archivo;
    }

    public String getArchivo_desc() {
        return archivo_desc;
    }

    public void setArchivo_desc(String archivo_desc) {
        this.archivo_desc = archivo_desc;
    }

    public String getArchivo_extension() {
        return archivo_extension;
    }

    public void setArchivo_extension(String archivo_extension) {
        this.archivo_extension = archivo_extension;
    }
       
}
