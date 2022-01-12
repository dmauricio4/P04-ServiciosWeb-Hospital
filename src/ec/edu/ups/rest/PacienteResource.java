package ec.edu.ups.rest;


import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import ec.edu.ups.ejb.PersonaFacade;
import ec.edu.ups.model.Persona;



@Path("/paciente")
public class PacienteResource {
	
	@EJB
	private PersonaFacade personaFacade;
	
	@GET()
	@Path("/login")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getPersona(@QueryParam("correo") String correo, @QueryParam("password") String password) {
		Persona personaLogin= new Persona();
		
		System.out.println("Correo " + correo);
		System.out.println("Password " + password);
		
		try {
			personaLogin = personaFacade.getPersona(correo, password);
			
			if (personaLogin == null) {
				return Response.status(Response.Status.NOT_FOUND).entity(404).build();
			} else {
				return Response.ok(personaLogin).build();
			}
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(500).build();
		}
	}
	
	
	

	

}
