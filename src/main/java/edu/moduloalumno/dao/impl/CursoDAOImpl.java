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
	public List<Curso> getAllCursos(String cod_alumno) {
		String sql = "select id_curso, nom_curso, ap.id_programa, numciclo, numcreditaje ,\r\n" + 
				"tipocurso , planestudios from alumno_programa ap join Curso cu ON\r\n" + 
				"ap.id_programa=cu.id_programa where cod_alumno= ? and cu.id_clase_curso=2 ";
		
		RowMapper<Curso> rowMapper = new CursoRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper,cod_alumno);
	}
}
