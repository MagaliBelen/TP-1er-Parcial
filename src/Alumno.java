import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Alumno extends Persona{
	
	private LocalDate fechaIngreso;
	private Integer dni;
	private List<Materia> materias;


	public Alumno(String nombre, String apellido, Integer id, LocalDate fechaNac, LocalDate fechaIngreso, Integer dni) {
		super(nombre, apellido, id, fechaNac);
		this.fechaIngreso=fechaIngreso;
		this.dni=dni;
		materias = new ArrayList<Materia>();
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

	public List<Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(List<Materia> materias) {
		this.materias = materias;
	}

	

}
