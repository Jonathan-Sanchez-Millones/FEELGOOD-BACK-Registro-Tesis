package edu.moduloalumno.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.moduloalumno.dao.IDocenteDAO;
import edu.moduloalumno.entity.Alumno;
import edu.moduloalumno.entity.Docente;
import edu.moduloalumno.rowmapper.AlumnoRowMapper;
import edu.moduloalumno.rowmapper.DocenteRowMapper;

@Transactional
@Repository
public class DocenteDAOImpl implements IDocenteDAO{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public Docente getIdDocenteByNombre(String nombres,String apellPat,String apellMat) {
		String sql = "SELECT id_docente FROM docente WHERE nombres = ? and apell_pat = ? and apell_mat = ?";
		RowMapper<Docente> rowMapper = new BeanPropertyRowMapper<Docente>(Docente.class);
		Docente docente = jdbcTemplate.queryForObject(sql, rowMapper, nombres,apellPat,apellMat);
		return docente;
	}
	@Override
	public 	List<Docente> getAllDocentes(){
		
		String sql = "SELECT id_docente, nombres , apell_pat, apell_mat  FROM docente";
		
		RowMapper<Docente> rowMapper = new DocenteRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper);
	}


}
