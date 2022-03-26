package com.idat.idatapirest.repository;

import java.util.List;
import java.util.Optional;

import com.idat.idatapirest.model.Universidad;

public interface UniversidadImplement {

	
	public List<Universidad>listar();
	public Optional<Universidad>listarId(Integer id);
	public Integer save(Universidad p);
	public void delete(Integer id);
}
