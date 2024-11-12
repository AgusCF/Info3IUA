package Menu;

import java.util.Scanner;

import Utilitis.Ordenamientos.FuncionesOrdenamiento;
import Utilitis.Ordenamientos.Insertion;
import Utilitis.Ordenamientos.Quicksort;
import Utilitis.Ordenamientos.Shellsort;

public class MenuOrdenamiento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1; // Inicializa con un valor por defecto
        Integer[] intArray = null;
        Double[] doubleArray = null;
        String[] stringArray = null;
        
        //FuncionesOrdenamiento funcionesOrdenamiento = new FuncionesOrdenamiento();
        // Creación de instancias de cada algoritmo
        Insertion<Integer> insertionSortInt = new Insertion<>();
        Insertion<Double> insertionSortDouble = new Insertion<>();
        Insertion<String> insertionSortString = new Insertion<>();

        Shellsort<Integer> shellSortInt = new Shellsort<>();
        Shellsort<Double> shellSortDouble = new Shellsort<>();
        Shellsort<String> shellSortString = new Shellsort<>();

        Quicksort<Integer> quickSortInt = new Quicksort<>();
        Quicksort<Double> quickSortDouble = new Quicksort<>();
        Quicksort<String> quickSortString = new Quicksort<>();
        
        //Cargar arrays aleatorios:
        System.out.println("Cargar arrays de manera random");
        System.out.print("Ingrese la longitud del array: ");
        int length = scanner.nextInt();
        intArray = FuncionesOrdenamiento.generateRandomIntArray(length);
        doubleArray = FuncionesOrdenamiento.generateRandomDoubleArray(length);
        stringArray = FuncionesOrdenamiento.generateRandomStringArray(length); // Método para generar cadenas aleatorias
        System.out.println("Arrays generados con longitud " + length);
        do {
            System.out.println("""
                    ##### Menú de Ordenamiento #####
                    1.  Randomizar array nuevamente
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
                    ----
                    11. Imprimir Arreglo de Enteros
                    12. Imprimir Arreglo de Double
                    13. Imprimir Arreglo de Cadena de caracteres
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
                    intArray = FuncionesOrdenamiento.generateRandomIntArray(intArray.length);
                    doubleArray = FuncionesOrdenamiento.generateRandomDoubleArray(doubleArray.length);
                    stringArray = FuncionesOrdenamiento.generateRandomStringArray(stringArray.length);
                    break;
                case 2:
                    System.out.println("Ordenando enteros con Insertion Sort:");
                    FuncionesOrdenamiento.measureSortingTime(intArray, insertionSortInt);
                    break;
                case 3:
                    System.out.println("Ordenando doubles con Insertion Sort:");
                    FuncionesOrdenamiento.measureSortingTime(doubleArray, insertionSortDouble);
                    break;
                case 4:
                    System.out.println("Ordenando cadenas de caracteres con Insertion Sort:");
                    FuncionesOrdenamiento.measureSortingTime(stringArray, insertionSortString);
                    break;
                case 5:
                    System.out.println("Ordenando enteros con Shellsort:");
                    FuncionesOrdenamiento.measureSortingTime(intArray, shellSortInt);
                    break;
                case 6:
                    System.out.println("Ordenando doubles con Shellsort:");
                    FuncionesOrdenamiento.measureSortingTime(doubleArray, shellSortDouble);
                    break;
                case 7:
                    System.out.println("Ordenando cadenas de caracteres con Shellsort:");
                    FuncionesOrdenamiento.measureSortingTime(stringArray, shellSortString);
                    break;
                case 8:
                    System.out.println("Ordenando enteros con Quicksort:");
                    FuncionesOrdenamiento.measureSortingTime(intArray, quickSortInt);
                    break;
                case 9:
                    System.out.println("Ordenando doubles con Quicksort:");
                    FuncionesOrdenamiento.measureSortingTime(doubleArray, quickSortDouble);
                    break;
                case 10:
                    System.out.println("Ordenando cadenas de caracteres con Quicksort:");
                    FuncionesOrdenamiento.measureSortingTime(stringArray, quickSortString);
                    break;
                case 11:
                    FuncionesOrdenamiento.printArray(intArray);
                    break;
                case 12:
                    FuncionesOrdenamiento.printArray(doubleArray);
                    break;
                case 13:
                    FuncionesOrdenamiento.printArray(stringArray);
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

        scanner.close();
    }

}
