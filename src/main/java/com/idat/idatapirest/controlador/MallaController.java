package com.idat.idatapirest.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.idat.idatapirest.model.MallaCuricular;

import com.idat.idatapirest.service.MallaService;

@RestController
@RequestMapping
public class MallaController {
	
	@Autowired
	private MallaService service;
	
	
	public ResponseEntity<List<MallaCuricular>> listar(){
		return new ResponseEntity<List<MallaCuricular>>(service.listar(), HttpStatus.OK);
	}
	

}
