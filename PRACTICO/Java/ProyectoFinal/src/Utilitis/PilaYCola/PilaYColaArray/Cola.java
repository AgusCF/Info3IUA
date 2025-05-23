// Cola.java
package Utilitis.PilaYCola.PilaYColaArray;

import Utilitis.PilaYCola.*;

import java.util.Scanner;

public class Cola<T extends Comparable<T>> {
    private int size = 0;
    private int back = -1, front = 0;
    private NodeDato<T>[] nodeArray;
    private int capacity;

    // Constructor para inicializar la cola con una capacidad dada
    public Cola(int capacity) {
        this.capacity = capacity;
        // Inicialización de un arreglo de tipo NodeDato<T> de tamaño `capacity`
        this.nodeArray = (NodeDato<T>[]) new NodeDato[capacity];
    }

    public Cola() {

    }

    // Método para agregar un elemento al final de la cola
    public void enqueue(T dato) {
        if (isFull()) {
            System.out.println("La cola está llena.");
            return;
        }
        // Crear un nuevo nodo con el dato proporcionado
        NodeDato<T> newNodeArray = new NodeDato<>(dato);

        // Insertamos el nuevo nodo en la posición `back` de la cola
        back = (back + 1) % nodeArray.length;
        nodeArray[back] = newNodeArray;
        size++;
    }

    // Método para remover y devolver el elemento en el frente de la cola
    public NodeDato<T> dequeue() {
        if (isEmpty()) {
            System.out.println("La cola está vacía.");
            return null;
        }
        // Obtener y remover el elemento en el frente
        NodeDato<T> aux = nodeArray[front];
        front = (front + 1) % nodeArray.length;
        size--;
        return aux;
    }

    // Método para obtener el elemento en el frente sin removerlo
    public NodeDato<T> top() {
        if (isEmpty()) {
            System.out.println("La cola está vacía.");
            return null;
        }
        return nodeArray[front];
    }

    // Verifica si la cola está vacía
    public boolean isEmpty() {
        return size == 0;
    }

    // Verifica si la cola está llena
    public boolean isFull() {
        return size == nodeArray.length;
    }
}
