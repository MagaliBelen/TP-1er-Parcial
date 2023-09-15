import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

public class Universidad {
    private List<Materia> materias;
    private List<Alumno> alumnos;
    private List<CicloLectivo> ciclosLectivos;
    private List<Curso> Cursoes;
    private List<Profesor> profesores;

    public Universidad() {
        this.materias = new ArrayList<>();
        this.alumnos = new ArrayList<>();
        this.ciclosLectivos = new ArrayList<>();
        this.Cursoes = new ArrayList<>();
        this.profesores = new ArrayList<>();
    }

    // Agregar Materias
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

    // Agregar Alumno
    public void AgregarAlumno(String nombre, String apellido, Integer id, LocalDate fechaNac, LocalDate fechaIngreso,
            Integer dni) {
        // Validar id único
        if (existeAlumnoConId(id)) {
            System.out.println("Ya existe un alumno con el mismo ID");
            return;
        }

        Alumno nuevoAlumno = new Alumno(nombre, apellido, id, fechaNac, fechaIngreso, dni);
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

    // Crear ciclo lectivo
    public void CrearCicloLectivo(int id, String fechaInicio, String fechaFinalizacion, String fechaInicioInscripcion,
            String fechaFinalizacionInscripcion) {
        // Validar ID único
        if (existeCicloLectivoConId(id)) {
            System.out.println("Ya existe un ciclo lectivo con el mismo ID.");
            return;
        }

        CicloLectivo nuevoCiclo = new CicloLectivo(null, null, null, null, null);
        ciclosLectivos.add(nuevoCiclo);
    }

    // Validar si existe el ciclo
    private boolean existeCicloLectivoConId(int id) {
        for (CicloLectivo ciclo : ciclosLectivos) {
            if (ciclo.getId() == id) {
                return true;
            }
        }
        return false;
    }

    // Crear Curso
    public void CrearCurso(int id, Materia materia, CicloLectivo cicloLectivo, EnumTurno turno) {
        // Validar que no exista otra Comisión con los mismos parámetros
        if (existeCursoConParametros(id, materia, cicloLectivo, turno)) {
            System.out.println("Ya existe una comisión con la misma materia, ciclo lectivo y turno");
            return;
        }

        // agregamos la Curso
        Curso nuevaCurso = new Curso(id, materia, cicloLectivo, turno);
        Cursoes.add(nuevaCurso);
    }

    // validacion
    private boolean existeCursoConParametros(int id, Materia materia, CicloLectivo cicloLectivo, EnumTurno turno) {
        for (Curso Curso : Cursoes) {
            if (Curso.getMateria().equals(materia) &&
                    Curso.getCicloLectivo().equals(cicloLectivo) &&
                    Curso.getTurno().equals(turno)) {
                return true;
            }
        }
        return false;
    }

    // Crear docentes
    public void CrearProfesores(int id, String nombre, String apellido, String fechaNacimiento) {
        // Crear un nuevo Profesor y agregarlo a la lista de docentes
        Profesor nuevoProfesor = new Profesor(nombre, apellido, null, null);
        profesores.add(nuevoProfesor);
    }

    // Agregamos correlativas
    public boolean agregarCorrelativa(Materia m, Materia corr) {
        if (m.getId().equals(corr.getId())) {
            System.out.println("Una materia no puede ser correlativa de la misma materia");
            return false;
        }
        if (m.existeCorrelativa(corr.getId())) {
            System.out.println("Ya existe esa materia como correlativa");
            return false;
        }
        System.out.println("Agregando correlativa");
        return m.agregarCorrelativa(corr);
    }

    // Eliminamos la correlativa
    public boolean eliminarCorrelativa(Materia m, Integer idMateriaEliminar) {
        if (m.getId().equals(idMateriaEliminar)) {
            System.out.println("Una materia no puede ser correlativa de la misma materia");
            return false;
        }
        if (!m.existeCorrelativa(idMateriaEliminar)) {
            System.out.println("No existe esa materia como correlativa");
            return false;
        }
        System.out.println("Eliminando correlativa");
        return m.eliminarCorrelativa(idMateriaEliminar);
    }

    // Inscribir alumno
    // Verificar que el alumno y el curso este dado de alta
   /*  public boolean inscribirAlumnoACurso(Integer id, Integer codigoCurso) {
        Alumno aluEncontrado = obtenerAlumno(id);
        if (aluEncontrado == null) {
            System.out.println("No existe el alumno!");
            return false;
        }
        Curso comEncontrada = obtenerCurso(codigoCurso);
        if (comEncontrada == null) {
            System.out.println("No existe la Curso");
        }

        return true;
    }

    private Alumno obtenerAlumno(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    private Curso obtenerCurso(Integer codigoCurso) {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }*/

    public void InscribirAlumnoACurso(int dni, int codigoCurso) {
        // Buscar al alumno y el curso correspondientes
        Alumno alumno = buscarAlumnoPorDNI(dni);
        Curso curso = buscarCursoPorCodigo(codigoCurso);

        if (alumno == null || curso == null) {
            System.out.println("El alumno y/o el curso no existen.");
            return; 
        }

        // Verificar si el alumno tiene al menos cursadas todas las correlativas con nota >= 4
        if (!alumno.tieneCursadasAprobadas(curso.getMateria())) {
            System.out.println("El alumno no tiene al menos cursadas todas las correlativas con nota >= 4.");
            return; // Puedes lanzar una excepción si lo prefieres
        }

        // Verificar si la inscripción está dentro de las fechas de inscripción
        if (!curso.estaDentroDelPeriodoDeInscripcion()) {
            System.out.println("La inscripción no se puede realizar fuera de fecha.");
            return; // Puedes lanzar una excepción si lo prefieres
        }

        // Verificar si el aula tiene capacidad para el alumno
        if (!curso.tieneCapacidadDisponible()) {
            System.out.println("El aula no tiene capacidad para el alumno.");
            return; // Puedes lanzar una excepción si lo prefieres
        }

        // Verificar si el alumno está inscrito a otro curso para el mismo día y turno
        if (alumno.estaInscritoEnOtroCursoParaElMismoDiaYTurno(curso)) {
            System.out.println("El alumno ya está inscrito en otro curso para el mismo día y turno.");
            return; // Puedes lanzar una excepción si lo prefieres
        }

        // Realizar la inscripción
        curso.inscribirAlumno(alumno);
        System.out.println("El alumno ha sido inscrito en el curso correctamente.");
    }

    // Buscar alumno por dni

    private Alumno buscarAlumnoPorDNI(int dni) {
        for (Alumno alumno : alumnos) {
            if (alumno.getDni() == dni) {
                return alumno;
            }
        }
        return null;
    }

    //Buscar curso por id
    private Curso buscarCursoPorCodigo(int codigoCurso) {
        for (Curso curso : Cursoes) {
            if (curso.getId() == codigoCurso) {
                return curso;
            }
        }
        return null;
    }

}
