import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Universidad {
    private List<Materia> materias;
    private List<Alumno> alumnos;

    public Universidad() {
        this.materias = new ArrayList<>();
        this.alumnos = new ArrayList<>();
    }

    //Agregar Materias
    public void AgregarMateria(int id, String nombre) {
        // Validar que no exista otra Materia con el mismo ID
        if (existeMateriaConId(id)) {
            System.out.println("Ya existe una materia con el mismo ID.");
            return; // Puedes lanzar una excepción si lo prefieres
        }

        Materia nuevaMateria = new Materia(nombre, id);
        materias.add(nuevaMateria);
    }

    //Agregar Alumno
    public void AgregarAlumno(String nombre, String apellido, Integer id, Date fechaNac, Date fechaIngreso) {
        // Validar id único
        if (existeAlumnoConId(id)) {
            System.out.println("Ya existe un alumno con el mismo ID");
            return; 
        }

        Alumno nuevoAlumno = new Alumno(nombre, apellido, id, fechaNac, fechaIngreso);
        alumnos.add(nuevoAlumno);
    }

    // Si existe materia 
    private boolean existeMateriaConId(int id) {
        for (Materia materia : materias) {
            if (materia.getId() == id) {
                return true;
            }
        }
        return false;
    }

    // Si existe alumno 
    private boolean existeAlumnoConId(int id) {
        for (Alumno alumno : alumnos) {
            if (alumno.getId() == id) {
                return true;
            }
        }
        return false;
    }

   
}
