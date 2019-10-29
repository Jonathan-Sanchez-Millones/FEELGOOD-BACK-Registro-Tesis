package edu.moduloalumno.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.moduloalumno.dao.IEstadoDAO;
import edu.moduloalumno.entity.Alumno;
import edu.moduloalumno.entity.Estado;
import edu.moduloalumno.rowmapper.AlumnoRowMapper;
import edu.moduloalumno.rowmapper.EstadoRowMapper;

@Transactional
@Repository
public class EstadoDAOImpl implements IEstadoDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Estado> getAllEstados() {
		
		String sql = "SELECT estado_id, estado_descripcion , estado_abrev  FROM estado";
		
		RowMapper<Estado> rowMapper = new EstadoRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper);
	}

}
