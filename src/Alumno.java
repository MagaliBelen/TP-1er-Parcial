import java.time.LocalDate;
import java.util.List;

public class Alumno extends Persona{
	
	private LocalDate fechaIngreso;
	private Integer dni;

	public Alumno(String nombre, String apellido, Integer id, LocalDate fechaNac, LocalDate fechaIngreso, Integer dni) {
		super(nombre, apellido, id, fechaNac);
		this.fechaIngreso=fechaIngreso;
		this.dni=dni;
	}

	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	 public boolean tieneCursadasAprobadas(Materia materia) {
        // Obtener la lista de materias correlativas de la materia actual
        List<Materia> correlativas = materia.getMateriasCorrelativas();

        // Verificar si el alumno ha aprobado todas las correlativas con nota >= 4
        for (Materia correlativa : correlativas) {
            if (!haAprobadoMateriaConNota(correlativa, 4)) {
                return false;
            }
        }

        return true;
    }

	private boolean haAprobadoMateriaConNota(Materia materia, int notaMinima) {
        // Implementa aquí la lógica para verificar si el alumno ha aprobado la materia con una nota >= notaMinima.
        // Esto podría implicar buscar en un registro de notas del alumno para la materia en cuestión.
        // Por ejemplo:
        /*
        for (Nota nota : notas) {
            if (nota.getMateria().equals(materia) && nota.getNota() >= notaMinima) {
                return true;
            }
        }
        return false;
        */

        // En esta implementación de ejemplo, se asume que tienes una lista de notas para el alumno.
        // Debes adaptar esta lógica según cómo estés registrando las notas de los alumnos en tu sistema.
    }

	public boolean estaInscritoEnOtroCursoParaElMismoDiaYTurno(Curso curso) {
		return false;
	}

	

}
