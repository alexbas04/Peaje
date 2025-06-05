import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Camara {
    private boolean estado;

    public Camara() {
        this.estado = true;
    }

    public boolean detectarSalidaCoche(Scanner in, ArrayList<Vehiculo> listaCoches) {
        int hora;
        int minuto;
        int segundo;
        float tamanyo;
        Vehiculo cocheEncontrado = null;

        System.out.println("Introduce la matricula de uno de los coches que se encuentra en el peaje: ");
        String matricula = in.nextLine();
        for (Vehiculo coche : listaCoches) {
            if (coche.getMatricula().equals(matricula.toLowerCase())) { // Comparamos ignorando mayúsculas/minúsculas
                System.out.println("Introduce la hora de salida");
                hora = in.nextInt();
                System.out.println("Introduce el minutos de salida");
                minuto = in.nextInt();
                System.out.println("Introduce el segundos de salida");
                segundo = in.nextInt();
                System.out.println("Introduce el tamaño del vehiculo");
                tamanyo = in.nextFloat();
                in.nextLine();

                LocalTime tiempoDeSalida = LocalTime.of(hora, minuto, segundo);
                coche.setTamanyo(tamanyo);
                coche.setHoraDeSalida(tiempoDeSalida);
                cocheEncontrado = coche;
            }
        }
        if (cocheEncontrado != null) {
            comprobarMulta(cocheEncontrado);
        }

        return false;
    }

    private Multa comprobarMulta(Vehiculo coche) {
        LocalTime horaDeEntrada = coche.getFechaEntrada().toLocalTime();
        LocalTime horaDeSalida = coche.getHoraSalida();
        int horaEntrada = horaDeEntrada.getHour();
        int minutoEntrada = horaDeEntrada.getMinute();
        int segundoEntrada = horaDeEntrada.getSecond();
        int horaSalida = horaDeSalida.getHour();
        int minutoSalida = horaDeSalida.getMinute();
        int segundoSalida = horaDeSalida.getSecond();
        int diferencia = 0;
        diferencia = ((horaSalida - horaEntrada) * 3600) + ((minutoSalida - minutoEntrada) * 60) + segundoSalida - segundoEntrada;
        int velocidad = (100 / diferencia) * 3600;
        if(velocidad > 120){
            Multa multa = new Multa(coche, coche.getFechaEntrada(), velocidad);
            multa.toString();
        }
        return null;
    }
}