package ec.edu.ups.rest;


import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.weld.context.ejb.Ejb;

import ec.edu.ups.ejb.CitasFacade;
import ec.edu.ups.model.Cita;

@Path("/cita")
public class CitasResource {
	
	@Ejb
	private CitasFacade citaejb;
	
	@PUT()
	@Path("/actualizar")
	@Produces(MediaType.APPLICATION_JSON)
	public Response actualizarcita(@QueryParam("estadocita")String newestadocita, @QueryParam("id") int id) {
		 Cita cita = citaejb.find(id);
		 cita.setEstadoCita(newestadocita);
		 if(cita==null) {
			 return Response.ok("cita no encontrada").build();
		 }else {
			 cita.setEstadoCita(newestadocita);;
		 citaejb.edit(cita);
		 }
		 return Response.ok(cita).build();	
	}
	
	


}
