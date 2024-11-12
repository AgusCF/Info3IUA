// MenuColaYPila.java
package Utilitis.PilaYCola.PilaYColaArray;

import Utilitis.PilaYCola.*;

import java.util.Scanner;

public class menuColaYPila<T extends Comparable<T>> {
    private static final int TAM = 20; // Tamaño máximo de la cola y pila
    private NodeDato<Integer>[] arrays = (NodeDato<Integer>[]) new NodeDato[TAM]; // Arreglo para almacenar los datos
    private int cantidad = 0; // Contador de elementos almacenados
    private Scanner entrada = new Scanner(System.in); // Scanner para entrada de usuario
    private Cola<Integer> cola = new Cola<>(TAM); // Cola de enteros
    private Pila<Integer> pila = new Pila<>(TAM); // Pila de enteros
    private int seleccion = 0; // Variable para la selección del menú

    /**
     * Método para gestionar el menú de opciones de la cola.
     * Permite agregar, remover, ver y ordenar elementos en la cola.
     */
    public void menuCola() {
        do {
            System.out.println("******** MENU COLA (Arrays)********");
            System.out.println("""
                    1- Agregar un dato a la Cola
                    2- Remover el dato al frente de la Cola
                    3- Ver el dato al frente de la Cola sin removerlo
                    4- Ordenar arrays
                    0- Salir""");
            System.out.print("Elección: ");
            seleccion = entrada.nextInt();
            entrada.nextLine(); // Consumir nueva línea

            switch (seleccion) {
                case 1:
                    // Agregar un nuevo dato a la cola
                    if (cantidad < TAM) {
                        System.out.print("Dato a guardar: ");
                        int dato = entrada.nextInt();
                        cola.enqueue(dato);
                        arrays[cantidad++] = new NodeDato<>(dato);
                    } else {
                        System.out.println("La cola está llena.");
                    }
                    break;
                case 2:
                    // Remover y mostrar el dato al frente de la cola
                    NodeDato<Integer> datoEliminado = cola.dequeue();
                    if (datoEliminado != null) {
                        System.out.println("El dato eliminado es: " + datoEliminado.getDato());
                        pila.push(datoEliminado); // Guardar el dato eliminado en la pila
                    }
                    break;
                case 3:
                    // Mostrar el dato al frente de la cola sin removerlo
                    NodeDato<Integer> datoFrente = cola.top();
                    if (datoFrente != null) {
                        System.out.println("El dato al frente es: " + datoFrente.getDato());
                    }
                    break;
                case 4:
                    // Ordenar el arreglo utilizando QuickSort
                    QuicksortGenerico<Integer> quicksortGenerico = new QuicksortGenerico<>();
                    quicksortGenerico.quickSort(arrays, 0, cantidad - 1);
                    System.out.println("Arrays ordenados.");
                    break;
                case 0:
                    // Salir del menú
                    System.out.println("Saliendo del menú de Cola...");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (seleccion != 0); // Continuar mientras no elija salir
    }

    /**
     * Método para gestionar el menú de opciones de la pila.
     * Permite agregar, remover, ver y ordenar elementos en la pila.
     */
    public void menuPila() {
        QuicksortGenerico<Integer> quicksortGenerico = new QuicksortGenerico<>();
        do {
            System.out.println("******** MENU PILA (Arrays) ********");
            System.out.println("""
                    1- Agregar un dato a la Pila
                    2- Remover el último dato de la Pila
                    3- Ver el último dato completado sin removerlo
                    4- Ordenar arrays
                    0- Salir""");
            System.out.print("Elección: ");
            seleccion = entrada.nextInt();
            entrada.nextLine(); // Consumir nueva línea

            switch (seleccion) {
                case 1:
                    // Agregar un nuevo dato a la pila
                    if (cantidad < TAM) {
                        System.out.print("Dato a guardar: ");
                        int dato = entrada.nextInt();
                        NodeDato<Integer> nuevoDato = new NodeDato<>(dato);
                        pila.push(nuevoDato);
                        arrays[cantidad++] = nuevoDato;
                    } else {
                        System.out.println("La pila está llena.");
                    }
                    break;
                case 2:
                    // Remover y mostrar el último dato de la pila
                    NodeDato<Integer> datoCompletado = pila.pop();
                    if (datoCompletado != null) {
                        System.out.println("Dato completado: " + datoCompletado.getDato());
                    }
                    break;
                case 3:
                    // Mostrar el último dato de la pila sin removerlo
                    NodeDato<Integer> ultimoDato = pila.topStack();
                    if (ultimoDato != null) {
                        System.out.println("Último dato completado: " + ultimoDato.getDato());
                    }
                    break;
                case 4:
                    // Ordenar el arreglo utilizando QuickSort
                    quicksortGenerico.quickSort(arrays, 0, cantidad - 1);
                    System.out.println("Arrays ordenados.");
                    break;
                case 0:
                    // Salir del menú
                    System.out.println("Saliendo del menú de Pila...");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (seleccion != 0); // Continuar mientras no elija salir
    }
}
