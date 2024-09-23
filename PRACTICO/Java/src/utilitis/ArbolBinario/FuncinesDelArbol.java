package utilitis.ArbolBinario;

import java.util.Scanner;

public class FuncinesDelArbol<T extends Comparable<T>> {
    // BinNode root = new BinNode();
    Scanner entrada = new Scanner(System.in);

    // Metodos-------------(Completarlos)
    // ~~~~(Los return estan para que no de error.. Pero retornan otra cosa)

    public BinNode<T> insert(BinNode<T> rama, T element) {
        // Si el árbol está vacío, crea un nuevo nodo con el elemento
        if (rama == null) {
            return new BinNode<>(element); // Devuelve el nuevo nodo
        }

        // Si el elemento es menor, lo insertamos en el subárbol izquierdo
        if (element.compareTo(rama.getElement()) < 0) {
            rama.setLeft(insert(rama.getLeft(), element));
        }
        // Si el elemento es mayor, lo insertamos en el subárbol derecho
        else if (element.compareTo(rama.getElement()) > 0) {
            rama.setRight(insert(rama.getRight(), element));
        }
        // Si es igual, no hacemos nada (se podría manejar duplicados aquí)
        else {
            System.out.println("Número repetido, ingrese otro.");
        }
        return rama; // Retorna la raíz actualizada del subárbol
    }

    public boolean isEmpty(BinNode rama) {
        return rama == null;
    }

    public int busqueda() {
        return (0);
    }

    public BinNode<T> mekeEmpty(BinNode<T> rama) {
        rama = null;
        return null;
    }

    /*
     * public void printInOrder() {// Desordenado(Como lo cargue)
     * if (left != null) {
     * left.printInOrder();
     * }
     * System.out.println(element);
     * if (right != null) {
     * right.printInOrder();
     * }
     * }
     * 
     * public void printPreOrder() {// Mayor amenor
     * System.out.println(element);// El nodo en el que estoy
     * if (left != null) {// El menor que el nodo en el que estoy
     * left.printPreOrder();
     * }
     * if (right != null) {// El mayor que el nodo en el que estoy
     * right.printPreOrder();
     * }
     * }
     * 
     * public void printPostOrder() {// Menor a mayor
     * if (left != null) {// El menor que el nodo en el que estoy
     * left.printPostOrder();
     * }
     * if (right != null) {// El mayor que el nodo en el que estoy
     * right.printPostOrder();
     * }
     * System.out.println(element);// El nodo en el que estoy
     * }
     * 
     * public static int size(BinNode t) {
     * if (t == null) {
     * return (0);
     * } else {
     * return 1 + size(t.left) + size(t.right);
     * }
     * }
     * 
     * public static int height(BinNode t) {
     * if (t == null) {
     * return (-1);
     * } else {
     * return 1 + Math.max(height(t.left), height(t.right));
     * }
     * }
     * 
     * public BinNode duplicate() {
     * BinNode root = new BinNode(element, null, null);
     * if (left != null) {
     * root.left = left.duplicate();
     * }
     * if (right != null) {
     * root.right = right.duplicate();
     * }
     * return (root);
     * }
     */
}
