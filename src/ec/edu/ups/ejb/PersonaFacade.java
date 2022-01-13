package ec.edu.ups.ejb;

import java.sql.PreparedStatement;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.model.Cita;
import ec.edu.ups.model.Persona;

@Stateless
public class PersonaFacade extends AbstractFacade<Persona> {
	
	@PersistenceContext(unitName = "HospitalServices")
	private EntityManager entityManager;

	public PersonaFacade() {
		super(Persona.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return entityManager;
	}
	
	public Persona getPersona(String correo, String password) {
		String query = "SELECT p FROM Persona p WHERE p.correo = :correo AND p.password = :password";
		Persona persona = null;
		
		try {
			persona = (Persona) entityManager.createQuery(query)
											 .setParameter("correo", correo)
											 .setParameter("password", password)
											 .getSingleResult();
			
			System.out.println("PersonaFACADE -->" + persona.toString());
		} catch (Exception e) {
			System.out.println("--> ERROR Persona.getPersona" + e.getMessage());
		}
		return persona;
	}
	
	

}
