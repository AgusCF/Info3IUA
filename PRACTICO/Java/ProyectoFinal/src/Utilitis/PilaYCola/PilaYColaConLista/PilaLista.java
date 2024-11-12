package Utilitis.PilaYCola.PilaYColaConLista;

import Utilitis.PilaYCola.PilaYColaConLista.*;

public class PilaLista {

    private Node<Node> topOFStak;
    private int canDenode = 0;

    public void push(Node newPedido) {
        if (isEmpty()) {
            Node newNode = new Node<Node>(newPedido);
            topOFStak = newNode;
            canDenode++;
        } else {
            Node newNode = new Node<Node>(newPedido);
            newNode.setNext(topOFStak);
            topOFStak = newNode;
            canDenode++;
        }
    }

    public Node pop() {
        if (isEmpty()) {
            return null;
        } else {
            topOFStak = topOFStak.getNext();
            canDenode--;
            return topOFStak.getData();
        }
    }

    public Node top() {
        if (isEmpty()) {
            return null;
        } else {
            return topOFStak.getData();
        }
    }

    public boolean isEmpty() {
        return topOFStak == null;
    }

    public int size() {
        return canDenode + 1;
    }

    public void makeEmpty() {
        topOFStak.setData(null);
        topOFStak.setNext(null);
    }

}
