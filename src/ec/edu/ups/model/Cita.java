package ec.edu.ups.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the "Cita" database table.
 * 
 */
@Entity
@Table(name="\"Cita\"")
@NamedQuery(name="Cita.findAll", query="SELECT c FROM Cita c")
public class Cita implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_cita")
	private Integer idCita;

	@Column(name="comentario_cita")
	private String comentarioCita;

	private BigDecimal costo;

	@Column(name="estado_cita")
	private String estadoCita;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_cita")
	private Date fechaCita;

	private String sintomatologia;

	//bi-directional many-to-one association to Doctor_Especialidad
	@ManyToOne
	@JoinColumn(name="id_medico_especialidad")
	private Doctor_Especialidad doctorEspecialidad;

	//bi-directional many-to-one association to Persona
	@ManyToOne
	@JoinColumn(name="id_paciente")
	private Persona persona;

	//bi-directional many-to-one association to Factura_Detalle
	@OneToMany(mappedBy="cita")
	private List<Factura_Detalle> facturaDetalles;

	//bi-directional many-to-one association to Historial
	@OneToMany(mappedBy="cita")
	private List<Historial> historials;

	public Cita() {
	}

	public Integer getIdCita() {
		return this.idCita;
	}

	public void setIdCita(Integer idCita) {
		this.idCita = idCita;
	}

	public String getComentarioCita() {
		return this.comentarioCita;
	}

	public void setComentarioCita(String comentarioCita) {
		this.comentarioCita = comentarioCita;
	}

	public BigDecimal getCosto() {
		return this.costo;
	}

	public void setCosto(BigDecimal costo) {
		this.costo = costo;
	}

	public String getEstadoCita() {
		return this.estadoCita;
	}

	public void setEstadoCita(String estadoCita) {
		this.estadoCita = estadoCita;
	}

	public Date getFechaCita() {
		return this.fechaCita;
	}

	public void setFechaCita(Date fechaCita) {
		this.fechaCita = fechaCita;
	}

	public String getSintomatologia() {
		return this.sintomatologia;
	}

	public void setSintomatologia(String sintomatologia) {
		this.sintomatologia = sintomatologia;
	}

	public Doctor_Especialidad getDoctorEspecialidad() {
		return this.doctorEspecialidad;
	}

	public void setDoctorEspecialidad(Doctor_Especialidad doctorEspecialidad) {
		this.doctorEspecialidad = doctorEspecialidad;
	}

	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public List<Factura_Detalle> getFacturaDetalles() {
		return this.facturaDetalles;
	}

	public void setFacturaDetalles(List<Factura_Detalle> facturaDetalles) {
		this.facturaDetalles = facturaDetalles;
	}

	public Factura_Detalle addFacturaDetalle(Factura_Detalle facturaDetalle) {
		getFacturaDetalles().add(facturaDetalle);
		facturaDetalle.setCita(this);

		return facturaDetalle;
	}

	public Factura_Detalle removeFacturaDetalle(Factura_Detalle facturaDetalle) {
		getFacturaDetalles().remove(facturaDetalle);
		facturaDetalle.setCita(null);

		return facturaDetalle;
	}

	public List<Historial> getHistorials() {
		return this.historials;
	}

	public void setHistorials(List<Historial> historials) {
		this.historials = historials;
	}

	public Historial addHistorial(Historial historial) {
		getHistorials().add(historial);
		historial.setCita(this);

		return historial;
	}

	public Historial removeHistorial(Historial historial) {
		getHistorials().remove(historial);
		historial.setCita(null);

		return historial;
	}

}