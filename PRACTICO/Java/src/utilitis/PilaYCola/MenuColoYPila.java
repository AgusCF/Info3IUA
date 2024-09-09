package utilitis.PilaYCola;

import java.util.Scanner;
import utilitis.Ordenamiento.Pedido;

public class MenuColoYPila {
    int tam = 20;
    Pedido[] pedidos = new Pedido[tam];
    int cantidadPedidos = 0; // Para llevar la cuenta de los pedidos en el arreglo

    // Declaramos un objeto Scanner para la entrada del usuario
    Scanner entrada = new Scanner(System.in);

    // Creamos una instancia de la clase Cola
    Cola cola = new Cola();
    Pila pila = new Pila();

    // Variable para almacenar la selección del menú
    int selecion = 0;

    // Método para mostrar y gestionar el menú de operaciones con la Cola
    public void menuCola() {
        QuicksortGenerico quicksortGenerico = new QuicksortGenerico();
        do {
            // Menú de opciones para la Cola
            System.out.println("******** MENU ********");
            System.out.println("""
                    1-Agregar un pedido a la Cola:
                    2-Remover el pedido al frente de la Cola.
                    3-Ver el pedido al frente de la Cola sin removerlo.
                    4-Ordenar pedidos.
                    5-Exit.""");
            System.out.print("\nEleccion: ");

            // Leer la opción seleccionada por el usuario
            selecion = entrada.nextInt();

            // Seleccionamos la acción a realizar según la elección
            switch (selecion) {
                case 1:
                    // Agregar un pedido a la cola
                    if (cantidadPedidos < tam) {// Deberías permitir al usuario ingresar los detalles del pedido
                        cola.enqueue(pedidos);
                        cantidadPedidos++;
                    } else {
                        System.out.println("La cola está llena.");
                    }
                    break;
                case 2:
                    // Remover el pedido al frente de la cola
                    Pedido pedidoEliminado = cola.dequeue(pedidos);
                    if (pedidoEliminado != null) {
                        System.out.println("El pedido eliminado es: " + pedidoEliminado);
                        pila.push(pedidoEliminado); // Cargar el pedido eliminado en la pila
                    }
                    break;
                case 3:
                    // Ver el pedido al frente de la cola sin removerlo
                    Pedido pedidoFrente = cola.top(pedidos);
                    if (pedidoFrente != null) {
                        System.out.println("El pedido al frente es: " + pedidoFrente);
                    }
                    break;
                case 4:
                    // Ordenar pedidos usando QuickSort
                    quicksortGenerico.quickSort(pedidos, 0, cantidadPedidos - 1);
                    break;
                default:
                    break;
            }

            // El ciclo se repite hasta que el usuario elija salir (opción 5)
        } while (selecion != 5);
    }

    // Método para mostrar y gestionar el menú de operaciones con la Pila
    public void menuPila() {
        do {
            // Menú de opciones para la Pila
            System.out.println("******** MENU ********");
            System.out.println("""
                    1-Agregar un pedido a la Pila:
                    2-Remover el último pedido de la Pila.
                    3-Ver el último pedido completado sin removerlo.
                    4-Ordenar por nombre del cliente.
                    5-Exit.""");
            System.out.print("\nEleccion: ");

            // Leer la opción seleccionada por el usuario
            selecion = entrada.nextInt();

            // Seleccionamos la acción a realizar según la elección
            switch (selecion) {
                case 1:
                    // Agregar un pedido a la pila
                    if (cantidadPedidos < tam) {
                        Pedido pedido = new Pedido(); // Deberías permitir al usuario ingresar los detalles del pedido
                        pila.push(pedido);
                        pedidos[cantidadPedidos++] = pedido;
                    } else {
                        System.out.println("La pila está llena.");
                    }
                    break;
                case 2:
                    // Remover el último pedido de la pila
                    break;
                case 3:
                    // Ver el último pedido completado sin removerlo

                    break;
                case 4:
                    // Ordenar por nombre del cliente
                    QuicksortGenerico quicksortGenerico = new QuicksortGenerico();
                    quicksortGenerico.quickSort(pedidos, 0, cantidadPedidos - 1);
                    break;
                default:
                    break;
            }

            // El ciclo se repite hasta que el usuario elija salir (opción 5)
        } while (selecion != 5);
    }
}
