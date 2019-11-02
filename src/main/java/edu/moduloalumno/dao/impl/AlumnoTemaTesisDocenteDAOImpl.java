/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moduloalumno.dao.impl;
import edu.moduloalumno.dao.IAlumnoTemaTesisDocenteDAO;
import edu.moduloalumno.entity.AlumnoTemaTesisDocente;
import edu.moduloalumno.rowmapper.AlumnoTemaTesisDocenteRowMapper;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Yveth Calixto
 */
@Transactional
@Repository
public class AlumnoTemaTesisDocenteDAOImpl implements IAlumnoTemaTesisDocenteDAO {
    
    @Autowired
	private JdbcTemplate jdbcTemplate;

    @Override
    public List<AlumnoTemaTesisDocente> getAllAlumnoTemaTesisDocente() {
            String sql = "SELECT id_docente, id_atematesis, estado_id, rol_id FROM alumno_tematesis_docente";
		
		RowMapper<AlumnoTemaTesisDocente> rowMapper = new AlumnoTemaTesisDocenteRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper);
    }

    @Override
    public AlumnoTemaTesisDocente getAlumnoTemaTesisDocenteById(int idDoc, int idATemaTesis) {
        String sql = "SELECT * FROM alumno_tematesis_docente WHERE id_docente= ? and id_atematesis=?";
        RowMapper<AlumnoTemaTesisDocente> rowMapper = new AlumnoTemaTesisDocenteRowMapper();
        AlumnoTemaTesisDocente alumnoTemaTesisDocente = jdbcTemplate.queryForObject(sql, rowMapper, idDoc, idATemaTesis);
        return alumnoTemaTesisDocente;
    }

    @Override
    public AlumnoTemaTesisDocente addAlumnoTemaTesisDocente(AlumnoTemaTesisDocente alumnoTemaTesisDocente) {
           // Add alumnoAlumnoPrograma
    	System.out.println("MIRA:"+alumnoTemaTesisDocente.getId_docente()+","+alumnoTemaTesisDocente.getId_atematesis()+","+
           alumnoTemaTesisDocente.getEstado_id()+","+alumnoTemaTesisDocente.getRol_id());
		String sql = "INSERT INTO public.alumno_tematesis_docente (id_docente, id_atematesis, estado_id, rol_id) values (?, ?, ?, ?)";
		jdbcTemplate.update(sql, alumnoTemaTesisDocente.getId_docente(), alumnoTemaTesisDocente.getId_atematesis(),
				alumnoTemaTesisDocente.getEstado_id(), alumnoTemaTesisDocente.getRol_id());

		/*sql = "SELECT * FROM alumno_tematesis_docente WHERE id_docente=? and id_atematesis=? and estado_id=? and rol_id=?";
		RowMapper<AlumnoTemaTesisDocente> rowMapper = new BeanPropertyRowMapper<AlumnoTemaTesisDocente>(
				AlumnoTemaTesisDocente.class);
		AlumnoTemaTesisDocente alumnoTemaTesisDocenteNew = jdbcTemplate.queryForObject(sql, rowMapper,
				 alumnoTemaTesisDocente.getId_docente(), alumnoTemaTesisDocente.getId_atematesis(),
				alumnoTemaTesisDocente.getEstado_id(), alumnoTemaTesisDocente.getRol_id());
		
		System.out.println("alumnoTemaTesisDocenteNew" + alumnoTemaTesisDocenteNew);

		// get alumnoAlumnoPrograma*/
		return alumnoTemaTesisDocente;
    }

    @Override
    public AlumnoTemaTesisDocente updateAlumnoTemaTesisDocente(AlumnoTemaTesisDocente alumnoTemaTesisDocente) {
                String sql = "UPDATE alumno_tematesis_docente SET id_docente= ? , estado_id=?, rol_id=? WHERE id_atematesis=?";
		jdbcTemplate.update(sql,alumnoTemaTesisDocente.getId_docente(),alumnoTemaTesisDocente.getEstado_id(), alumnoTemaTesisDocente.getRol_id(),
                            alumnoTemaTesisDocente.getId_atematesis());
		
		return alumnoTemaTesisDocente;
    }

    @Override
    public void deleteAlumnoTemaTesisDocente(int idDoc, int idATemaTesis) {
                String sql = "DELETE FROM alumno_tematesis_docente WHERE id_docente= ? and id_atematesis=?";
		jdbcTemplate.update(sql, idDoc,idATemaTesis);
    }
    
    @Override
    public void deleteAlumnoTemaTesisDocente(int id_atematesis) {
                String sql = "DELETE FROM alumno_tematesis_docente WHERE id_atematesis=?";
		jdbcTemplate.update(sql,id_atematesis);
    }
    
}
