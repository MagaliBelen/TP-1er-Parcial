import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Alumno extends Persona{
	
	private LocalDate fechaIngreso;
	private int dni;
	private List<Materia> materias;


	public Alumno(String nombre, String apellido, int id, LocalDate fechaNac, LocalDate fechaIngreso, int dni) {
		super(nombre, apellido, id, fechaNac);
		this.fechaIngreso=fechaIngreso;
		this.dni=dni;
		materias = new ArrayList<Materia>();
	}


	public void agregarMateria(String nombre) {
        Materia materia = new Materia(nombre, dni);
        materias.add(materia);
    }

    public void agregarNota(String nombreMateria, double nota) {
        for (Materia materia : materias) {
            if (materia.getNombre().equals(nombreMateria)) {
                materia.agregarNota(nota);
                if (nota >= 4.0) {
                    materias.add(materia);
                }
                break;
            }
        }
    }

    public boolean tieneCorrelativasAprobadas(List<String> correlativas) {
        for (String correlativa : correlativas) {
            boolean aprobada = false;
            for (Materia materia : materias) {
                if (materia.getNombre().equals(correlativa)) {
                    aprobada = true;
                    break;
                }
            }
            if (!aprobada) {
                return false;
            }
        }
        return true;
    }











	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public List<Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(List<Materia> materias) {
		this.materias = materias;
	}

	

}
