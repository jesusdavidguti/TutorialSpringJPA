package com.tutorial.personaDAO;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tutorial.entity.Persona;

@Repository
public class PersonaDAOImpl implements PersonaDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Persona> findAll() {
		
		Session currentSession = entityManager.unwrap(Session.class);

        Query<Persona> theQuery = currentSession.createQuery("from persona", Persona.class);

        List<Persona> personas = theQuery.getResultList();

        return personas;		
	}

	@Override
	public Persona findById(int id) {
		
		Session currentSession = entityManager.unwrap(Session.class);

        Persona persona = currentSession.get(Persona.class, id);

        return persona;
	}

	@Transactional
	@Override
	public void save(Persona persona) {
		
		Session currentSession = entityManager.unwrap(Session.class);

        currentSession.saveOrUpdate(persona);  
	}

	@Transactional
	@Override
	public void deleteById(int id) {
		
		 Session currentSession = entityManager.unwrap(Session.class);
		 
		 Query<Persona> theQuery =  currentSession.createQuery("Delete from persona where id_persona=:idPersona");
		  
		 theQuery.setParameter("idPersona", id); 
		 theQuery.executeUpdate();
		 	     	     	     
	}

}
