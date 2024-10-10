package Utilitis;

public class ArbolAVL<T extends Comparable<T>> {

    // Método para insertar un nuevo elemento en el árbol AVL
    public Node<T> insert(Node<T> rama, T element) {
        // Si el árbol está vacío, crea un nuevo nodo con el elemento
        if (rama == null) {
            return new Node<>(element); // Devuelve el nuevo nodo
        }

        // Si el elemento es menor, lo insertamos en el subárbol izquierdo
        if (element.compareTo(rama.getElement()) < 0) {
            rama.setLeft(insert(rama.getLeft(), element));
        }
        // Si el elemento es mayor, lo insertamos en el subárbol derecho
        else if (element.compareTo(rama.getElement()) > 0) {
            rama.setRight(insert(rama.getRight(), element));
        } else {
            System.out.println("Número repetido, ingrese otro.");
            return rama; // No permite duplicados
        }

        // Actualizamos la altura del nodo actual
        rama.setAltura(1 + Math.max(altura(rama.getLeft()), altura(rama.getRight())));

        // Calculamos el factor de balanceo
        int factorBalanceo = calcularFactorBalanceo(rama);

        // Verificamos si el nodo está desbalanceado y realizamos rotaciones si es
        // necesario
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
        return nodo.getAltura();
    }

    // Método para calcular el factor de balanceo de un nodo
    private int calcularFactorBalanceo(Node<T> nodo) {
        if (nodo == null) {
            return 0;
        }
        // Factor de balanceo = altura subárbol derecho - altura subárbol izquierdo
        return altura(nodo.getRight()) - altura(nodo.getLeft());
    }

    // Rotación simple a la derecha
    private Node<T> rotarDerecha(Node<T> rama) {
        Node<T> nuevaRaiz = rama.getLeft();
        rama.setLeft(nuevaRaiz.getRight());
        nuevaRaiz.setRight(rama);

        // Actualizamos alturas
        rama.setAltura(1 + Math.max(altura(rama.getLeft()), altura(rama.getRight())));
        nuevaRaiz.setAltura(1 + Math.max(altura(nuevaRaiz.getLeft()), altura(nuevaRaiz.getRight())));

        return nuevaRaiz;
    }

    // Rotación simple a la izquierda
    private Node<T> rotarIzquierda(Node<T> rama) {
        Node<T> nuevaRaiz = rama.getRight();
        rama.setRight(nuevaRaiz.getLeft());
        nuevaRaiz.setLeft(rama);

        // Actualizamos alturas
        rama.setAltura(1 + Math.max(altura(rama.getLeft()), altura(rama.getRight())));
        nuevaRaiz.setAltura(1 + Math.max(altura(nuevaRaiz.getLeft()), altura(nuevaRaiz.getRight())));

        return nuevaRaiz;
    }

    // Métodos para mostrar el árbol en preorden, enorden y postorden
    private void printInOrder(Node<T> rama) {
        if (rama == null) {
            return; // Si el nodo es nulo, salimos de la función
        }

        printInOrder(rama.getLeft()); // Recorremos el subárbol izquierdo
        System.out.print(" " + rama.getElement()); // Imprimimos el valor del nodo actual
        printInOrder(rama.getRight()); // Recorremos el subárbol derecho
    }

    public void recorrerEnOrden(Node<T> rama) {
        printInOrder(rama); // Llama al método privado
        System.out.println(); // Nueva línea al final
    }
    //Imprimir con ramas:
    public void imprimirArbolConRamas(Node<T> nodo, String prefix, boolean esHijoDerecho) {
        if (nodo != null) {
            // Llamada recursiva al subárbol derecho
            imprimirArbolConRamas(nodo.getRight(), prefix + (esHijoDerecho ? "       " : "│      "), true);
    
            // Imprimir el prefijo y el nodo actual
            System.out.println(prefix + (esHijoDerecho ? "┌───" : "└───") + "(" + nodo.getElement() + ")");
    
            // Llamada recursiva al subárbol izquierdo
            imprimirArbolConRamas(nodo.getLeft(), prefix + (esHijoDerecho ? "│      " : "       "), false);
        }
    }
    //Imprimir sin ramas
    /*public void imprimirArbol(Node<T> rama, int nivel) {
        if (rama == null) {
            return; // Si el nodo es nulo, salimos de la función
        }
    
        // Aumentamos el nivel de indentación por cada nivel de profundidad en el árbol
        imprimirArbol(rama.getRight(), nivel + 1);
    
        // Imprimir espacios para crear el efecto visual de árbol
        for (int i = 0; i < nivel; i++) {
            System.out.print("     "); // 5 espacios por nivel (puedes ajustar)
        }
    
        // Imprimimos el valor del nodo
        System.out.println("("+rama.getElement()+")");
    
        // Recorremos el subárbol izquierdo
        imprimirArbol(rama.getLeft(), nivel + 1);
    }*/
}
