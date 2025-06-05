import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class Vehiculo {
    private LocalDateTime fechaDeEntrada;
    private LocalTime horaDeSalida;
    private String matricula;
    private double tamanyo;
    private ArrayList <Multa> multas;

    public Vehiculo(LocalDateTime fecha, String matricula) {
        this.fechaDeEntrada = fecha;
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getTamanyo() {
        return tamanyo;
    }

    public LocalDateTime getFechaEntrada(){ return fechaDeEntrada; }

    public LocalTime getHoraSalida(){ return horaDeSalida;}

    public void setTamanyo(double tamanyo) {
        this.tamanyo = tamanyo;
    }

    public void setHoraDeSalida(LocalTime horaDeSalida) {
        this.horaDeSalida = horaDeSalida;
    }

    public void setMultas(Multa multa) {
        multas.add(multa);
    }



}
