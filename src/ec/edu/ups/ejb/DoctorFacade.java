package ec.edu.ups.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.model.Doctor;

@Stateless
public class DoctorFacade extends AbstractFacade<Doctor> {

	@PersistenceContext(unitName = "rest")
    private EntityManager em;
	
	public DoctorFacade() {
		super(Doctor.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
