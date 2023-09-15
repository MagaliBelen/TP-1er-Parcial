import java.time.LocalDate;

public class Alumno extends Persona{
	
	private LocalDate fechaIngreso;
	private Integer dni;

	public Alumno(String nombre, String apellido, Integer id, LocalDate fechaNac, LocalDate fechaIngreso, Integer dni) {
		super(nombre, apellido, id, fechaNac);
		this.fechaIngreso=fechaIngreso;
		this.dni=dni;
	}

	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	

}
