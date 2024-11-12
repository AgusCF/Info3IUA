package Utilitis.PilaYCola;

import java.util.Scanner;

import Utilitis.PilaYCola.NodeArray;

public class Cola<T extends Comparable<T>> {
    private int size = 0;
    private int back = -1, front = 0;
    private int idSum = 0;

    private Scanner entrada = new Scanner(System.in);

    public void enqueue(NodeArray<T>[] node, T dato) {
        if (isFull(node)) {
            System.out.println("La cola está llena.");
            return;
        }

        // Crear un nuevo NodeArray con el tipo genérico T
        NodeArray<T> newNodeArray = new NodeArray<>(dato);

        // Insertamos el nuevo nodo en la posición `back` de la cola
        back = (back + 1) % node.length;
        node[back] = newNodeArray;
        size++;
    }

    public NodeArray<T> dequeue(NodeArray<T>[] node) {
        if (isEmpty()) {
            System.out.println("La cola está vacía.");
            return null;
        }

        // Obtener y remover el elemento del frente de la cola
        NodeArray<T> aux = node[front];
        front = (front + 1) % node.length;
        size--;
        return aux;
    }

    public NodeArray<T> top(NodeArray<T>[] node) {
        if (isEmpty()) {
            System.out.println("La cola está vacía.");
            return null;
        }
        return node[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull(NodeArray<T>[] node) {
        return size == node.length;
    }

    // Método de ayuda para leer un dato del tipo deseado
    public static <T> T leerDato(Scanner entrada, Class<T> tipo) {
        if (tipo == String.class) {
            return tipo.cast(entrada.nextLine());
        } else if (tipo == Integer.class) {
            return tipo.cast(entrada.nextInt());
        } else if (tipo == Float.class) {
            return tipo.cast(entrada.nextFloat());
        } else {
            throw new IllegalArgumentException("Tipo no soportado");
        }
    }
}
