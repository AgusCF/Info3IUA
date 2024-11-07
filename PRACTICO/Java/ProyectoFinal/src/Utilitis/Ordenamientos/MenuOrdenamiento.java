package Utilitis.Ordenamientos;
import java.util.Scanner;

public class MenuOrdenamiento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1; // Inicializa con un valor por defecto

        do {
            System.out.println("""
                    ##### Menú de Ordenamiento #####
                    1.  Cargar array con numeros
                    ----
                    2.  Incercion Enteros
                    3.  Incercion Double
                    4.  Incercion Cadena de caracteres
                    ----
                    5.  Shellsort Enteros
                    6.  Shellsort Double
                    7.  Shellsort Cadena de caracteres
                    ----
                    8.  Quicksort Enteros
                    9.  Quicksort Double
                    10. Quicksort Cadena de caracteres
                    0. Salir 
                    """);
            System.out.print("Selecciona una opción: ");

            try {
                opcion = scanner.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Por favor, ingresa un número válido.");
                scanner.next(); // Limpia la entrada no válida
                continue; // Regresa al inicio del ciclo para solicitar la opción nuevamente
            }

            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                   break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
            System.out.println(); // Para un espacio entre las opciones
        } while (opcion != 0);
    }
}
