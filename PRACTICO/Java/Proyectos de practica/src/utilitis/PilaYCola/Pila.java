package utilitis.PilaYCola;

import java.util.Stack;
import utilitis.Ordenamiento.Pedido;

public class Pila {
    private int TAM = 20;
    private Pedido[] pilaPedido = new Pedido[20];
    private int top = -1;

    public Pila() {
    }

    // Funciones de control-------------------------
    public boolean isEmpty(int top) {
        return (top == -1);
    }

    public boolean isFull(int top) {// Pregunte y me dijieron si
        return (top == (TAM - 1));
    }
    // Fin funciones de control---------------------

    public void push(Pedido cola) {
        if (isFull(top)) {
            System.out.println("No se puede realizar el PUSH en la Pila porque esta llena");
        } else {
            pilaPedido[++top] =cola; // Ver que onda el tema cola
        }

    }

    public void pop() {
        if (isEmpty(top)) {
            System.out.println("No se puede realizar el POP en la Pila porque esta vacia");
        } else {
            top--;
        }
    }

    public void topStak() {
        if (isEmpty(top)) {
            System.out.println("No se puede mostrar el TOP en la Pila porque esta vacia");
        } else {
            System.out.println("El ultimo pedido completado es: " + pilaPedido[top].getNombreCliente());
        }
    }

    public void makeEmpty() {
        top = -1;
    }

}
