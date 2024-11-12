package Utilitis.AVL;

public class ArbolAVL<T extends Comparable<T>> {

    // Método para insertar un nuevo elemento en el árbol AVL
    public Node<T> insert(Node<T> rama, T element) {
        // Si el árbol está vacío, crea un nuevo nodo con el elemento
        if (rama == null) {
            return new Node<>(element); // Devuelve el nuevo nodo
        }

        // Comparar el elemento con el nodo actual para decidir la ubicación
        // Si el elemento es menor, se inserta en el subárbol izquierdo
        if (element.compareTo(rama.getElement()) < 0) {
            rama.setLeft(insert(rama.getLeft(), element));
        }
        // Si el elemento es mayor, se inserta en el subárbol derecho
        else if (element.compareTo(rama.getElement()) > 0) {
            rama.setRight(insert(rama.getRight(), element));
        } else {
            System.out.println("Número repetido, ingrese otro.");
            return rama; // No permite duplicados
        }

        // Actualiza la altura del nodo actual después de la inserción
        rama.setAltura(1 + Math.max(altura(rama.getLeft()), altura(rama.getRight())));

        // Calcula el factor de balanceo para verificar si el nodo está desbalanceado
        int factorBalanceo = calcularFactorBalanceo(rama);

        // Realiza las rotaciones correspondientes si el nodo está desbalanceado
        if (factorBalanceo < -1) {
            // Desbalanceado a la izquierda
            if (element.compareTo(rama.getLeft().getElement()) < 0) {
                return rotarDerecha(rama); // Rotación simple derecha
            } else {
                rama.setLeft(rotarIzquierda(rama.getLeft())); // Rotación izquierda-derecha
                return rotarDerecha(rama);
            }
        }

        if (factorBalanceo > 1) {
            // Desbalanceado a la derecha
            if (element.compareTo(rama.getRight().getElement()) > 0) {
                return rotarIzquierda(rama); // Rotación simple izquierda
            } else {
                rama.setRight(rotarDerecha(rama.getRight())); // Rotación derecha-izquierda
                return rotarIzquierda(rama);
            }
        }

        return rama; // Retorna la raíz actualizada del subárbol
    }

    // Método para calcular la altura de un nodo
    private int altura(Node<T> nodo) {
        if (nodo == null) {
            return -1; // Altura de un nodo vacío es -1
        }
        return nodo.getAltura(); // Retorna la altura del nodo actual
    }

    // Método para calcular el factor de balanceo de un nodo
    private int calcularFactorBalanceo(Node<T> nodo) {
        if (nodo == null) {
            return 0;
        }
        // Factor de balanceo = altura subárbol derecho - altura subárbol izquierdo
        return altura(nodo.getRight()) - altura(nodo.getLeft());
    }

    // Rotación simple a la derecha para balancear el árbol
    private Node<T> rotarDerecha(Node<T> rama) {
        Node<T> nuevaRaiz = rama.getLeft(); // Asigna el hijo izquierdo como nueva raíz
        rama.setLeft(nuevaRaiz.getRight()); // Actualiza el subárbol izquierdo del nodo actual
        nuevaRaiz.setRight(rama); // Ajusta el hijo derecho de la nueva raíz

        // Actualizamos alturas tras la rotación
        rama.setAltura(1 + Math.max(altura(rama.getLeft()), altura(rama.getRight())));
        nuevaRaiz.setAltura(1 + Math.max(altura(nuevaRaiz.getLeft()), altura(nuevaRaiz.getRight())));

        return nuevaRaiz; // Retorna la nueva raíz del subárbol rotado
    }

    // Rotación simple a la izquierda para balancear el árbol
    private Node<T> rotarIzquierda(Node<T> rama) {
        Node<T> nuevaRaiz = rama.getRight(); // Asigna el hijo derecho como nueva raíz
        rama.setRight(nuevaRaiz.getLeft()); // Actualiza el subárbol derecho del nodo actual
        nuevaRaiz.setLeft(rama); // Ajusta el hijo izquierdo de la nueva raíz

        // Actualizamos alturas tras la rotación
        rama.setAltura(1 + Math.max(altura(rama.getLeft()), altura(rama.getRight())));
        nuevaRaiz.setAltura(1 + Math.max(altura(nuevaRaiz.getLeft()), altura(nuevaRaiz.getRight())));

        return nuevaRaiz; // Retorna la nueva raíz del subárbol rotado
    }

    // Método para eliminar un nodo en el árbol AVL
    public Node<T> delete(Node<T> rama, T element) {
        // Si el árbol está vacío, no hay nada que eliminar
        if (rama == null) {
            return rama;
        }

        // Comparar el elemento para encontrar el nodo a eliminar
        if (element.compareTo(rama.getElement()) < 0) {
            rama.setLeft(delete(rama.getLeft(), element));
        } else if (element.compareTo(rama.getElement()) > 0) {
            rama.setRight(delete(rama.getRight(), element));
        } else {
            // Nodo encontrado; lo vamos a eliminar

            // Caso 1: Nodo con un solo hijo o sin hijos
            if (rama.getLeft() == null || rama.getRight() == null) {
                Node<T> temp = (rama.getLeft() != null) ? rama.getLeft() : rama.getRight();

                // Nodo sin hijos
                if (temp == null) {
                    rama = null;
                } else {
                    // Nodo con un solo hijo
                    rama = temp;
                }
            } else {
                // Caso 2: Nodo con dos hijos
                // Encuentra el sucesor en inorden (mínimo del subárbol derecho)
                Node<T> temp = minValueNode(rama.getRight());

                // Reemplaza el valor del nodo actual con el sucesor
                rama.setElement(temp.getElement());

                // Elimina el sucesor en el subárbol derecho
                rama.setRight(delete(rama.getRight(), temp.getElement()));
            }
        }

        // Si el árbol solo tenía un nodo y fue eliminado, retorna null
        if (rama == null) {
            return rama;
        }

        // Actualiza la altura después de la eliminación
        rama.setAltura(1 + Math.max(altura(rama.getLeft()), altura(rama.getRight())));

        // Calcula el factor de balanceo para verificar si el árbol está desbalanceado
        int factorBalanceo = calcularFactorBalanceo(rama);

        // Realiza las rotaciones correspondientes si el árbol está desbalanceado
        if (factorBalanceo < -1) {
            if (calcularFactorBalanceo(rama.getLeft()) <= 0) {
                return rotarDerecha(rama); // Rotación simple derecha
            } else {
                rama.setLeft(rotarIzquierda(rama.getLeft())); // Rotación izquierda-derecha
                return rotarDerecha(rama);
            }
        }

        if (factorBalanceo > 1) {
            if (calcularFactorBalanceo(rama.getRight()) >= 0) {
                return rotarIzquierda(rama); // Rotación simple izquierda
            } else {
                rama.setRight(rotarDerecha(rama.getRight())); // Rotación derecha-izquierda
                return rotarIzquierda(rama);
            }
        }

        return rama; // Retorna la raíz actualizada del subárbol
    }

    // Método para encontrar el nodo con el valor mínimo en un subárbol
    private Node<T> minValueNode(Node<T> node) {
        Node<T> current = node;

        // Encuentra el nodo más a la izquierda
        while (current.getLeft() != null) {
            current = current.getLeft();
        }

        return current; // Retorna el nodo con el valor mínimo
    }

    // Método para imprimir el árbol con representación visual de ramas
    public void imprimirArbolConRamas(Node<T> nodo, String prefix, boolean esHijoDerecho) {
        if (nodo != null) {
            // Llamada recursiva al subárbol derecho con prefijo ajustado
            imprimirArbolConRamas(nodo.getRight(), prefix + (esHijoDerecho ? "       " : "│      "), true);

            // Imprime el prefijo y el valor del nodo actual
            System.out.println(prefix + (esHijoDerecho ? "┌───" : "└───") + "(" + nodo.getElement() + ")");

            // Llamada recursiva al subárbol izquierdo con prefijo ajustado
            imprimirArbolConRamas(nodo.getLeft(), prefix + (esHijoDerecho ? "│      " : "       "), false);
        }
    }

    // Métodos adicionales no utilizados para imprimir el árbol en diferentes
    // órdenes
    /*
     * Método para imprimir el árbol en inorden
     * private void printInOrder(Node<T> rama) {
     * if (rama == null) {
     * return;
     * }
     * printInOrder(rama.getLeft());
     * System.out.print(" " + rama.getElement());
     * printInOrder(rama.getRight());
     * }
     *
     * Método para recorrer el árbol en inorden
     * public void recorrerEnOrden(Node<T> rama) {
     * printInOrder(rama);
     * System.out.println();
     * }
     */
}
