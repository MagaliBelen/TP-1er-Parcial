import java.time.LocalDate;

public class Alumno extends Persona{
	
	private LocalDate fechaIngreso;

	public Alumno(String nombre, String apellido, Integer id, LocalDate fechaNac, LocalDate fechaIngreso) {
		super(nombre, apellido, id, fechaNac);
		this.fechaIngreso=fechaIngreso;
	}

	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

}
