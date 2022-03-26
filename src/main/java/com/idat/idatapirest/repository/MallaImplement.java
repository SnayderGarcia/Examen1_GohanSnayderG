package com.idat.idatapirest.repository;

import java.util.List;
import java.util.Optional;

import com.idat.idatapirest.model.MallaCuricular;



public interface MallaImplement {

	public List<MallaCuricular>listar();
	public Optional<MallaCuricular>listarId(Integer id);
	public Integer save(MallaCuricular m);
	public void delete(Integer id);
}
