package com.integrador.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;

import com.integrador.dao.AlumnoDAOImpl;
import com.integrador.model.Alumno;

@Service
public class AlumnoBOImpl implements AlumnoBO {


	@Autowired
	private AlumnoDAOImpl alumnoDao;
	
	public void setAlumnoDao(AlumnoDAOImpl alumnoDao) {
		this.alumnoDao = alumnoDao;
	}
	
	@Override
	public void save(Alumno alumno) {
		alumnoDao.save(alumno);
	}

	@Override
	public void update(Alumno alumno) {
		alumnoDao.update(alumno);
	}

	@Override
	public void delete(Alumno alumno) {
		alumnoDao.delete(alumno);
	}

	public Alumno findAlumnoById(int id) {
		return alumnoDao.findAlumnoById(id);
	}
	
	public List<Alumno> listAll(){
		return alumnoDao.listAll();
	}

	

}
