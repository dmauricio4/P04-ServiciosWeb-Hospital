package ec.edu.ups.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the "Doctor_Especialidad" database table.
 * 
 */
@Entity
@Table(name="\"Doctor_Especialidad\"")
@NamedQuery(name="Doctor_Especialidad.findAll", query="SELECT d FROM Doctor_Especialidad d")
public class Doctor_Especialidad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_doctor_especialidad")
	private Integer idDoctorEspecialidad;

	//bi-directional many-to-one association to Cita
	@OneToMany(mappedBy="doctorEspecialidad")
	private List<Cita> citas;

	//bi-directional many-to-one association to Especialidad
	@ManyToOne
	@JoinColumn(name="id_especialidad")
	private Especialidad especialidad1;


	//bi-directional many-to-one association to Persona
	@ManyToOne
	@JoinColumn(name="id_doctor")
	private Persona persona;

	public Doctor_Especialidad() {
	}

	public Integer getIdDoctorEspecialidad() {
		return this.idDoctorEspecialidad;
	}

	public void setIdDoctorEspecialidad(Integer idDoctorEspecialidad) {
		this.idDoctorEspecialidad = idDoctorEspecialidad;
	}

	public List<Cita> getCitas() {
		return this.citas;
	}

	public void setCitas(List<Cita> citas) {
		this.citas = citas;
	}

	public Cita addCita(Cita cita) {
		getCitas().add(cita);
		cita.setDoctorEspecialidad(this);

		return cita;
	}

	public Cita removeCita(Cita cita) {
		getCitas().remove(cita);
		cita.setDoctorEspecialidad(null);

		return cita;
	}

	public Especialidad getEspecialidad1() {
		return this.especialidad1;
	}

	public void setEspecialidad1(Especialidad especialidad1) {
		this.especialidad1 = especialidad1;
	}

}