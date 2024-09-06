package utilitis.PilaYCola;

import java.util.Scanner;

import utilitis.Ordenamiento.Pedido;

public class Cola {
    private int size = 0;
    private int back = -1, front = 0;
    private int idSum = 0;
    private int tam = 20;

    Pedido aux = null;
    Scanner entrada = new Scanner(System.in);
    private Pedido[] pedidos = new Pedido[tam];

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

        if (isFull()) {
            back = (back + 1) % tam;
            pedidos[back] = newPedido;
            size++;
        } else {
            System.out.println("La cola está llena.");
        }

    }

    public Pedido dequeue() {
        if (isEmpty()) {
            aux = pedidos[front];
            front = (front + 1) % 20;
            size--;
            return aux;
        } else {
            System.out.println("La cola está vacía.");
            return null;
        }
    }

    public Pedido top() {
        if (isEmpty()) {
            return pedidos[front];
        } else {
            System.out.println("La cola está vacía.");
            return null;
        }
    }

    public boolean isEmpty() {
        if (size >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size <= tam) {
            return true;
        } else {
            return false;
        }
    }
}
