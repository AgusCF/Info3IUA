package utilitis.PilaYCola;

import java.util.Stack;

import utilitis.Ordenamiento.CargDeFun;
import utilitis.Ordenamiento.Pedido;

public class Pila {
    private Pedido [] pila ;
    private int top;
    private int TAM=20;
    public Pila() {//Constructor
        pila = new Pedido[TAM];
        top = -1;
    }

    public void push(){
        if () {
            System.out.println("No se puede realizar el PUSH en la Pila porque esta vacia");
        } else {
        }
    }
    public void pop(){
        if (funcion.itsEmpty()) {
           System.out.println("No se puede realizar el POP en la Pila porque esta vacia");
        } else {
        }
    }
    public void top(){
        if (funcion.itsEmpty()) {
            System.out.println("No se puede mostrar el TOP en la Pila porque esta vacia");
        } else {
            //System.out.println(cola.toString());
        }
        
    }
    public void makeEmpty(){
        if (funcion.itsEmpty()) {
            System.out.println("No se puede 'MAKE  EMPTY' de la Pila porque esta vacia");
        } else {
            //System.out.println(cola.toString());
        }
    }
}
