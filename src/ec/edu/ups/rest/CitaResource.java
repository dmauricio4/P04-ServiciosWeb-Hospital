package ec.edu.ups.rest;

import java.lang.annotation.Retention;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
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
		
		System.out.println("Costo+++++++____" + costo);
		System.out.println("Costo+++++++____" + doctorEspecialidad);
		Persona doctor = personaFacade.find(doctorEspecialidad);
		Persona paciente = personaFacade.find(pacientePersona);
		
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = format.parse(fechaCita);
		
		
		Cita cita = new Cita(comentarioCita, BigDecimal.valueOf(costo), estadoCita, date, sintomatologia, doctor, paciente);
		citaFacade.create(cita);
		return Response.status(Response.Status.CREATED).entity(cita).build();
	}
	

}
