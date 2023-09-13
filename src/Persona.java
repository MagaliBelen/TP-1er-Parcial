import java.util.Date;

public class Persona {
	private String nombre;
    private String apellido;
    private Integer id;
    private Date fechaNac;
    
	public Persona(String nombre, String apellido, Integer id, Date fechaNac) {
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
	public Date getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	} 
}
