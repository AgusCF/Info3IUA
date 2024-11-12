package Utilitis.PilaYCola.PilaYColaConLista;

import Utilitis.PilaYCola.NodeDato;

public class PilaLista {

    private Node<NodeDato> topOFStak;
    private int canDenode = 0;

    public void push(NodeDato newPedido) {
        if (isEmpty()) {
            Node newNode = new Node<NodeDato>(newPedido);
            topOFStak = newNode;
            canDenode++;
        } else {
            Node newNode = new Node<NodeDato>(newPedido);
            newNode.setNext(topOFStak);
            topOFStak = newNode;
            canDenode++;
        }
    }

    public NodeDato pop() {
        if (isEmpty()) {
            return null;
        } else {
            topOFStak = topOFStak.getNext();
            canDenode--;
            return topOFStak.getData();
        }
    }

    public NodeDato top() {
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
