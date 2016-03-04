package com.integrador.bo;

import com.integrador.model.Alumno;

public interface AlumnoBO {
	
	void save(Alumno alumno);
	void update(Alumno alumno);
	void delete(Alumno alumno);
	Alumno findAlumnoById(int id);
	
}
