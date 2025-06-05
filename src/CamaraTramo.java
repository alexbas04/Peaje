import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class CamaraTramo extends Camara {
    private boolean estado;
    private static final double DISTANCIA_TRAMO = 100;

    public CamaraTramo(boolean esEntrada){
        super();
        this.estado = esEntrada;
    }

    public Vehiculo detectarCoche(Scanner in) {
        String matricula;
        int horaNum;
        int minutos;
        int segundosNum; // <--- AÑADIDO para los segundos
        int anioNum;
        int mesNum;
        int diaNum;

        System.out.println("Introduce la matricula del vehículo");
        matricula = in.nextLine(); // Asumiendo que el buffer está limpio antes de esto

        System.out.println("Introduce el año de entrada del vehiculo");
        anioNum = in.nextInt();
        in.nextLine(); // Limpiar buffer

        System.out.println("Introduce el mes al que ha entrado el vehiculo");
        mesNum = in.nextInt();
        in.nextLine(); // Limpiar buffer

        System.out.println("Introduce el dia al que ha entrado el vehiculo");
        diaNum = in.nextInt();
        in.nextLine(); // Limpiar buffer

        System.out.println("Introduce la hora a la que ha entrado el vehiculo");
        horaNum = in.nextInt();
        in.nextLine(); // Limpiar buffer

        System.out.println("Introduce el minuto al que ha entrado el vehiculo");
        minutos = in.nextInt();
        in.nextLine(); // Limpiar buffer

        System.out.println("Introduce el segundo al que ha entrado el vehiculo"); // <--- AÑADIDO
        segundosNum = in.nextInt();                                            // <--- AÑADIDO
        in.nextLine(); // Limpiar buffer

        // Validar los datos de fecha y hora antes de crear los objetos
        // (Esto es una buena práctica, aunque no lo has pedido explícitamente lo añado como sugerencia)
        try {
            LocalDate dia = LocalDate.of(anioNum, mesNum, diaNum);
            LocalTime hora = LocalTime.of(horaNum, minutos, segundosNum); // <--- AÑADIDO segundosNum
            LocalDateTime fecha = LocalDateTime.of(dia, hora);

            //            System.out.println("Vehículo añadido correctamente.");
//            System.out.println("--- Lista de vehículos registrados en la entrada ---");
//            if (listaEntrada.isEmpty()) {
//                System.out.println("No hay vehículos registrados en la entrada.");
//            } else {
//                for (Vehiculo cocheTest: listaEntrada) { // <--- RECORRER Y PINTAR TODOS
//                    System.out.println(cocheTest.toString()); // Asegúrate que Vehiculo.toString() está bien implementado
//                }
//            }
            return new Vehiculo(fecha, matricula);
        } catch (java.time.DateTimeException e) {
            System.out.println("Error: Fecha u hora introducida no válida. " + e.getMessage());
            System.out.println("El vehículo no ha sido registrado. Por favor, inténtalo de nuevo.");
        }
        return null;
    }

}