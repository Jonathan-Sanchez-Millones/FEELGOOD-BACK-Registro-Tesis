package edu.moduloalumno.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.moduloalumno.dao.ICursoDAO;
import edu.moduloalumno.entity.Curso;
import edu.moduloalumno.rowmapper.CursoRowMapper;

@Transactional
@Repository
public class CursoDAOImpl implements ICursoDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Curso> getAllCursos() {
		String sql = "SELECT id_curso, nom_curso, id_programa, numciclo, numcreditaje , tipocurso , planestudios  FROM curso";
		
		RowMapper<Curso> rowMapper = new CursoRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper);
	}
}
