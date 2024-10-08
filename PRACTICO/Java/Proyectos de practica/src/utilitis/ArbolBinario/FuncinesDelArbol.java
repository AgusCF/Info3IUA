package utilitis.ArbolBinario;

import java.util.Random;

public class FuncinesDelArbol<T extends Comparable<T>> {
    // Scanner entrada = new Scanner(System.in);

    // Método para insertar un nuevo elemento en el árbol
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

    public BinNode<T> insert100(BinNode<T> rama) {
        Random aleatorio = new Random();

        // Insertar 100 números aleatorios en el árbol
        for (int i = 0; i < 100; i++) {
            int dato = aleatorio.nextInt(100); // Genera un número entre 0 y 99
            rama = insert(rama, (T) Integer.valueOf(dato)); // Aseguramos que el dato sea del tipo T
        }
        return rama; // Retorna la nueva raíz del árbol
    }

    private void printInOrder(BinNode<T> rama) {
        if (rama == null) {
            return; // Si el nodo es nulo, salimos de la función
        }

        printInOrder(rama.getLeft()); // Recorremos el subárbol izquierdo
        System.out.print(" " + rama.getElement()); // Imprimimos el valor del nodo actual
        printInOrder(rama.getRight()); // Recorremos el subárbol derecho
    }

    public void recorrerEnOrden(BinNode<T> rama) {
        printInOrder(rama); // Llama al método privado
        System.out.println(); // Nueva línea al final
    }

    private void printPostOrder(BinNode<T> rama) {
        if (rama == null) {
            return; // Si el nodo es nulo, salimos de la función
        }

        printPostOrder(rama.getLeft()); // Recorremos el subárbol izquierdo
        printPostOrder(rama.getRight()); // Recorremos el subárbol derecho
        System.out.print(" " + rama.getElement()); // Imprimimos el valor del nodo actual
    }

    public void recorrerEnDesorden(BinNode<T> rama) {
        printPostOrder(rama); // Llama al método privado
        System.out.println(); // Nueva línea al final
    }
}

/*
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
