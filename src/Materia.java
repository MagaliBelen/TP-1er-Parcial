import java.util.ArrayList;
import java.util.List;

public class Materia {
	private String nombre;
	private Integer id;
	private List<Materia> materiasCorrelativas;
	
	public Materia(String nombre, Integer id) {
		this.nombre = nombre;
		this.id = id;
		materiasCorrelativas = new ArrayList<Materia>();
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public List<Materia> getMateriasCorrelativas() {
		return materiasCorrelativas;
	}
	public void setMateriasCorrelativas(List<Materia> materiasCorrelativas) {
		this.materiasCorrelativas = materiasCorrelativas;
	}
}
