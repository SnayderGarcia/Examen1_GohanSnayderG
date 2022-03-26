
package com.idat.idatapirest.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idat.idatapirest.model.Curso;
import com.idat.idatapirest.service.CursoService;

@RestController
@RequestMapping()
public class CursoController {
	
	@Autowired
	private CursoService service;
	
	
	public ResponseEntity<List<Curso>> listar(){
		return new ResponseEntity<List<Curso>>(service.listar(), HttpStatus.OK);
		
	}
}
