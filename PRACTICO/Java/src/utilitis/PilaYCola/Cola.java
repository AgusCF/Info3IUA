package utilitis.PilaYCola;

import java.util.Scanner;

import utilitis.Ordenamiento.Pedido;

public class Cola {
    Scanner entrada = new Scanner(System.in);
    private Pedido[] pedidos = new Pedido[20];

    private int size = 0;
    private int back = -1, front = 0;
    private int idSum = 0;
    private int contador = 0;

    public void enqueue() {

        Pedido newPedido = new Pedido();
        System.out.println("Ingresa los datos a continuacion:");
        System.out.print("\nCliente (Nombre): ");
        if (idSum != 1) {
            entrada.nextLine();
        }
        newPedido.setNombreCliente(entrada.nextLine());

        System.out.print("\nIngresa el tiempo de preparacion(minutos): ");
        newPedido.setTiempo(entrada.nextInt());

        System.out.print("\nIngresa el precio: ");
        newPedido.setPrecio(entrada.nextFloat());

        newPedido.setPedido(idSum++);

        if (size < 20) {
            back = (back + 1) % 20;
            pedidos[back] = newPedido;
            size++;
        } else {
            System.out.println("La cola está llena.");
        }

    }

    public void dequeue() {
        if (size > 0) {
            front = (front + 1) % 20;
            size--;
        } else {
            System.out.println("La cola está vacía.");
        }
    }

    public void top() {
        if (size > 0) {
            System.out.println("El primer cliente en la cola es: " + pedidos[front].getNombreCliente());
        } else {
            System.out.println("La cola está vacía.");
        }
    }
}
