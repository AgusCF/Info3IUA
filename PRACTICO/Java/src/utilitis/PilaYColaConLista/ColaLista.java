package utilitis.PilaYColaConLista;
import java.util.Scanner;
import utilitis.Ordenamiento.Pedido;

public class ColaLista {
    /*
    private int size = 0;
    private int back = -1, front = 0;
    private int idSum = 0;*/
    private ListNode front;
    private ListNode back;
    Scanner entrada = new Scanner(System.in);
    public ColaLista(){
        front=back;
    }
    public void enqueue(Pedido pedidos) {

    }

    public Pedido dequeue(Pedido pedidos){

        return(pedidos);
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
