package com.cursogit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cursogit.model.Curso;
import com.cursogit.service.CursosService;

@RestController
public class CursosController {
	@Autowired
	CursosService cursosService;
	@GetMapping(value="buscar",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> cursosTematica(@RequestParam("tematica") String tematica){
		return cursosService.buscarPorTematica(tematica);
	}

}
