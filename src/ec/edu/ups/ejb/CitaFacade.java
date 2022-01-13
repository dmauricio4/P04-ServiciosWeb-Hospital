package ec.edu.ups.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.model.Cita;
 @Stateless
public class CitaFacade extends AbstractFacade<Cita>{
	
	@PersistenceContext(unitName = "HospitalServices")
	private EntityManager entityManager;

	public CitaFacade(Class<Cita> entityClass) {
		super(entityClass);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return null;
	}

}
