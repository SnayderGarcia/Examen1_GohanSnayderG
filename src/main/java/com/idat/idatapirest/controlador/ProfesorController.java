package com.idat.idatapirest.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idat.idatapirest.model.Profesor;
import com.idat.idatapirest.service.ProfesorService;

@RestController
@RequestMapping()
public class ProfesorController {

	
	@Autowired
	private ProfesorService service;
	
	
	public ResponseEntity<List<Profesor>> listar(){
		return new ResponseEntity<List<Profesor>>(service.listar(), HttpStatus.OK);
	}
		
}
