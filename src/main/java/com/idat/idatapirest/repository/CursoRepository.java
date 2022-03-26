package com.idat.idatapirest.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.idat.idatapirest.model.Curso;


@Repository
public interface CursoRepository extends CrudRepository<Curso, Integer>{
	

	
}
