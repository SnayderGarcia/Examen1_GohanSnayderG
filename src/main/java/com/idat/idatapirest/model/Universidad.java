package com.idat.idatapirest.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name="Universidad")
@Entity
public class Universidad implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5559873122725693121L;
	private Integer idUniver;
	private String universidad;
	
	@OneToOne(mappedBy ="Universidad")
	private MallaCuricular malla;

	public Integer getIdUniver() {
		return idUniver;
	}

	public void setIdUniver(Integer idUniver) {
		this.idUniver = idUniver;
	}

	public String getUniversidad() {
		return universidad;
	}

	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}

	public MallaCuricular getMalla() {
		return malla;
	}

	public void setMalla(MallaCuricular malla) {
		this.malla = malla;
	}
	

	

}
