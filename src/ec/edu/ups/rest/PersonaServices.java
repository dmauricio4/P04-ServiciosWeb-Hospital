package ec.edu.ups.rest;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import ec.edu.ups.ejb.PersonaFacade;
import ec.edu.ups.model.Persona;

@Path("/persona")
public class PersonaServices {
	
	@EJB
	private PersonaFacade ejbPersona;
	

}
