import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

public class Universidad {
    private List<Materia> materias;
    private List<Alumno> alumnos;
    private List<CicloLectivo> ciclosLectivos;
    private List<Comision> comisiones;
    private List<Profesor> profesores;

    public Universidad() {
        this.materias = new ArrayList<>();
        this.alumnos = new ArrayList<>();
        this.ciclosLectivos = new ArrayList<>();
        this.comisiones = new ArrayList<>();
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
    public void AgregarAlumno(String nombre, String apellido, int id, LocalDate fechaNac, LocalDate fechaIngreso,
            int dni) {
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

    // Crear Comision
    public void CrearComision(int id, Materia materia, CicloLectivo cicloLectivo, EnumTurno turno) {
        // Validar que no exista otra Comisión con los mismos parámetros
        if (existeComisionConParametros(id, materia, cicloLectivo, turno)) {
            System.out.println("Ya existe una comisión con la misma materia, ciclo lectivo y turno");
            return;
        }

        // agregamos la Comision
        Comision nuevaComision = new Comision(id, materia, cicloLectivo, turno);
        comisiones.add(nuevaComision);
    }

    // validacion
    private boolean existeComisionConParametros(int id, Materia materia, CicloLectivo cicloLectivo, EnumTurno turno) {
        for (Comision Comision : comisiones) {
            if (Comision.getMateria().equals(materia) &&
                    Comision.getCicloLectivo().equals(cicloLectivo) &&
                    Comision.getTurno().equals(turno)) {
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
    public boolean eliminarCorrelativa(Materia m, int idMateriaEliminar) {
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
    // Verificar que el alumno y el Comision este dado de alta
    public boolean inscribirAlumnoAComision(int id, int codigoComision) {
        Alumno aluEncontrado = obtenerAlumno(id);
        if (aluEncontrado == null) {
           //No existe el alumno!
            return false;
        }
        Comision ComisionEncontrado = obtenerComision(codigoComision);
        if (ComisionEncontrado == null) {
            //No existe el Comision
            return false;
        }
        if(alumnos.tieneCorrelativasAprobadas()){
           //no tiene correlativas aprobadas
            return false;
        }

        if (!ComisionEncontrado.puedeInscribir(alumnos)) {
            //no se pudo inscribir
            return false;
        }
        if (ComisionEncontrado.excedeCapacidadAula()) {
            return false;
        }

        return true; //se inscribio el alumno
    }

    private Alumno obtenerAlumno(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    private Comision obtenerComision(int codigoComision) {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    
}
