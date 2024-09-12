package utilitis.PilaYColaConLista;

import java.util.EmptyStackException;
import java.util.Scanner;
import utilitis.Ordenamiento.Pedido;

public class PilaLista {
    private int idSum = 1;
    Scanner entrada = new Scanner(System.in);
    private Node topOFStak;

    public void push(){
        if (isEmpty()) {
            Pedido newPedido = new  Pedido();
            cargarDatos(newPedido);
            Node newNode = new Node<>(newPedido);
            topOFStak = newNode;
        }
        else{
            Pedido newPedido = new  Pedido();
            cargarDatos(newPedido);
            Node newNode = new Node<>(newPedido);
            newNode.setNext(topOFStak);
            topOFStak = newNode;
        }

        
    }
    public void pop(){
        if (isEmpty()) {
        }
    }

    public boolean isEmpty(){
        return topOFStak == null;
    }

    public void cargarDatos(Pedido newPedido){
        System.out.println("Ingresa los datos a continuacion:");
        System.out.print("\nCliente (Nombre): ");
        if (idSum != 1) {
            entrada.nextLine();
        }
        newPedido.setNombreCliente(entrada.nextLine());

        System.out.print("\nIngresa el tiempo de preparacion(minutos): ");
        newPedido.setTiempo(entrada.nextInt());

        System.out.print("\nIngresa el precio: ");
        newPedido.setPrecio(entrada.nextFloat());

        newPedido.setPedido(idSum++);
    }
}
