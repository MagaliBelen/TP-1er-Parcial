
public class Nota {
    private EnumNotas tipoDeNota;
    private Double clasificacion;
    private Materia materia;
    
    public EnumNotas getTipoDeNota() {
        return tipoDeNota;
    }
    public void setTipoDeNota(EnumNotas tipoDeNota) {
        this.tipoDeNota = tipoDeNota;
    }
    public Double getClasificacion() {
        return clasificacion;
    }
    public void setClasificacion(Double clasificacion) {
        this.clasificacion = clasificacion;
    }
    public Materia getMateria() {
        return materia;
    }
    public void setMateria(Materia materia) {
        this.materia = materia;
    }
    public Nota(EnumNotas tipoDeNota, Double clasificacion, Materia materia) {
        this.tipoDeNota = tipoDeNota;
        this.clasificacion = clasificacion;
        this.materia = materia;
    }


    
}
