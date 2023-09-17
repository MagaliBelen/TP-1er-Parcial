
public class Comision {
	
	private int id;
	private Materia materia;
	private CicloLectivo cicloLectivo;
	private EnumTurno turno;
	private int capacidadAula;
	private int alumnosInscritos;
	
	
	public Comision(int id, Materia materia, CicloLectivo cicloLectivo, EnumTurno turno, int capacidadAula, int alumnosInscritos) {
		this.id = id;
		this.materia = materia;
		this.cicloLectivo = cicloLectivo;
		this.turno = turno;
		this.capacidadAula=capacidadAula;
		this.alumnosInscritos=alumnosInscritos;
	}
	
	public boolean puedeInscribir(Alumno alumno) {
        LocalDate fechaActual = LocalDate.now();

        if (fechaActual.isAfter(fechaInicioInscripcion) && fechaActual.isBefore(fechaFinalizacionInscripcion)) {
            return alumno.tieneCorrelativasAprobadas(List<String> correlativas);
        } else {
            return false;
        }
    }

	public boolean excedeCapacidadAula() {
		int capacidadAula = this.capacidadAula;
		int alumnosInscritos = this.alumnosInscritos;
		return alumnosInscritos >= capacidadAula;
	}
	


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Materia getMateria() {
		return materia;
	}
	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	public CicloLectivo getCicloLectivo() {
		return cicloLectivo;
	}
	public void setCicloLectivo(CicloLectivo cicloLectivo) {
		this.cicloLectivo = cicloLectivo;
	}
	public EnumTurno getTurno() {
		return turno;
	}
	public void setTurno(EnumTurno turno) {
		this.turno = turno;
	}

    public boolean estaDentroDelPeriodoDeInscripcion() {
        return false;
    }

    public boolean tieneCapacidadDisponible() {
        return false;
    }

    public void inscribirAlumno(Alumno alumno) {
    } 
}
