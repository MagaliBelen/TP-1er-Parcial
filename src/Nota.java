
public class Nota {
    private EnumNotas tipoDeNota;
    private Double clasificacion;
    
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
    
    public Nota(EnumNotas tipoDeNota, Double clasificacion) {
        this.tipoDeNota = tipoDeNota;
        this.clasificacion = clasificacion;
        
    }


    
}
