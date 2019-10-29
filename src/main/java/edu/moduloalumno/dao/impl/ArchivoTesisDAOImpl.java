/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moduloalumno.dao.impl;

import edu.moduloalumno.dao.IArchivoTesisDAO;
import edu.moduloalumno.entity.ArchivoTesis;
import edu.moduloalumno.rowmapper.ArchivoTesisRowMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Diego Lopez
 */
@Transactional
@Repository
public class ArchivoTesisDAOImpl implements IArchivoTesisDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<ArchivoTesis> getAllArchivoTesis() {
        String sql = "SELECT id_archivo, archivo_desc, archivo_extension FROM public.archivo_tesis";

        RowMapper<ArchivoTesis> rowMapper = new ArchivoTesisRowMapper();
        return this.jdbcTemplate.query(sql, rowMapper);
    }

    @Override
    public ArchivoTesis getArchivoTesisById(int id_archivo) {
        String sql = "SELECT * FROM public.archivo_tesis WHERE id_archivo = ?";
        RowMapper<ArchivoTesis> rowMapper = new ArchivoTesisRowMapper();
        ArchivoTesis archivoTesis = jdbcTemplate.queryForObject(sql, rowMapper, id_archivo);
        return archivoTesis;
    }

    @Override
    public ArchivoTesis addArchivoTesis(ArchivoTesis archivoTesis) {
        // Add alumnoAlumnoPrograma
        String sql = "INSERT INTO public.archivo_tesis (id_archivo, archivo_desc, archivo_extension)VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, archivoTesis.getId_archivo(), archivoTesis.getArchivo_desc(),
                archivoTesis.getArchivo_extension());

        sql = "SELECT * FROM public.archivo_tesis WHERE id_archivo = ? and archivo_desc = ? and archivo_extension = ?";
        RowMapper<ArchivoTesis> rowMapper = new BeanPropertyRowMapper<ArchivoTesis>(ArchivoTesis.class);
        ArchivoTesis archivoTesisNew = jdbcTemplate.queryForObject(sql, rowMapper,
                archivoTesis.getId_archivo(), archivoTesis.getArchivo_desc(),
                archivoTesis.getArchivo_extension());

        System.out.println("archivoTesisNew" + archivoTesisNew);

        // get archivoTesisNew
        return archivoTesisNew;

    }

    @Override
    public void updateArchivoTesis(ArchivoTesis archivoTesis) {
        String sql = "UPDATE public.archivo_tesis SET archivo_desc = ?, archivo_extension = ? WHERE id_archivo = ?";
        jdbcTemplate.update(sql, archivoTesis.getArchivo_desc(), archivoTesis.getArchivo_extension(),
                archivoTesis.getId_archivo());
    }

    @Override
    public void deleteArchivoTesis(int id_archivo) {
        String sql = "DELETE FROM public.archivo_tesis WHERE id_archivo = ? ";
        jdbcTemplate.update(sql, id_archivo);
    }

}
