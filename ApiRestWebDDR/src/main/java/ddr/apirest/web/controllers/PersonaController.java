package ddr.apirest.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ddr.apirest.web.models.PersonaModel;
import ddr.apirest.web.services.PersonaService;

//@CrossOrigin
@RestController
@RequestMapping("/personas")
public class PersonaController {
	
	@Autowired
	private PersonaService personaService;
	
	@GetMapping("/recuperarTodos")
	public List<PersonaModel> recuperarTodos() {
		return personaService.recuperarTodos();
		
	}

}
