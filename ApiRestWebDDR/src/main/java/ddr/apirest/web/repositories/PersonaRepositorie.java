package ddr.apirest.web.repositories;

import org.springframework.data.repository.CrudRepository;

import ddr.apirest.web.models.PersonaModel;

public interface PersonaRepositorie extends CrudRepository<PersonaModel, Long>{

}
