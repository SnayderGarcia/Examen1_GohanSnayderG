package com.idat.idatapirest.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.ForeignKey;

@Table(name="Cursos")
@Entity
public class Curso implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2154227301093511125L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCurso;
	private String curso;
	private String descripcion;
	
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
	@JoinTable(name ="DetallePC", joinColumns = @JoinColumn(name="idCurso", nullable = false, unique = true,
					foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(idCurso) references Cursos(idCurso)")),
	inverseJoinColumns = @JoinColumn(name="idProfesor", nullable = false, unique = true,
	foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(idProfesor) references Profesor(idProfesor)"))
	)
	private List<Profesor> profesor = new ArrayList<>();
	
	
	@ManyToOne
	@JoinTable(name ="idMalla", joinColumns = @JoinColumn(name="idMalla", nullable = false, unique = true,
	foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(idMalla) references MallaCuricular(idMalla)")))
	private MallaCuricular idMalla;


	public Integer getIdCurso() {
		return idCurso;
	}


	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public List<Profesor> getProfesor() {
		return profesor;
	}


	public void setProfesor(List<Profesor> profesor) {
		this.profesor = profesor;
	}


	public MallaCuricular getIdMalla() {
		return idMalla;
	}


	public void setIdMalla(MallaCuricular idMalla) {
		this.idMalla = idMalla;
	}
	
	
	
}
