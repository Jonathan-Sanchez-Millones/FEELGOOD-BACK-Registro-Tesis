/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moduloalumno.dao.impl;

import edu.moduloalumno.dao.IAlumnoTemaTesisDAO;
import edu.moduloalumno.entity.AlumnoTemaTesis;
import edu.moduloalumno.rowmapper.AlumnoTemaTesisRowMapper;
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
public class AlumnoTemaTesisDAOImpl implements IAlumnoTemaTesisDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<AlumnoTemaTesis> getAllAlumnoTemaTesis() {
        String sql = "SELECT id_atematesis, atematesis_titulo, atematesis_situacion, "
                + "atematesis_problema, atematesis_justificacion, atematesis_fecha, "
                + "atematesis_comentario, cod_alumno, id_programa, id_archivo, gi_id, "
                + "id_curso, planestudios FROM public.alumno_tematesis";
        RowMapper<AlumnoTemaTesis> rowMapper = new AlumnoTemaTesisRowMapper();
        return this.jdbcTemplate.query(sql, rowMapper);
    }

    @Override
    public AlumnoTemaTesis getAlumnoTemaTesisById(int id_atematesis) {
        String sql = "SELECT * FROM public.alumno_tematesis WHERE id_atematesis = ?";
        RowMapper<AlumnoTemaTesis> rowMapper = new AlumnoTemaTesisRowMapper();
        AlumnoTemaTesis alumnoTemaTesis = jdbcTemplate.queryForObject(sql, rowMapper, id_atematesis);
        return alumnoTemaTesis;
    }
    
    @Override
    public AlumnoTemaTesis getAlumnoTemaTesisByTitulo(String atematesis_titulo) {
        String sql = "SELECT * FROM public.alumno_tematesis WHERE atematesis_titulo = ?";
        RowMapper<AlumnoTemaTesis> rowMapper = new AlumnoTemaTesisRowMapper();
        AlumnoTemaTesis alumnoTemaTesis = jdbcTemplate.queryForObject(sql, rowMapper, atematesis_titulo);
        return alumnoTemaTesis;
    }

    @Override
    public AlumnoTemaTesis addAlumnoTemaTesis(AlumnoTemaTesis alumnoTemaTesis) {
        // Add alumnoTemaTesis
        String sql = "INSERT INTO public.alumno_tematesis (  atematesis_titulo, "
                + "atematesis_situacion, atematesis_problema, atematesis_justificacion, "
                + "atematesis_fecha, atematesis_comentario, cod_alumno, id_programa, id_archivo, "
                + "gi_id, id_curso, planestudios)  VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        jdbcTemplate.update(sql, alumnoTemaTesis.getAtematesis_titulo(),
                alumnoTemaTesis.getAtematesis_situacion(), alumnoTemaTesis.getAtematesis_problema(),
                alumnoTemaTesis.getAtematesis_justificacion(), alumnoTemaTesis.getAtematesis_fecha(),
                alumnoTemaTesis.getAtematesis_comentario(), alumnoTemaTesis.getCod_alumno(),
                alumnoTemaTesis.getId_programa(), alumnoTemaTesis.getId_archivo(),
                alumnoTemaTesis.getGi_id(), alumnoTemaTesis.getId_curso(), alumnoTemaTesis.getPlanestudios());
        
        sql = "SELECT * FROM public.alumno_tematesis WHERE atematesis_titulo =? and  "
                + "atematesis_situacion=? and atematesis_problema=? and atematesis_justificacion=? and "
                + "atematesis_fecha=? and atematesis_comentario=? and cod_alumno=? and id_programa=? and "
                + "id_archivo=? and gi_id=? and id_curso=? and planestudios=?";
        RowMapper<AlumnoTemaTesis> rowMapper = new BeanPropertyRowMapper<AlumnoTemaTesis>(
                AlumnoTemaTesis.class);
        AlumnoTemaTesis alumnoTemaTesisNew = jdbcTemplate.queryForObject(sql, rowMapper,
                alumnoTemaTesis.getAtematesis_titulo(),
                alumnoTemaTesis.getAtematesis_situacion(), alumnoTemaTesis.getAtematesis_problema(),
                alumnoTemaTesis.getAtematesis_justificacion(), alumnoTemaTesis.getAtematesis_fecha(),
                alumnoTemaTesis.getAtematesis_comentario(), alumnoTemaTesis.getCod_alumno(),
                alumnoTemaTesis.getId_programa(), alumnoTemaTesis.getId_archivo(),
                alumnoTemaTesis.getGi_id(), alumnoTemaTesis.getId_curso(), alumnoTemaTesis.getPlanestudios());

        System.out.println("alumnoTemaTesisNew" + alumnoTemaTesisNew);

        // get alumnoTemaTesis
         
        return alumnoTemaTesisNew;
    }

    @Override
    public void updateAlumnoTemaTesis(AlumnoTemaTesis alumnoTemaTesis) {
        String sql = "UPDATE public.alumno_tematesis SET  atematesis_titulo=?, atematesis_situacion=?, "
                + "atematesis_problema=?, atematesis_justificacion=?, atematesis_fecha=?, "
                + "atematesis_comentario=?, gi_id=?, "
                + "id_curso=?, planestudios=? WHERE id_atematesis=?";

        jdbcTemplate.update(sql, alumnoTemaTesis.getAtematesis_titulo(),
                alumnoTemaTesis.getAtematesis_situacion(), alumnoTemaTesis.getAtematesis_problema(),
                alumnoTemaTesis.getAtematesis_justificacion(), alumnoTemaTesis.getAtematesis_fecha(),
                alumnoTemaTesis.getAtematesis_comentario(),alumnoTemaTesis.getGi_id(), alumnoTemaTesis.getId_curso(),
                alumnoTemaTesis.getPlanestudios(),alumnoTemaTesis.getId_atematesis());

    }

    @Override
    public void deleteAlumnoTemaTesis(int id_atematesis) {
        String sql = "DELETE FROM public.alumno_tematesis WHERE id_atematesis=?";
        jdbcTemplate.update(sql, id_atematesis);
    }

}
