package utilitis.PilaYCola;

import java.util.Scanner;

public class MenuColoYPila {
    // Declaramos un objeto Scanner para la entrada del usuario
    Scanner entrada = new Scanner(System.in);

    // Creamos una instancia de la clase Cola
    Cola cola = new Cola();

    // Variable para almacenar la selección del menú
    int selecion = 0;

    // Método para mostrar y gestionar el menú de operaciones con la Cola
    public void menuCola() {
        Pila pila = new Pila();
        Cola cola = new Cola();
        do {
            // Menú de opciones para la Cola
            System.out.println("******** MENU ********");
            System.out.println("""
                    1-Agregar un pedido a la Cola:
                    2-Remover el pedido al frente de la Cola.
                    3-Ver el pedido al frente de la Cola sin removerlo.
                    4-Exit.""");
            System.out.print("\nEleccion: ");

            // Leer la opción seleccionada por el usuario
            selecion = entrada.nextInt();

            // Seleccionamos la acción a realizar según la elección
            switch (selecion) {
                case 1:
                    // Agregar un pedido a la cola
                    cola.enqueue();
                    break;
                case 2:
                    // Remover el pedido al frente de la cola
                    System.out.println("El pedido eliminado es: " + cola.dequeue());

                    pila.push(cola.top());// Cargo el peido eliminado en la pila
                    cola.dequeue();// Luego elimino el pedido

                    break;
                case 3:
                    // Ver el pedido al frente de la cola sin removerlo
                    cola.top();
                    break;
                default:
                    break;
            }

            // El ciclo se repite hasta que el usuario elija salir (opción 4)
        } while (selecion != 4);
    }

    // Método para mostrar y gestionar el menú de operaciones con la Pila
    public void menuPila() {
        Pila pila = new Pila();
        Cola cola = new Cola();
        do {
            // Menú de opciones para la Pila
            System.out.println("******** MENU ********");
            System.out.println("""
                    1-Agregar un pedido a la Pila:
                    2-Remover el último pedido de la Pila.
                    3-Ver el último pedido completado sin removerlo.
                    4-Exit.""");
            System.out.print("\nEleccion: ");

            // Leer la opción seleccionada por el usuario
            selecion = entrada.nextInt();

            // Seleccionamos la acción a realizar según la elección
            switch (selecion) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    cola.top();
                    break;
                default:
                    break;
            }

            // El ciclo se repite hasta que el usuario elija salir (opción 4)
        } while (selecion != 4);
    }
}
