package com.integrador.dao;

import com.integrador.model.Alumno;
import java.util.List;

public interface AlumnoDAO {

	void save(Alumno alumno);
	void update(Alumno alumno);
	void delete(Alumno alumno);
	Alumno findAlumnoById(int id);
	List<Alumno> listAll();

}
