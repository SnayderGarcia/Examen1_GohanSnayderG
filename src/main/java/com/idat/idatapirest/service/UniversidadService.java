package com.idat.idatapirest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.idatapirest.model.MallaCuricular;
import com.idat.idatapirest.model.Universidad;
import com.idat.idatapirest.repository.ProfesorRepository;
import com.idat.idatapirest.repository.UniversidadImplement;
import com.idat.idatapirest.repository.UniversidadRepository;

@Service
public class UniversidadService implements UniversidadImplement{

	
	@Autowired
	private UniversidadRepository repositorio;
	
	
	@Override
	public List<Universidad> listar() {
		return (List<Universidad>)repositorio.findAll();
	}

	@Override
	public Optional<Universidad> listarId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer save(Universidad p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
