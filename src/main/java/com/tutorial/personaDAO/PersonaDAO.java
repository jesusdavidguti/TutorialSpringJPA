package com.tutorial.personaDAO;

import java.util.List;

import com.tutorial.entity.Persona;

public interface PersonaDAO {

	 public List<Persona> findAll();

	 public Persona findById(int id);
	 
	 public void save(Persona persona);

	 public void deleteById(int id);
	
}
