package utilitis.PilaYCola;

import java.util.Scanner;
import utilitis.Ordenamiento.Pedido;

public class Cola {
    private int size = 0;
    private int back = -1, front = 0;
    private int idSum = 0;

    Scanner entrada = new Scanner(System.in);

    public void enqueue(Pedido[] pedidos) {
        if (isFull(pedidos)) {
            System.out.println("La cola está llena.");
            return;
        }

        Pedido newPedido = new Pedido();
        System.out.println("Ingresa los datos a continuación:");
        System.out.print("\nCliente (Nombre): ");

        if (size != 0) {
            entrada.nextLine();
        }

        newPedido.setNombreCliente(entrada.nextLine());

        System.out.print("\nIngresa el tiempo de preparación (minutos): ");
        newPedido.setTiempo(entrada.nextInt());

        System.out.print("\nIngresa el precio: ");
        newPedido.setPrecio(entrada.nextFloat());

        newPedido.setPedido(idSum++);

        back = (back + 1) % pedidos.length;
        pedidos[back] = newPedido;
        size++;
    }

    public Pedido dequeue(Pedido[] pedidos) {
        if (isEmpty()) {
            System.out.println("La cola está vacía.");
            return null;
        }

        Pedido aux = pedidos[front];
        front = (front + 1) % pedidos.length;
        size--;
        return aux;
    }

    public Pedido top(Pedido[] pedidos) {
        if (isEmpty()) {
            System.out.println("La cola está vacía.");
            return null;
        }
        return pedidos[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull(Pedido[] pedidos) {
        return size == pedidos.length;
    }
}
