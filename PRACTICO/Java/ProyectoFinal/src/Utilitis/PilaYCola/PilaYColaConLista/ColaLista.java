package Utilitis.PilaYCola.PilaYColaConLista;

import java.util.Scanner;

import Utilitis.PilaYCola.NodeDato;

public class ColaLista {
    private Node<NodeDato> front;
    private Node<NodeDato> back;
    Scanner entrada = new Scanner(System.in);

    public ColaLista() {
        front = back = null;
    }

    public void enqueue() {
        NodeDato pedidos = new NodeDato();
        CargarDatos car = new CargarDatos();
        car.cargarDatos(pedidos);
        if (isEmpty()) {
            back = front = new Node<NodeDato>(pedidos);
        } else {
            back.setNext(new Node<NodeDato>(pedidos));
            back = back.getNext();
        }
    }

    public NodeDato dequeue() {
        if (isEmpty()) {
            System.out.println("Cola vacia, no se puede eliminar nada");
        }
        NodeDato deqValue = front.getData();
        front = front.getNext();
        return (deqValue);
    }

    public NodeDato getFont() {
        if (isEmpty()) {
            System.out.println("No se puede devolver un elemento porque esta vacia");
        }
        return (front.getData());
    }

    public boolean isEmpty() {
        return (front == null);
    }

    public void makeEmpty() {
        front = back = null;
    }
}
