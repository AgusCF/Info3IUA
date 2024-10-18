package Utilitis.RaB;

import Utilitis.AVL.Node;

public class ArbolRyB<T extends Comparable<T>> {
    private NodeRyB<T> root;

    public NodeRyB<T> insert(NodeRyB<T> rama, T element) {
        // Inserta normalmente en un BST
        if (rama == null) {
            return new NodeRyB<>(element);
        }

        if (element.compareTo(rama.getElement()) < 0) {
            rama.setLeft(insert(rama.getLeft(), element));
        } else if (element.compareTo(rama.getElement()) > 0) {
            rama.setRight(insert(rama.getRight(), element));
        } else {
            return rama; // No permite duplicados
        }

        // Realiza las correcciones de árbol rojo-negro
        if (isRed(rama.getRight()) && !isRed(rama.getLeft())) {
            rama = rotateLeft(rama);
        }
        if (isRed(rama.getLeft()) && isRed(rama.getLeft().getLeft())) {
            rama = rotateRight(rama);
        }
        if (isRed(rama.getLeft()) && isRed(rama.getRight())) {
            flipColors(rama);
        }

        return rama;
    }

    private boolean isRed(NodeRyB<T> node) {
        if (node == null)
            return false;
        return node.getcolor(); // true = rojo
    }

    private NodeRyB<T> rotateLeft(NodeRyB<T> node) {
        NodeRyB<T> newRoot = node.getRight();
        node.setRight(newRoot.getLeft());
        newRoot.setLeft(node);
        newRoot.setColorBlack(); // La nueva raíz es negra
        node.setColorRed(); // El nodo original se vuelve rojo
        return newRoot;
    }

    private NodeRyB<T> rotateRight(NodeRyB<T> node) {
        NodeRyB<T> newRoot = node.getLeft();
        node.setLeft(newRoot.getRight());
        newRoot.setRight(node);
        newRoot.setColorBlack(); // La nueva raíz es negra
        node.setColorRed(); // El nodo original se vuelve rojo
        return newRoot;
    }

    private void flipColors(NodeRyB<T> node) {
        node.setColorBlack();
        node.getLeft().setColorRed();
        node.getRight().setColorRed();
    }

    public void insert(T element) {
        root = insert(root, element);
        if (root != null) {
            root.setColorBlack(); // Asegura que la raíz sea negra
        }
    }

    public void imprimirArbolConRamas(NodeRyB<T> nodo, String prefix, boolean esHijoDerecho) {
        if (nodo != null) {
            // Llamada recursiva al subárbol derecho
            imprimirArbolConRamas(nodo.getRight(), prefix + (esHijoDerecho ? "       " : "│      "), true);

            // Imprimir el nodo actual con su color
            if (nodo.getcolor() == true) {
                System.out.println(prefix + (esHijoDerecho ? "┌───" : "└───") + "\033[31m(\033[0m" + nodo.getElement()
                        + "\033[31m)\033[0m");
            } else {
                System.out.println(prefix + (esHijoDerecho ? "┌───" : "└───") + "(" + nodo.getElement() + ")");
            }

            // Llamada recursiva al subárbol izquierdo
            imprimirArbolConRamas(nodo.getLeft(), prefix + (esHijoDerecho ? "│      " : "       "), false);
        }
    }

}
