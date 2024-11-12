package Utilitis.PilaYCola;

public class Pila<T extends Comparable<T>> {
    private int TAM = 20;
    private NodeArray<T>[] pilaNodeArrays;
    private int top = -1;

    // Constructor que inicializa el array de nodos
    @SuppressWarnings("unchecked")
    public Pila() {
        pilaNodeArrays = new NodeArray[TAM];
    }

    // Funciones de control-------------------------
    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == (TAM - 1));
    }
    // Fin funciones de control---------------------

    public void push(NodeArray<T> nodo) {
        if (isFull()) {
            System.out.println("No se puede realizar el PUSH en la Pila porque está llena");
        } else {
            pilaNodeArrays[++top] = nodo;
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("No se puede realizar el POP en la Pila porque está vacía");
        } else {
            top--;
        }
    }

    public void topStak() {
        if (isEmpty()) {
            System.out.println("No se puede mostrar el TOP en la Pila porque está vacía");
        } else {
            System.out.println("El último pedido completado es: " + pilaNodeArrays[top].getDato());
        }
    }

    public void makeEmpty() {
        top = -1;
    }
}
