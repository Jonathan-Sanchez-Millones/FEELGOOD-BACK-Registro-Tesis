/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moduloalumno.service.impl;

import edu.moduloalumno.dao.IArchivoTesisDAO;
import edu.moduloalumno.entity.ArchivoTesis;
import edu.moduloalumno.service.IArchivoTesisService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Diego Lopez
 */
@Service
public class ArchivoTesisServiceImpl implements IArchivoTesisService {

    @Autowired
    private IArchivoTesisDAO archivoTesisDAO;

    @Override
    public List<ArchivoTesis> getAllArchivoTesis() {
        return archivoTesisDAO.getAllArchivoTesis();
    }

    @Override
    public ArchivoTesis getArchivoTesisById(int id_archivo) {
        ArchivoTesis obj = archivoTesisDAO.getArchivoTesisById(id_archivo);
        return obj;
    }

    @Override
    public ArchivoTesis addArchivoTesis(ArchivoTesis archivoTesis) {
        return archivoTesisDAO.addArchivoTesis(archivoTesis);
    }

    @Override
    public void updateArchivoTesis(ArchivoTesis archivoTesis) {
        archivoTesisDAO.updateArchivoTesis(archivoTesis);
    }

    @Override
    public void deleteArchivoTesis(int id_archivo) {
        archivoTesisDAO.deleteArchivoTesis(id_archivo);
    }

}
