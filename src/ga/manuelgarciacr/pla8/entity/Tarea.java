package ga.manuelgarciacr.pla8.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;




@Entity
@Table(name = "tarea")
public class Tarea {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idtarea")
	private int idtarea;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "prioridad")
	private String prioridad;
	@Column(name = "vencimiento")
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date vencimiento;

	public Tarea() {
	}

	public Tarea(String nombre, String prioridad, Date vencimiento) {
		super();
		this.nombre = nombre;
		this.prioridad = prioridad;
		this.vencimiento = vencimiento;
	}

	public int getIdtarea() {
		return idtarea;
	}

	public void setIdtarea(int idtarea) {
		this.idtarea = idtarea;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}

	public Date getVencimiento() {
		return vencimiento;
	}

	public void setVencimiento(Date vencimiento) {
		this.vencimiento = vencimiento;
	}

	@Override
	public String toString() {
		return "Tarea [idtarea=" + idtarea + ", nombre=" + nombre + 
				", prioridad=" + prioridad + ", vencimiento=" + vencimiento + "]";
	}
}
