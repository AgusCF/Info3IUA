package utilitis.PilaYColaConLista;
import java.util.Scanner;
import utilitis.Ordenamiento.Pedido;

public class ColaLista {
    /*
    private int size = 0;
    private int back = -1, front = 0;
    private int idSum = 0;*/
    private Node front;
    private Node back;
    Scanner entrada = new Scanner(System.in);
    public ColaLista(){
        front=back=null;
    }
    public void enqueue(Pedido pedidos) {
        if(isEmpty()){
            back=front=new Node<>(pedidos);
        }else{
            back=back.getNext()=new Node<>(pedidos);
        }
    }

    public Pedido dequeue(){
        if(isEmpty()){
            System.out.println("Cola vacia, no se puede eliminar nada");
        }
        Pedido deqValue = front.getData();
        return();
    }

    public Pedido getFont(Pedido pedidos){

        return(pedidos);
    }

    public boolean isEmpty(){
        return(front==null);
    }

    public void makeEmpty(){

    }
}
