package utilitis.PilaYColaConLista;

import utilitis.Ordenamiento.Pedido;

public class PilaLista {
    
    private Node<Pedido> topOFStak;
    private int canDenode = 0;

    public void push(Pedido newPedido){
        if (isEmpty()) {
            Node newNode = new Node<Pedido>(newPedido);
            topOFStak = newNode;
            canDenode++;
        }
        else{
            Node newNode = new Node<Pedido>(newPedido);
            newNode.setNext(topOFStak);
            topOFStak = newNode;
            canDenode++;
        }
    }

    public Pedido pop(){
        if (isEmpty()) {
            return null;
        }
        else{
        topOFStak=topOFStak.getNext();
        canDenode--;
        return topOFStak.getData();
        }
    }

    public Pedido top(){
        if (isEmpty()) {
            return null;
        }
        else{
        return topOFStak.getData();
        }
    }

    public boolean isEmpty(){
        return topOFStak == null;
    }
    public int size(){
        return canDenode + 1;
    }

    public void makeEmpty(){
        topOFStak.setData(null);
        topOFStak.setNext(null);
    }

}
