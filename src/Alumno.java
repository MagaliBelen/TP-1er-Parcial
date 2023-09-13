import java.util.Date;

public class Alumno extends Persona{
	
	private Date fechaIngreso;

	public Alumno(String nombre, String apellido, Integer id, Date fechaNac, Date fechaIngreso) {
		super(nombre, apellido, id, fechaNac);
		this.fechaIngreso=fechaIngreso;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

}
