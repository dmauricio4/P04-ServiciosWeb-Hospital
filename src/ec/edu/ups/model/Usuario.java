package ec.edu.ups.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USUARIO")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="use_id")
	private Integer IDPersona;
	@Column(name="use_cedula", length=255, nullable=false)
	private String cedula;
	@Column(name="use_apellidos", length=255, nullable=false)
	private String apellidos;
	@Column(name="use_nombres", length=255, nullable=false)
	private String nombres;
	@Column(name="use_direccion", length=255, nullable=false)
	private String direccion;
	@Column(name="use_telefono", length=20, nullable=false)
	private String telefono;
	@Column(name="use_correo", length=255, nullable=false)
	private String correo;
	@Column(name="use_rol", length=1, nullable=false, columnDefinition = "VARCHAR(1) DEFAULT 'C'" )
	private String rol;
	@Column(name="use_rol", length=255, nullable=false)
	private String password;
	
	public Usuario() {
		super();
	}

	public Integer getIDPersona() {
		return IDPersona;
	}

	public void setIDPersona(Integer iDPersona) {
		IDPersona = iDPersona;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Usuario [IDPersona=" + IDPersona + ", cedula=" + cedula + ", apellidos=" + apellidos + ", nombres="
				+ nombres + ", direccion=" + direccion + ", telefono=" + telefono + ", correo=" + correo + ", rol="
				+ rol + ", password=" + password + "]";
	}
}
