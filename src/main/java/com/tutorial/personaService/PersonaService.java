package com.tutorial.personaService;

import java.util.List;

import com.tutorial.entity.Persona;

public interface PersonaService {

	public List<Persona> findAll();

    public Persona findById(int id);

    public void save(Persona persona);

    public void deleteById(int id);
	
}
