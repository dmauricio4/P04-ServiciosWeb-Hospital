package ec.edu.ups.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.model.Persona;

@Stateless
public class PersonaFacade extends AbstractFacade<Persona> {

	@PersistenceContext(unitName = "rest")
    private EntityManager em;
	
	public PersonaFacade() {
		super(Persona.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Persona finByEmailAndPass(String correo, String pass) throws Exception {
		try {
			String jpql = "FROM Persona u WHERE u.correo =  ?1 AND u.password = ?2";
			Query query = em.createQuery(jpql);
			query.setParameter(1, correo);
			query.setParameter(2, pass);
			System.out.println(jpql);
			Persona p = new Persona();
			p = (Persona)query.getSingleResult();
			return p; 

		} catch (Exception e) {
			System.out.println("Error: " + e);
			return null;
		}

	}
	
}
