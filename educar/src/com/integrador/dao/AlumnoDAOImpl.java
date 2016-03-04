package com.integrador.dao;


import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import com.integrador.model.Alumno;

@Repository
public class AlumnoDAOImpl extends HibernateDaoSupport implements AlumnoDAO {

	@Autowired
    public void anyMethodName(SessionFactory sessionFactory)
    {
        setSessionFactory(sessionFactory);
    }
	@Override
	public void save(Alumno alumno) {
		getHibernateTemplate().save(alumno);
		
	}

	@Override
	public void update(Alumno alumno) {
		getHibernateTemplate().update(alumno);
		
	}

	@Override
	public void delete(Alumno alumno) {
		getHibernateTemplate().delete(alumno);
		
	}

	@Override
	public Alumno findAlumnoById(int id) {
		/*getHibernateTemplate().load(Alumno.class, id);
		return (Alumno) getHibernateTemplate().find(
                "Select * from ALUMNO where id_alumno=?",id);*/
		Alumno alu = getHibernateTemplate().load(Alumno.class, id);
		return alu;
	}
	@Override
	public List<Alumno> listAll() {
		
		return getHibernateTemplate().loadAll(Alumno.class);
	}

}
