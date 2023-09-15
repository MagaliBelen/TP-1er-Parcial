import java.util.ArrayList;
import java.util.List;

public class Materia {
	private String nombre;
	private Integer id;
	private List<Materia> materiasCorrelativas;
	private List<Nota> notas;
	
	public Materia(String nombre, Integer id) {
		this.nombre = nombre;
		this.id = id;
		materiasCorrelativas = new ArrayList<Materia>();
		notas = new ArrayList<Nota>();
	}
	
	public boolean agregarCorrelativa(Materia materia) {
        return materiasCorrelativas.add(materia);
    }

    public boolean existeCorrelativa(Integer id) {
        for (Materia m : materiasCorrelativas) {
            if (id.equals(m.getId())) {
                return true;
            }
        }
        return false;
    }

    private Integer indexCorrelativa(Integer id) {
        for (int i = 0; i < materiasCorrelativas.size(); i++) {
            Materia m = materiasCorrelativas.get(i);
            if (id.equals(m.getId())) {
                return i;
            }
        }
        return -1;
    }

	  public boolean eliminarCorrelativa(Integer idMateriaEliminar) {
        return false;
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

	public List<Nota> getNotas() {
		return notas;
	}

	public void setNotas(List<Nota> notas) {
		this.notas = notas;
	}

  
}
