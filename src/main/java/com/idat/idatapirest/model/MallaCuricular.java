package com.idat.idatapirest.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Table(name="MallaCuricular")
@Entity
public class MallaCuricular implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 574114274899454520L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idMalla;
	private String año;
	
	@OneToOne
	@JoinColumn(name="idUniver", nullable = false, unique = true,
	foreignKey = @ForeignKey(foreignKeyDefinition ="foreign key(idUniver) references Universidad(idUniver)"))
	private Universidad Universidad;
	
	
	
	@OneToMany(mappedBy = "idMalla")
	private List<Curso> curso = new ArrayList<>();



	public Integer getIdMalla() {
		return idMalla;
	}



	public void setIdMalla(Integer idMalla) {
		this.idMalla = idMalla;
	}



	public String getAño() {
		return año;
	}



	public void setAño(String año) {
		this.año = año;
	}



	public Universidad getUniversidad() {
		return Universidad;
	}



	public void setUniversidad(Universidad universidad) {
		Universidad = universidad;
	}



	public List<Curso> getCurso() {
		return curso;
	}



	public void setCurso(List<Curso> curso) {
		this.curso = curso;
	}
	

	
}
