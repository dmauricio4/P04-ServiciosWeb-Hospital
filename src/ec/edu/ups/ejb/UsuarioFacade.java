package ec.edu.ups.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.model.Usuario;

@Stateless
public class UsuarioFacade extends AbstractFacade<Usuario> {

	@PersistenceContext(unitName = "rest")
    private EntityManager em;
	
	public UsuarioFacade() {
		super(Usuario.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}
	
	

}
