/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moduloalumno.rowmapper;

import edu.moduloalumno.entity.ArchivoTesis;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Diego Lopez
 */
public class ArchivoTesisRowMapper implements RowMapper<ArchivoTesis> {

    @Override
    public ArchivoTesis mapRow(ResultSet row, int rowNum) throws SQLException {
        ArchivoTesis archivoTesis = new ArchivoTesis();

        archivoTesis.setId_archivo(row.getInt("id_archivo"));
        archivoTesis.setArchivo_desc(row.getString("archivo_desc"));
        archivoTesis.setArchivo_extension(row.getString("archivo_extension"));
        return archivoTesis;
    }

}
