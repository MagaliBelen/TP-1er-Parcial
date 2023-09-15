import java.time.LocalDate;

public class Persona {
	private String nombre;
    private String apellido;
    private Integer id;
    private LocalDate fechaNac;
    
	public Persona(String nombre, String apellido, Integer id, LocalDate fechaNac) {
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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	} 
}
