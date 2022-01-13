package ec.edu.ups.rest;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import ec.edu.ups.ejb.CitaFacade;
import ec.edu.ups.ejb.PersonaFacade;
import ec.edu.ups.model.Cita;
import ec.edu.ups.model.Persona;

@Path("/cita")
public class CitaResource {
	
	@EJB
	private CitaFacade citaFacade;
	
	@EJB
	private PersonaFacade personaFacade;
	
	@POST()
	@Path("/crear")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public Response createCitaMedica(@FormParam("comentario") String comentarioCita, @FormParam("costo") Integer costo,
									 @FormParam("estado") String estadoCita,@FormParam("fecha") String fechaCita,@FormParam("sintomas") String sintomatologia,
									 @FormParam("doctor") Integer doctorEspecialidad,@FormParam("paciente") Integer pacientePersona) throws ParseException {
		
		
		Persona doctor = personaFacade.find(doctorEspecialidad);
		Persona paciente = personaFacade.find(pacientePersona);
		
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = format.parse(fechaCita);
		
		
		Cita cita = new Cita(comentarioCita, BigDecimal.valueOf(costo), estadoCita, date, sintomatologia, doctor, paciente);
		citaFacade.create(cita);
		return Response.status(Response.Status.CREATED).entity(cita).build();
	}
	
	@PUT()
	@Path("/actualizar")
	@Produces(MediaType.APPLICATION_JSON)
	public Response actualizarcita(@QueryParam("estadocita")String newestadocita, @QueryParam("id") int id) {
		 Cita cita = citaFacade.find(id);
		 cita.setEstadoCita(newestadocita);
		 if(cita==null) {
			 return Response.ok("cita no encontrada").build();
		 }else {
			 cita.setEstadoCita(newestadocita);;
			 citaFacade.edit(cita);
		 }
		 return Response.ok(cita).build();	
	}
	
	@PUT()
	@Path("/cancelarCitaMedica")
	@Produces(MediaType.APPLICATION_JSON)
	public Response cancelarCitaMedica(@FormParam("id") int id) {
		 Cita cita = citaFacade.find(id);
		 System.out.println("No encontrado Id de cita");
		 if(cita==null) {
			 return Response.status(Response.Status.NOT_MODIFIED).build();
		 }else {
			 cita.setEstadoCita("cancelar");
			 citaFacade.edit(cita);
		 }
		 return Response.ok(cita).build();	
	}

}
