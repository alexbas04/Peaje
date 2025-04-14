import java.time.LocalDateTime;

public class TicketPeaje {
    private LocalDateTime fechaHora;
    private double tarifa;
    public TicketPeaje(LocalDateTime fechaHora, double tarifa) {
        this.fechaHora = fechaHora;
        this.tarifa = tarifa;
    }

    public double calcularTarifa(){
        return tarifa;
    }

    @Override
    public String toString() {
        return "Fecha y hora: " + fechaHora + "\nTarifa: " + tarifa;
    }
}
