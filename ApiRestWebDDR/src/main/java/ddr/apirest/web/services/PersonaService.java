package ddr.apirest.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ddr.apirest.web.models.PersonaModel;
import ddr.apirest.web.repositories.PersonaRepositorie;

@Service
public class PersonaService {
	
	@Autowired
	private PersonaRepositorie personaRepositorie;
	
	public List<PersonaModel> recuperarTodos(){
		return (List<PersonaModel>) personaRepositorie.findAll();
	}

}
