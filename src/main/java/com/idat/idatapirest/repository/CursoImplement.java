package com.idat.idatapirest.repository;

import java.util.List;
import java.util.Optional;

import com.idat.idatapirest.model.Curso;

public interface CursoImplement  {

	public List<Curso>listar();
	public Optional<Curso>listarId(Integer id);
	public Integer save(Curso c);
	public void delete(Integer id);
	
}
