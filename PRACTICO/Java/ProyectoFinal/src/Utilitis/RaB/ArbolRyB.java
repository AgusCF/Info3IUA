package Utilitis.RaB;

public class ArbolRyB<T extends Comparable<T>> {
    private NodeRyB<T> root;
    private static final boolean RED = true;
    private static final boolean BLACK = false;
    private int con = 0;

    public NodeRyB<T> insert(NodeRyB<T> rama, T element) {
        if (element == null) {
            throw new IllegalArgumentException("El elemento no puede ser nulo");
        }

        // Inserta el nuevo nodo como un nodo rojo
        if (rama == null) {
            return new NodeRyB<>(element, RED);
        }

        // Comparar e insertar recursivamente
        if (element.compareTo(rama.getElement()) < 0) {
            rama.setLeft(insert(rama.getLeft(), element));
        } else if (element.compareTo(rama.getElement()) > 0) {
            rama.setRight(insert(rama.getRight(), element));
        } else {
            return rama; // No permite duplicados
        }

        // Ajustes del árbol rojo-negro después de la inserción
        if (isRed(rama.getRight()) && !isRed(rama.getLeft())) {
            rama = rotateLeft(rama); // Corrige hijos rojos a la derecha
        }
        if (isRed(rama.getLeft()) && isRed(rama.getLeft().getLeft())) {
            rama = rotateRight(rama); // Corrige dos hijos rojos consecutivos a la izquierda
        }
        if (isRed(rama.getLeft()) && isRed(rama.getRight())) {
            flipColors(rama); // Cambia colores si ambos hijos son rojos
        }

        return rama;
    }

    private boolean isRed(NodeRyB<T> node) {
        if (node == null)
            return BLACK; // Nodos nulos son negros por defecto
        return node.getColor() == RED; // Devuelve true si el nodo es rojo
    }

    private NodeRyB<T> rotateLeft(NodeRyB<T> node) {
        NodeRyB<T> newRoot = node.getRight();
        node.setRight(newRoot.getLeft());
        newRoot.setLeft(node);
        newRoot.setColor(node.getColor()); // Mantiene el color original del nodo
        node.setColorRed(); // El nodo original se vuelve rojo
        return newRoot;
    }

    private NodeRyB<T> rotateRight(NodeRyB<T> node) {
        NodeRyB<T> newRoot = node.getLeft();
        node.setLeft(newRoot.getRight());
        newRoot.setRight(node);
        newRoot.setColor(node.getColor()); // Mantiene el color original del nodo
        node.setColorRed(); // El nodo original se vuelve rojo
        return newRoot;
    }

    private void flipColors(NodeRyB<T> node) {
        if (con != 0) {
            node.setColorRed(); // El nodo padre se vuelve rojo
        }
        if (node.getLeft() != null)
            node.getLeft().setColorBlack(); // Los hijos se vuelven negros
        if (node.getRight() != null)
            node.getRight().setColorBlack();
    }

    // Método para imprimir el árbol (opcional)
    public void imprimirArbolConRamas(NodeRyB<T> nodo, String prefix, boolean esHijoDerecho) {
        if (nodo != null) {
            imprimirArbolConRamas(nodo.getRight(), prefix + (esHijoDerecho ? "       " : "│      "), true);

            if (nodo.getColor() == RED) {
                System.out.println(prefix + (esHijoDerecho ? "┌───" : "└───") + "\033[31m(\033[0m" + "\033[31m"
                        + nodo.getElement() + "\033[31m)\033[0m");
            } else {
                System.out.println(prefix + (esHijoDerecho ? "┌───" : "└───") + "(" + nodo.getElement() + ")");
            }

            imprimirArbolConRamas(nodo.getLeft(), prefix + (esHijoDerecho ? "│      " : "       "), false);
        }
    }
}
