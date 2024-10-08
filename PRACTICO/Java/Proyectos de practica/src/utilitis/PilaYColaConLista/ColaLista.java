package utilitis.PilaYColaConLista;
import java.util.Scanner;
import utilitis.Ordenamiento.Pedido;

public class ColaLista {
    private Node<Pedido> front;
    private Node<Pedido> back;
    Scanner entrada = new Scanner(System.in);
    public ColaLista(){
        front=back=null;
    }
    public void enqueue() {
        Pedido pedidos = new Pedido();
        CargarDatos car = new CargarDatos();
        car.cargarDatos(pedidos);
        if(isEmpty()){
            back=front=new Node<Pedido>(pedidos);
        }else{
            back.setNext(new Node<Pedido>(pedidos));
            back = back.getNext();
        }
    }

    public Pedido dequeue(){
        if(isEmpty()){
            System.out.println("Cola vacia, no se puede eliminar nada");
        }
        Pedido deqValue = front.getData();
        front=front.getNext();
        return(deqValue);
    }

    public Pedido getFont(){
        if(isEmpty()){
            System.out.println("No se puede devolver un elemento porque esta vacia");
        }
        return(front.getData());
    }

    public boolean isEmpty(){
        return(front==null);
    }

    public void makeEmpty(){
        front=back=null;
    }
}
