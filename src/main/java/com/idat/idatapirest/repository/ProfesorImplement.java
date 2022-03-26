package com.idat.idatapirest.repository;

import java.util.List;
import java.util.Optional;

import com.idat.idatapirest.model.Curso;
import com.idat.idatapirest.model.Profesor;

public interface ProfesorImplement {

	public List<Profesor>listar();
	public Optional<Profesor>listarId(Integer id);
	public Integer save(Profesor p);
	public void delete(Integer id);
}
