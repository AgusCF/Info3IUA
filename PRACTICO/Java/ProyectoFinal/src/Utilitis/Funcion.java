package Utilitis;

import java.util.Scanner;

public class Funcion {
    ArbolAVL<Integer> arbolAVL = new ArbolAVL<>();
    Node<Integer> raiz = null; // Nodo raíz inicial
    /*
    System.out.println("Árbol AVL:");//Imprime solo el arbol con numeros entre ()
    arbolAVL.imprimirArbol(raiz, 0); 
    */
    public Node<Integer> precargaAVL1(ArbolAVL<Integer> arbolAVL,Node<Integer> raiz) {
        // Insertar los valores en el árbol AVL
        raiz = arbolAVL.insert(raiz, 10);
        raiz = arbolAVL.insert(raiz, 100);
        raiz = arbolAVL.insert(raiz, 20);
        raiz = arbolAVL.insert(raiz, 80);
        raiz = arbolAVL.insert(raiz, 40);
        raiz = arbolAVL.insert(raiz, 70);

        System.out.println("Árbol AVL con ramas:");//Imprime con ramitas "┌───" y "└───"
        arbolAVL.imprimirArbolConRamas(raiz, "", false);
        return raiz;
    }
    public Node<Integer> precargaAVL2(ArbolAVL<Integer> arbolAVL,Node<Integer> raiz) {
        // Insertar los valores en el árbol AVL
        raiz = arbolAVL.insert(raiz, 5);
        raiz = arbolAVL.insert(raiz, 10);
        raiz = arbolAVL.insert(raiz, 20);
        raiz = arbolAVL.insert(raiz, 30);
        raiz = arbolAVL.insert(raiz, 40);
        raiz = arbolAVL.insert(raiz, 50);
        raiz = arbolAVL.insert(raiz, 60);
        
        System.out.println("Árbol AVL con ramas:");//Imprime con ramitas "┌───" y "└───"
        arbolAVL.imprimirArbolConRamas(raiz, "", false);
        return raiz;
    }
    public Node<Integer> cargarAMano(ArbolAVL<Integer> arbolAVL,Node<Integer> raiz){
        int dato = 0;
        int op=0;
        @SuppressWarnings("resource")
        Scanner entrda = new Scanner(System.in);
        while(op!=-1){
            System.out.print("\nIngrea el dato a gurdar: ");
            dato = entrda.nextInt();
            raiz = arbolAVL.insert(raiz, dato);
            System.out.println("Árbol AVL con ramas:");//Imprime con ramitas "┌───" y "└───"
            arbolAVL.imprimirArbolConRamas(raiz, "", false);
            System.out.println("Desea finalizar la carga? ingrese -1");
            System.out.print("Opcion= ");
            op= entrda.nextInt();
        }
        return raiz;
    }
}
