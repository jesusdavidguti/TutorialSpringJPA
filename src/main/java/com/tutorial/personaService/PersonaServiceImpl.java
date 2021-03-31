package com.tutorial.personaService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorial.entity.Persona;
import com.tutorial.personaDAO.PersonaDAO;

@Service
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	private PersonaDAO personaDAO;
	
	@Override
	public List<Persona> findAll() {
		 List<Persona> listPersonas= personaDAO.findAll();
		 return listPersonas;
	}

	@Override
	public Persona findById(int id) {
		Persona persona = personaDAO.findById(id);
        return persona;
	}

	@Override
	public void save(Persona persona) {
		personaDAO.save(persona);
	}

	@Override
	public void deleteById(int id) {
		personaDAO.deleteById(id);
	}

}
