//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static Scanner in = new Scanner(System.in);
    static ArrayList <Vehiculo> listaEntrada = new ArrayList <Vehiculo>();
    static CamaraTramo camaraTramo = new CamaraTramo(true);
    static Camara camaraCarril;
    static  Camara camaraCarril1;
    static Camara camaraCarril2;
    static Camara camaraCarril3;
    static Camara camaraCarril4;




    public static void main(String[] args)
    {
        int opcion;
        do {
            System.out.println("SISTEMA DE PEAJE:");
            System.out.println("Selecciona tu rol:");
            System.out.println("1. Operario / Agente de la autoridad");
            System.out.println("2. Conductor");
            System.out.println("3. Salir");
            opcion = in.nextInt();
            switch (opcion){
                case 1:
                    menuOperario();
                    break;
                case 2:
                    menuConductor();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Has introducido un valor incorrecto, por favor asegurate de introducir el numero \n al lado de la opcion que quieres seleccionar");
            }
        }while(opcion != 3);

    }

    private static void menuConductor() {

        int opcion;
        do {
            System.out.println("MENU CONDUCTOR:");
            System.out.println("Selecciona una opcion:");
            System.out.println("1. Historial de multas");
            System.out.println("2. Multas pendientes");
            System.out.println("3. Pagar multas");
            System.out.println("4. Volver al menu principal");
            opcion = in.nextInt();
            switch (opcion){
                case 1:
                    // TODO
                    break;
                case 2:
                    // TODO
                    break;
                case 3:
                    // TODO
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Has introducido un valor incorrecto, por favor asegurate de introducir el numero \n al lado de la opcion que quieres seleccionar");
            }
        }while(opcion != 4);
    }

    private static void menuOperario() {
        int opcion;
        do {
            System.out.println("MENU OPERARIO:");
            System.out.println("Selecciona una opcion:");
            System.out.println("1. Registrar entrada de vehículo");
            System.out.println("2. Registrar salida de vehículo");
            System.out.println("3. Consultar multas");
            System.out.println("4. Generar ticket de peaje");
            System.out.println("5. Consultar historial de peajes de un vehículo");
            System.out.println("6. Volver al menu principal");
            opcion = in.nextInt();
            in.nextLine();
            switch (opcion){
                case 1:
                    registrarEntradaVehiculo();
                    break;
                case 2:
                    registrarSalidaVehiculo();
                    break;
                case 3:
                    // TODO
                    break;
                case 4:
                    // TODO
                    break;
                case 5:
                    // TODO
                    break;
                case 6:
                    // TODO
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Has introducido un valor incorrecto, por favor asegurate de introducir el numero \n al lado de la opcion que quieres seleccionar");
            }
        }while(opcion != 7);
    }

    private static void registrarEntradaVehiculo() {
        listaEntrada.add(camaraTramo.detectarCoche(in));

    }
    private static void registrarSalidaVehiculo() {
        if(camaraCarril.detectarSalidaCoche(in, listaEntrada)){

        }
    }

}