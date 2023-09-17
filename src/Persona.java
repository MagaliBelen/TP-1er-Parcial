import java.time.LocalDate;

public class Persona {
	private String nombre;
    private String apellido;
    private int id;
    private LocalDate fechaNac;
    
	public Persona(String nombre, String apellido, int id, LocalDate fechaNac) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
		this.fechaNac = fechaNac;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public LocalDate getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	} 
}
