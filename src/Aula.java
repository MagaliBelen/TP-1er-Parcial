
public class Aula {
	private Integer id;
	private Integer cantDeAlumnos;
	
	public Aula(Integer id, Integer cantDeAlumnos) {
		this.id = id;
		this.cantDeAlumnos = cantDeAlumnos;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCantDeAlumnos() {
		return cantDeAlumnos;
	}
	public void setCantDeAlumnos(Integer cantDeAlumnos) {
		this.cantDeAlumnos = cantDeAlumnos;
	}
}
