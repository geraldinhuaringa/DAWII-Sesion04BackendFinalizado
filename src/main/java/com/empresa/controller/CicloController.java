package com.empresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.Ciclo;
import com.empresa.service.CicloService;

@RestController
@RequestMapping("/rest/ciclo")
@CrossOrigin(origins = "http://localhost:4200")
public class CicloController {

	
	@Autowired
	private CicloService cicloService;

	@GetMapping
	@ResponseBody
	public ResponseEntity<List<Ciclo>> listaCiclo(){
		List<Ciclo> lista = cicloService.listaCiclo();
		return ResponseEntity.ok(lista);
	}
}
