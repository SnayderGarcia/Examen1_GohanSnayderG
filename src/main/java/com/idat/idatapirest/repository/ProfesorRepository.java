package com.idat.idatapirest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.idat.idatapirest.model.Profesor;

@Repository
public interface ProfesorRepository extends CrudRepository<Profesor, Integer>{

}
