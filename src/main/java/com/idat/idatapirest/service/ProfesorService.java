package com.idat.idatapirest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.idatapirest.model.Curso;
import com.idat.idatapirest.model.Profesor;
import com.idat.idatapirest.repository.ProfesorImplement;
import com.idat.idatapirest.repository.ProfesorRepository;

@Service
public class ProfesorService implements ProfesorImplement {

	@Autowired
	private ProfesorRepository repositorio;
	
	@Override
	public List<Profesor> listar() {
		return (List<Profesor>)repositorio.findAll();
	}

	@Override
	public Optional<Profesor> listarId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer save(Profesor p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub

	}

}
