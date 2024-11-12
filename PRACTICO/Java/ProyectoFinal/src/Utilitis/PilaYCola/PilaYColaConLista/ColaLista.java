package Utilitis.PilaYCola.PilaYColaConLista;

import java.util.Scanner;
import Utilitis.PilaYCola.*;

public class ColaLista {
    private Node<Node> front;
    private Node<Node> back;
    Scanner entrada = new Scanner(System.in);

    public ColaLista() {
        front = back = null;
    }

    public void enqueue() {
        Node pedidos = new Node();
        CargarDatos car = new CargarDatos();
        car.cargarDatos(pedidos);
        if (isEmpty()) {
            back = front = new Node<Node>(pedidos);
        } else {
            back.setNext(new Node<Node>(pedidos));
            back = back.getNext();
        }
    }

    public Node dequeue() {
        if (isEmpty()) {
            System.out.println("Cola vacia, no se puede eliminar nada");
        }
        Node deqValue = front.getData();
        front = front.getNext();
        return (deqValue);
    }

    public Node getFont() {
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
