package Utilitis.PilaYCola.PilaYColaConLista;

import java.util.Scanner;
import Utilitis.PilaYCola.*;

public class menuPilaYColaListas {
    NodeDato NodeDatos = new NodeDato();
    ColaLista cola = new ColaLista();
    PilaLista pila = new PilaLista();

    Scanner entrada = new Scanner(System.in);
    int selecion;

    // Menú de Cola
    public void menuCola() {
        do {
            // Menú de opciones para la Cola
            System.out.println("******** MENU COLA CON LISTA********");
            System.out.println("""
                    1- Agregar un NodeDato a la Cola
                    2- Remover el NodeDato al frente de la Cola
                    3- Ver el NodeDato al frente de la Cola sin removerlo
                    0- Exit""");
            System.out.print("\nElección: ");
            // Leer la opción seleccionada por el usuario
            selecion = entrada.nextInt();
            // Seleccionamos la acción a realizar según la elección
            switch (selecion) {
                case 1:
                    cola.enqueue(); // Llamada al método enqueue para agregar un dato
                    break;
                case 2:
                    pila.push(cola.dequeue()); // Remover de la cola y agregar a la pila
                    break;
                case 3:
                    System.out.println(cola.getFont()); // Ver el dato al frente sin removerlo
                    break;
                case 0:
                    System.out.println("Saliendo del menú de Cola...");
                    break;
                default:
                    System.out.println("La opción ingresada no corresponde a ninguna operación.");
                    break;
            }
            // El ciclo se repite hasta que el usuario elija salir (opción 0)
        } while (selecion != 0);
    }

    // Menú de Pila
    public void menuPila() {
        do {
            // Menú de opciones para la Pila
            System.out.println("******** MENU Pila CON LISTA********");
            System.out.println("""
                    1- Agregar un NodeDato a la Pila
                    2- Remover el último NodeDato de la Pila
                    3- Ver el último NodeDato de la Pila sin removerlo
                    4- Vaciar la Pila
                    0- Exit""");
            System.out.print("\nElección: ");
            // Leer la opción seleccionada por el usuario
            selecion = entrada.nextInt();
            // Seleccionamos la acción a realizar según la elección
            switch (selecion) {
                case 1:
                    cola.enqueue(); // Llamada al método enqueue para agregar un dato a la cola
                    pila.push(cola.dequeue()); // Luego agregamos el dato a la pila
                    break;
                case 2:
                    NodeDato lastData = pila.pop(); // Remover el último dato de la pila
                    if (lastData != null) {
                        System.out.println("El dato removido es: " + lastData);
                    } else {
                        System.out.println("La pila está vacía.");
                    }
                    break;
                case 3:
                    NodeDato topData = pila.top(); // Ver el último dato sin removerlo
                    if (topData != null) {
                        System.out.println("El último dato es: " + topData);
                    } else {
                        System.out.println("La pila está vacía.");
                    }
                    break;
                case 4:
                    pila.makeEmpty(); // Vaciar la pila
                    System.out.println("La pila ha sido vaciada.");
                    break;
                case 0:
                    System.out.println("Saliendo del menú de Pila...");
                    break;
                default:
                    System.out.println("La opción ingresada no corresponde a ninguna operación.");
                    break;
            }
            // El ciclo se repite hasta que el usuario elija salir (opción 0)
        } while (selecion != 0);
    }
}
