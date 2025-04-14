import java.time.LocalDateTime;

public class Multa {
    private LocalDateTime fechaHora;
    private double velocidad;
    private double importe;
    private boolean pagado;
    private Coche coche;

    public Multa(LocalDateTime fechaHora, double velocidad, double importe, boolean pagado) {
        this.fechaHora = fechaHora;
        this.velocidad = velocidad;
        this.importe = importe;
        this.pagado = pagado;
    }

    public double calcularImporte(){
        return velocidad * importe;
    }
    public void setPagado(boolean pagado){
        this.pagado = pagado;
    }

}
