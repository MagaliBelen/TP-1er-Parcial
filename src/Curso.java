
public class Curso {
	
	private Integer id;
	private Materia materia;
	private CicloLectivo cicloLectivo;
	private EnumTurno turno;
	
	
	public Curso(Integer id, Materia materia, CicloLectivo cicloLectivo, EnumTurno turno) {
		this.id = id;
		this.materia = materia;
		this.cicloLectivo = cicloLectivo;
		this.turno = turno;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
