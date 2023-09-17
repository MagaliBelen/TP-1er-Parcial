
public class Aula {
	private int id;
	private int cantDeAlumnos;
	
	public Aula(int id, int cantDeAlumnos) {
		this.id = id;
		this.cantDeAlumnos = cantDeAlumnos;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCantDeAlumnos() {
		return cantDeAlumnos;
	}
	public void setCantDeAlumnos(int cantDeAlumnos) {
		this.cantDeAlumnos = cantDeAlumnos;
	}
}
