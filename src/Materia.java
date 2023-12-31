import java.util.ArrayList;
import java.util.List;

public class Materia {
	private String nombre;
	private int id;
	private List<Materia> materiasCorrelativas;
	private List<Nota> notas;
	
	public Materia(String nombre, int id) {
		this.nombre = nombre;
		this.id = id;
		materiasCorrelativas = new ArrayList<Materia>();
		notas = new ArrayList<Nota>();
	}
	
	public boolean agregarCorrelativa(Materia materia) {
        return materiasCorrelativas.add(materia);
    }

    public boolean existeCorrelativa(int id) {
        for (Materia m : materiasCorrelativas) {
            if (id.equals(m.getId())) {
                return true;
            }
        }
        return false;
    }

    private int indexCorrelativa(int id) {
        for (int i = 0; i < materiasCorrelativas.size(); i++) {
            Materia m = materiasCorrelativas.get(i);
            if (id.equals(m.getId())) {
                return i;
            }
        }
        return -1;
    }

	  public boolean eliminarCorrelativa(int idMateriaEliminar) {
        return false;
    }
	

	public void agregarNota(Nota nota) {
        notas.add(nota);
    }

    public List<Nota> obtenerNotas() {
        return notas;
    }




	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
