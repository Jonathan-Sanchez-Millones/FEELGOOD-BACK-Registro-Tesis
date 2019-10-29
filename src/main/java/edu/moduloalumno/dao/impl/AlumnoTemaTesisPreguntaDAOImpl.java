/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moduloalumno.dao.impl;

import edu.moduloalumno.dao.IAlumnoTemaTesisPreguntaDAO;
import edu.moduloalumno.entity.AlumnoTemaTesisPregunta;
import edu.moduloalumno.rowmapper.AlumnoTemaTesisPreguntaRowMapper;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Yveth Calixto
 */
@Transactional
@Repository
public class AlumnoTemaTesisPreguntaDAOImpl implements IAlumnoTemaTesisPreguntaDAO{
	@Autowired
    private JdbcTemplate jdbcTemplate;
    
    @Override
    public List<AlumnoTemaTesisPregunta> getAllAlumnoTemaTesisPregunta() {
           String sql = "SELECT id_atematesis,id_pregunta, rpta, rpta_detallada FROM alumno_tematesis_pregunta";
		
	   RowMapper<AlumnoTemaTesisPregunta> rowMapper = new AlumnoTemaTesisPreguntaRowMapper();
	   return this.jdbcTemplate.query(sql, rowMapper);
    }

    @Override
    public AlumnoTemaTesisPregunta getAlumnoTemaTesisPreguntaById(int idATemaTesis) {
           String sql = "SELECT * FROM alumno_tematesis_pregunta WHERE  id_atematesis=?";
           RowMapper<AlumnoTemaTesisPregunta> rowMapper = new AlumnoTemaTesisPreguntaRowMapper();
           AlumnoTemaTesisPregunta alumnoTemaTesisPregunta = jdbcTemplate.queryForObject(sql, rowMapper,idATemaTesis);
           return alumnoTemaTesisPregunta;
    }

    @Override
    public AlumnoTemaTesisPregunta addAlumnoTemaTesisPregunta(AlumnoTemaTesisPregunta alumnoTemaTesisPregunta) {
           // Add alumnoAlumnoPrograma
		String sql = "INSERT INTO alumno_tematesis_pregunta (id_atematesis,id_pregunta, rpta, rpta_detallada) values (?, ?, ?, ?)";
		jdbcTemplate.update(sql, alumnoTemaTesisPregunta.getId_atematesis(), alumnoTemaTesisPregunta.getId_pregunta(),
				alumnoTemaTesisPregunta.getRpta(), alumnoTemaTesisPregunta.getRpta_detallada());

		sql = "SELECT * FROM alumno_tematesis_pregunta WHERE id_atematesis = ? and id_pregunta = ? and rpta = ? and rpta_detallada=?";
		RowMapper<AlumnoTemaTesisPregunta> rowMapper = new BeanPropertyRowMapper<AlumnoTemaTesisPregunta>(
				AlumnoTemaTesisPregunta.class);
		AlumnoTemaTesisPregunta alumnoTemaTesisPreguntaNew = jdbcTemplate.queryForObject(sql, rowMapper,
				alumnoTemaTesisPregunta.getId_atematesis(), alumnoTemaTesisPregunta.getId_pregunta(),
				alumnoTemaTesisPregunta.getRpta(), alumnoTemaTesisPregunta.getRpta_detallada());
		
		System.out.println("alumnoTemaTesisPreguntaNew" + alumnoTemaTesisPreguntaNew);

		// get alumnoAlumnoPrograma
		return alumnoTemaTesisPreguntaNew;
    }

    @Override
    public void updateAlumnoTemaTesisPregunta(AlumnoTemaTesisPregunta alumnoTemaTesisPregunta) {
                String sql = "UPDATE alumno_tematesis_pregunta SET id_pregunta = ? , rpta = ? , rpta_detallada=? WHERE id_atematesis = ?";
		jdbcTemplate.update(sql, alumnoTemaTesisPregunta.getId_pregunta(), alumnoTemaTesisPregunta.getRpta(), 
                                         alumnoTemaTesisPregunta.getRpta_detallada(), alumnoTemaTesisPregunta.getId_atematesis());
    }

    @Override
    public void deleteAlumnoTemaTesisPregunta(int idATemaTesis) {
        String sql = "DELETE FROM alumno_tematesis_pregunta WHERE id_atematesis = ?";
		jdbcTemplate.update(sql, idATemaTesis);
    }
    
}
