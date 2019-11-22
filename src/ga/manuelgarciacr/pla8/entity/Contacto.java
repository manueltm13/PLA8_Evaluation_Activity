package ga.manuelgarciacr.pla8.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import ga.manuelgarciacr.pla8.validators.EmailValidation;
import ga.manuelgarciacr.pla8.validators.PhoneNumberValidation;


@Entity
@Table(name = "tbl_contacto")
public class Contacto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idcontacto")
	private int idcontacto;
	@Column(name = "nombre")
	@Size(min = 3, message = "Mínimo tres caracteres")
	private String nombre;
	@Column(name = "email")
	@EmailValidation
	@NotBlank
	private String email;
	@Column(name = "telefono")
	@PhoneNumberValidation
	@NotBlank
	private String telefono;

	public Contacto() {
	}

	public Contacto(String nombre, String email, String telefono) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
	}

	public int getIdcontacto() {
		return idcontacto;
	}

	public void setIdcontacto(int idcontacto) {
		this.idcontacto = idcontacto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Contacto [idcontacto=" + idcontacto + ", nombre=" + nombre + 
				", email=" + email + ", telefono=" + telefono + "]";
	}
}
