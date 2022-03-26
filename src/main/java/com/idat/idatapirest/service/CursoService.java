package com.idat.idatapirest.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.idatapirest.model.Curso;
import com.idat.idatapirest.repository.CursoImplement;
import com.idat.idatapirest.repository.CursoRepository;

@Service
public class CursoService implements CursoImplement{

	@Autowired
	private CursoRepository repositorio;

	
	@Override
	public List<Curso> listar() {
		return (List<Curso>)repositorio.findAll();
	}

	@Override
	public Optional<Curso> listarId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer save(Curso c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}
	
	

	
}
