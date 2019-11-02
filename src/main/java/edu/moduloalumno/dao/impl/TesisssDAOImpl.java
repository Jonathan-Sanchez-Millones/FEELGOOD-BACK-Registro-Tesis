package edu.moduloalumno.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.moduloalumno.dao.ITesisssDAO;
import edu.moduloalumno.entity.Tesiss;
import edu.moduloalumno.entity.Tesisss;
import edu.moduloalumno.rowmapper.TesissRowMapper;
import edu.moduloalumno.rowmapper.TesisssRowMapper;

@Transactional
@Repository
public class TesisssDAOImpl implements ITesisssDAO{

	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	@Override
	public Tesisss getTesisss(int id_atematesis) {
		
		String sql = "select atematesis_titulo,atematesis_situacion,atematesis_problema,\r\n" + 
				"atematesis_justificacion,atematesis_fecha,atematesis_comentario,\r\n" + 
				"gi_id,id_curso,planestudios,id_docente,estado_id,rol_id from alumno_tematesis att JOIN alumno_tematesis_docente attd\r\n" + 
				"ON att.id_atematesis=attd.id_atematesis where att.id_atematesis=?";
        RowMapper<Tesisss> rowMapper = new TesisssRowMapper();
        Tesisss tesis = this.jdbcTemplate.queryForObject(sql, rowMapper, id_atematesis);
        return tesis;
}
}
