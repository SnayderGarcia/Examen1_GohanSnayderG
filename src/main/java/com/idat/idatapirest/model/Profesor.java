package com.idat.idatapirest.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;


@Table(name="Profesor")
@Entity
public class Profesor implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5944394350405839536L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProfesor;
	
	private String profesor;
	

	
	@ManyToMany(mappedBy  = "Curso", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Curso> curso = new ArrayList<>();



	public Integer getIdProfesor() {
		return idProfesor;
	}



	public void setIdProfesor(Integer idProfesor) {
		this.idProfesor = idProfesor;
	}



	public String getProfesor() {
		return profesor;
	}



	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}



	public List<Curso> getCurso() {
		return curso;
	}



	public void setCurso(List<Curso> curso) {
		this.curso = curso;
	}
	
	
	
}
