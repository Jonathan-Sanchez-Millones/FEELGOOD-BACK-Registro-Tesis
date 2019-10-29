/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moduloalumno.service;

import edu.moduloalumno.entity.ArchivoTesis;
import java.util.List;

/**
 *
 * @author Diego Lopez
 */
public interface IArchivoTesisService {

    List<ArchivoTesis> getAllArchivoTesis();

    ArchivoTesis getArchivoTesisById(int id_archivo);

    ArchivoTesis addArchivoTesis(ArchivoTesis archivoTesis);

    void updateArchivoTesis(ArchivoTesis archivoTesis);

    void deleteArchivoTesis(int id_archivo);
}
