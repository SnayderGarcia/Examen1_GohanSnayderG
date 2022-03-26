package com.idat.idatapirest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.idatapirest.model.MallaCuricular;
import com.idat.idatapirest.repository.MallaImplement;
import com.idat.idatapirest.repository.MallaRepository;


@Service
public class MallaService implements MallaImplement {

	
	@Autowired
	private MallaRepository repositorio;
	
	@Override
	public List<MallaCuricular> listar() {
		return (List<MallaCuricular>)repositorio.findAll();
	}

	@Override
	public Optional<MallaCuricular> listarId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer save(MallaCuricular m) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
