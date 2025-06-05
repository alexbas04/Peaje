import java.time.LocalDateTime;

public class Multa {
    private LocalDateTime fechaHora;
    private double velocidad;
    private double importe;
    private boolean pagado;
    private Vehiculo coche;

    public Multa(Vehiculo coche, LocalDateTime fechaHora, double velocidad) {
        this.fechaHora = fechaHora;
        this.velocidad = velocidad;
        this.importe = calcularImporte(this.velocidad);
        this.pagado = false;

    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public double calcularImporte(double velocidad){
        if(velocidad > 120 && velocidad <= 130){
            return 150;
        }else if(velocidad > 130 && velocidad <= 140){
            return  300;
        }else if(velocidad > 140 && velocidad <= 150){
            return  700;
        }else{
            return  1500;
        }
    }
    public void setPagado(boolean pagado){
        this.pagado = pagado;
    }

    @Override
    public String toString() {
        return "Multa{" +
                "fechaHora=" + fechaHora +
                ", velocidad=" + velocidad +
                ", importe=" + importe +
                ", pagado=" + pagado +
                ", coche=" + coche +
                '}';
    }
}
