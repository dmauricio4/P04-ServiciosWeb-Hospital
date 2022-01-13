package ec.edu.ups.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.model.Cita;

@Stateless
public class CitaFacade extends AbstractFacade<Cita> {
	
	@PersistenceContext(unitName = "HospitalServices")
	private EntityManager entityManager;

	public CitaFacade() {
		super(Cita.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return entityManager;
	}
	
	

}
