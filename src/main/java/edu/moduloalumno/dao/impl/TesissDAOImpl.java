package edu.moduloalumno.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.moduloalumno.dao.ITesissDAO;
import edu.moduloalumno.entity.AlumnoTemaTesis;
import edu.moduloalumno.entity.Tesiss;
import edu.moduloalumno.rowmapper.AlumnoTemaTesisRowMapper;
import edu.moduloalumno.rowmapper.TesissRowMapper;

@Transactional
@Repository
public class TesissDAOImpl implements ITesissDAO{

	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Tesiss> getAllTesiss(String codigo) {
		
		String sql = "select att.id_atematesis,atematesis_titulo as titulo,atematesis_situacion as situacion,atematesis_problema \r\n" + 
				"as problema,atematesis_justificacion as justificacion,atematesis_fecha as fecha,atematesis_comentario as comentario\r\n" + 
				",ap.cod_alumno as codigo,ap.nom_alumno||' '||ap.ape_paterno||' '||ap.ape_materno as alumno,pr.nom_programa as programa\r\n" + 
				",gi.gi_nombre as grupo_investigacion,cu.nom_curso as curso,att.planestudios plan_estudios\r\n" + 
				",d.nombres||' '||d.apell_pat||' '||d.apell_mat as docente,e.estado_descripcion as estado\r\n" + 
				",r.rol_desc as rol from alumno_tematesis att JOIN alumno_programa ap ON att.cod_alumno=ap.cod_alumno\r\n" + 
				"JOIN programa pr ON att.id_programa=pr.id_programa JOIN grupo_investigacion\r\n" + 
				"gi ON att.gi_id=gi.gi_id JOIN curso cu ON att.id_curso=cu.id_curso JOIN \r\n" + 
				"alumno_tematesis_docente attd ON att.id_atematesis=attd.id_atematesis JOIN\r\n" + 
				"docente d ON attd.id_docente=d.id_docente JOIN estado e ON attd.estado_id=e.estado_id\r\n" + 
				"JOIN rol r ON attd.rol_id=r.rol_id where ap.cod_alumno = ?";
        RowMapper<Tesiss> rowMapper = new TesissRowMapper();
        List<Tesiss> lista_tesis = this.jdbcTemplate.query(sql, rowMapper, codigo);
        return lista_tesis;
	}

}
