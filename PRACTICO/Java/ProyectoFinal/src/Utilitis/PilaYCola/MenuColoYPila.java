package Utilitis.PilaYCola;

import java.util.Scanner;
import utilitis.Ordenamiento.Pedido;

public class MenuColoYPila {
    private static final int TAM = 20;
    private NodeArray<Pedido>[] pedidos = new NodeArray[TAM];
    private int cantidadPedidos = 0;

    private Scanner entrada = new Scanner(System.in);

    // Creamos instancias de Cola y Pila para manejar objetos Pedido
    private Cola<NodeArray<Pedido>> cola = new Cola<>();
    private Pila<NodeArray<Pedido>> pila = new Pila<>();

    // Variable para almacenar la selección del menú
    private int seleccion = 0;

    // Método para mostrar y gestionar el menú de operaciones con la Cola
    public void menuCola() {
        do {
            // Menú de opciones para la Cola
            System.out.println("******** MENU ********");
            System.out.println("""
                    1- Agregar un pedido a la Cola
                    2- Remover el pedido al frente de la Cola
                    3- Ver el pedido al frente de la Cola sin removerlo
                    4- Ordenar pedidos
                    5- Salir""");
            System.out.print("Elección: ");

            seleccion = entrada.nextInt();
            entrada.nextLine(); // Limpiar buffer

            switch (seleccion) {
                case 1:
                    if (cantidadPedidos < TAM) {
                        System.out.print("Nombre del Cliente: ");
                        String nombreCliente = entrada.nextLine();

                        Pedido nuevoPedido = new Pedido();
                        NodeArray<Pedido> nodoPedido = new NodeArray<>(nuevoPedido);

                        cola.enqueue(pedidos, nodoPedido);
                        cantidadPedidos++;
                    } else {
                        System.out.println("La cola está llena.");
                    }
                    break;
                case 2:
                    NodeArray<Pedido> pedidoEliminado = cola.dequeue(pedidos);
                    if (pedidoEliminado != null) {
                        System.out.println("El pedido eliminado es: " + pedidoEliminado.getDato());
                        pila.push(pedidoEliminado);
                    }
                    break;
                case 3:
                    NodeArray<Pedido> pedidoFrente = cola.top(pedidos);
                    if (pedidoFrente != null) {
                        System.out.println("El pedido al frente es: " + pedidoFrente.getDato());
                    }
                    break;
                case 4:
                    QuicksortGenerico<Pedido> quicksortGenerico = new QuicksortGenerico<>();
                    quicksortGenerico.quickSort(pedidos, 0, cantidadPedidos - 1);
                    System.out.println("Pedidos ordenados.");
                    break;
                case 5:
                    System.out.println("Saliendo del menú de Cola...");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (seleccion != 5);
    }

    // Método para mostrar y gestionar el menú de operaciones con la Pila
    public void menuPila() {
        QuicksortGenerico<Pedido> quicksortGenerico = new QuicksortGenerico<>();
        do {
            System.out.println("******** MENU ********");
            System.out.println("""
                    1- Agregar un pedido a la Pila
                    2- Remover el último pedido de la Pila
                    3- Ver el último pedido completado sin removerlo
                    4- Ordenar por nombre del cliente
                    5- Salir""");
            System.out.print("Elección: ");

            seleccion = entrada.nextInt();
            entrada.nextLine(); // Limpiar buffer

            switch (seleccion) {
                case 1:
                    if (cantidadPedidos < TAM) {
                        System.out.print("Nombre del Cliente: ");
                        String nombreCliente = entrada.nextLine();
                        System.out.print("Tiempo de Preparación: ");
                        int tiempo = entrada.nextInt();
                        System.out.print("Número de Pedido: ");
                        int numeroPedido = entrada.nextInt();
                        System.out.print("Precio: ");
                        float precio = entrada.nextFloat();
                        entrada.nextLine(); // Limpiar buffer

                        Pedido nuevoPedido = new Pedido(tiempo, nombreCliente, numeroPedido, precio);
                        NodeArray<Pedido> nodoPedido = new NodeArray<>(nuevoPedido);

                        pila.push(nodoPedido);
                        pedidos[cantidadPedidos++] = nodoPedido;
                    } else {
                        System.out.println("La pila está llena.");
                    }
                    break;
                case 2:
                    pila.pop();
                    System.out.println("El último pedido ha sido eliminado de la pila.");
                    break;
                case 3:
                    pila.topStak();
                    break;
                case 4:
                    quicksortGenerico.quickSort(pedidos, 0, cantidadPedidos - 1);
                    System.out.println("Pedidos ordenados.");
                    break;
                case 5:
                    System.out.println("Saliendo del menú de Pila...");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (seleccion != 5);
    }
}
