// Pila.java
package Utilitis.PilaYCola.PilaYColaArray;

import Utilitis.PilaYCola.*;

public class Pila<T extends Comparable<T>> {
    private int capacidad;
    private NodeDato<T>[] pilaNodeDatos;
    private int top = -1;

    // Constructor que inicializa la pila con un tamaño fijo
    @SuppressWarnings("unchecked")
    public Pila(int tamaño) {
        this.capacidad = tamaño;
        pilaNodeDatos = (NodeDato<T>[]) new NodeDato[tamaño];
    }

    // Verifica si la pila está vacía
    public boolean isEmpty() {
        return (top == -1);
    }

    // Verifica si la pila está llena
    public boolean isFull() {
        return (top == (capacidad - 1));
    }

    // Método para agregar un elemento en la cima de la pila
    public void push(NodeDato<T> nodo) {
        if (isFull()) {
            System.out.println("La pila está llena.");
        } else {
            pilaNodeDatos[++top] = nodo;
        }
    }

    // Método para remover y devolver el elemento en la cima de la pila
    public NodeDato<T> pop() {
        if (isEmpty()) {
            System.out.println("La pila está vacía.");
            return null;
        } else {
            return pilaNodeDatos[top--];
        }
    }

    // Método para obtener el elemento en la cima sin removerlo
    public NodeDato<T> topStack() {
        if (isEmpty()) {
            System.out.println("La pila está vacía.");
            return null;
        } else {
            return pilaNodeDatos[top];
        }
    }

    // Método para vaciar la pila
    public void makeEmpty() {
        top = -1;
    }
}
