package com.integrador.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ALUMNO")
public class Alumno implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ALUMNO", unique = true, nullable = false)
	private int id;

	//@Column(name = "NOMBRE", unique = true, nullable = false, length = 30)
	@Column
	private String nombre;

	//@Column(name = "APELLIDO", unique = true, nullable = false, length = 30)
	@Column
	private String apellido;

	//@Column(name = "DNI", unique = true, nullable = false, length = 30)
	@Column
	private String dni;

	//@Column(name = "ANO", unique = true, nullable = false, length = 30)
	@Column
	private String ano;

	//@Column(name = "CURSO", unique = true, nullable = false, length = 30)
	@Column
	private String curso;
	
	
	public Alumno(){}

	public Alumno(String nombre, String apellido, String dni, String ano, String curso) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.ano = ano;
		this.curso = curso;
	}
	
	// GETTERS
	

	public int getId() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getDni() {
		return dni;
	}

	public String getAno() {
		return ano;
	}

	public String getCurso() {
		return curso;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}
