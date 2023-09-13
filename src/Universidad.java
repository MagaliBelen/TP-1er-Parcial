import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Universidad {
    private List<Materia> materias;
    private List<Alumno> alumnos;
    private List<CicloLectivo> ciclosLectivos;
    private List<Comision> comisiones;
    private List<Profesor> docentes;

    public Universidad() {
        this.materias = new ArrayList<>();
        this.alumnos = new ArrayList<>();
        this.ciclosLectivos = new ArrayList<>();
        this.comisiones = new ArrayList<>();
        this.docentes = new ArrayList<>();
    }

    //Agregar Materias
    public void AgregarMateria(int id, String nombre) {
        // Validar que no exista otra Materia con el mismo ID
        if (existeMateriaConId(id)) {
            System.out.println("Ya existe una materia con el mismo ID");
            return;
        }

        Materia nuevaMateria = new Materia(nombre, id);
        materias.add(nuevaMateria);
    }


    // Si existe la materia 
    private boolean existeMateriaConId(int id) {
        for (Materia materia : materias) {
            if (materia.getId() == id) {
                return true;
            }
        }
        return false;
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

    // Si existe el alumno 
    private boolean existeAlumnoConId(int id) {
        for (Alumno alumno : alumnos) {
            if (alumno.getId() == id) {
                return true;
            }
        }
        return false;
    }


    //Crear ciclo lectivo
    public void CrearCicloLectivo(int id, String fechaInicio, String fechaFinalizacion, String fechaInicioInscripcion, String fechaFinalizacionInscripcion) {
        // Validar ID único
        if (existeCicloLectivoConId(id)) {
            System.out.println("Ya existe un ciclo lectivo con el mismo ID.");
            return; // Puedes lanzar una excepción si lo prefieres
        }

        CicloLectivo nuevoCiclo = new CicloLectivo(null, null, null, null, null);
        ciclosLectivos.add(nuevoCiclo);
    }

    //Validar si existe el ciclo
    private boolean existeCicloLectivoConId(int id) {
        for (CicloLectivo ciclo : ciclosLectivos) {
            if (ciclo.getId() == id) {
                return true;
            }
        }
        return false;
    }

   
}
