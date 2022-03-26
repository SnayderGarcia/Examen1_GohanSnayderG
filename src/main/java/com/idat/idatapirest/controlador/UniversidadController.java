package com.idat.idatapirest.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.idat.idatapirest.model.Universidad;

import com.idat.idatapirest.service.UniversidadService;

@RestController
@RequestMapping()
public class UniversidadController {
	
	@Autowired
	private UniversidadService service;
	
	
	public ResponseEntity<List<Universidad>> listar(){
		return new ResponseEntity<List<Universidad>>(service.listar(), HttpStatus.OK);
	}

}
