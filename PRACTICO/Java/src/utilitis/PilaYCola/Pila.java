package utilitis.PilaYCola;

import java.util.Stack;

import utilitis.Ordenamiento.CargDeFun;
import utilitis.Ordenamiento.Pedido;

public class Pila {
    private int TAM=20;
    private Pedido [] pilaPedido = new Pedido[20] ;
    private int top=-1;
    //Funcion para saber si etsta vacio o no la PILA
    public boolean isEmpty(int top){
        return(top==-1);
    }

    public void push(Pedido[] cola){
        pilaPedido[++top] = cola[10];
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
        if (itEmpty(top)) {
            System.out.println("No se puede 'MAKE  EMPTY' de la Pila porque esta vacia");
        } else {
            //System.out.println(cola.toString());
        }
    }
    
}
