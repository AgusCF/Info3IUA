package Utilitis.RaB;

public class ArbolRyB<T extends Comparable<T>> {
    private NodoRyB<T> raiz; // Cambiado de "root" a "raiz"
    private static final boolean ROJO = true; // Cambiado de "RED" a "ROJO"
    private static final boolean NEGRO = false; // Cambiado de "BLACK" a "NEGRO"

    // Método para insertar elementos en el árbol
    public NodoRyB<T> insertarNodo(NodoRyB<T> rama, T elemento) {
        if (elemento == null) {
            throw new IllegalArgumentException("El elemento no puede ser nulo");
        }

        // Inserta el nuevo nodo como un nodo rojo
        if (rama == null) {
            return new NodoRyB<>(elemento, ROJO); // Cambiado de "RED" a "ROJO"
        }

        // Comparar e insertar recursivamente
        if (elemento.compareTo(rama.getElemento()) < 0) {
            rama.setIzquierdo(insertarNodo(rama.getIzquierdo(), elemento));
        } else if (elemento.compareTo(rama.getElemento()) > 0) {
            rama.setDerecho(insertarNodo(rama.getDerecho(), elemento));
        } else {
            return rama; // No se permiten duplicados
        }

        // Ajustes del árbol rojo-negro después de la inserción
        if (esRojo(rama.getDerecho()) && !esRojo(rama.getIzquierdo())) {
            rama = rotarIzquierda(rama); // Corrige hijos rojos a la derecha
        }
        if (esRojo(rama.getIzquierdo()) && esRojo(rama.getIzquierdo().getIzquierdo())) {
            rama = rotarDerecha(rama); // Corrige dos hijos rojos consecutivos a la izquierda
        }
        if (esRojo(rama.getIzquierdo()) && esRojo(rama.getDerecho())) {
            cambiarColores(rama); // Cambia colores si ambos hijos son rojos
        }

        // Asegurarse de que la raíz sea siempre negra
        rama.setColor(NEGRO); // Cambiado de "BLACK" a "NEGRO"
        return rama;
    }

    // Método para insertar un elemento
    public void insertar(T elemento) {
        raiz = insertarNodo(raiz, elemento);
        raiz.setColor(NEGRO); // Asegúrate de que la raíz siempre sea negra
    }

    // Método para eliminar un nodo
    public void eliminar(T elemento) {
        if (elemento == null) {
            throw new IllegalArgumentException("El elemento no puede ser nulo");
        }
        if (!contiene(elemento)) {
            System.out.println("El elemento no existe en el árbol.");
            return;
        }

        // Si ambos hijos de la raíz son negros, asegúrate de que la raíz sea roja para
        // mantener el balance
        if (!esRojo(raiz.getIzquierdo()) && !esRojo(raiz.getDerecho())) {
            raiz.setColor(ROJO); // Cambiado de "RED" a "ROJO"
        }

        raiz = eliminarNodo(raiz, elemento);

        // Asegúrate de que la raíz sea negra
        if (raiz != null) {
            raiz.setColor(NEGRO); // Cambiado de "BLACK" a "NEGRO"
        }
    }

    // Método auxiliar para eliminar un nodo
    private NodoRyB<T> eliminarNodo(NodoRyB<T> nodo, T elemento) {
        if (elemento.compareTo(nodo.getElemento()) < 0) {
            if (!esRojo(nodo.getIzquierdo()) && !esRojo(nodo.getIzquierdo().getIzquierdo())) {
                nodo = moverRojoIzquierda(nodo);
            }
            nodo.setIzquierdo(eliminarNodo(nodo.getIzquierdo(), elemento));
        } else {
            if (esRojo(nodo.getIzquierdo())) {
                nodo = rotarDerecha(nodo);
            }
            if (elemento.compareTo(nodo.getElemento()) == 0 && (nodo.getDerecho() == null)) {
                return null;
            }
            if (!esRojo(nodo.getDerecho()) && !esRojo(nodo.getDerecho().getIzquierdo())) {
                nodo = moverRojoDerecha(nodo);
            }
            if (elemento.compareTo(nodo.getElemento()) == 0) {
                NodoRyB<T> min = min(nodo.getDerecho());
                nodo.setElemento(min.getElemento());
                nodo.setDerecho(eliminarMin(nodo.getDerecho()));
            } else {
                nodo.setDerecho(eliminarNodo(nodo.getDerecho(), elemento));
            }
        }

        return balancear(nodo);
    }

    // Método para eliminar todo el árbol
    public NodoRyB<T> eliminarTodoElArbol() {
        return raiz = null;
    }

    // Rotación a la izquierda para equilibrar el árbol
    private NodoRyB<T> rotarIzquierda(NodoRyB<T> nodo) {
        NodoRyB<T> nuevaRaiz = nodo.getDerecho();
        nodo.setDerecho(nuevaRaiz.getIzquierdo());
        nuevaRaiz.setIzquierdo(nodo);
        nuevaRaiz.setColor(nodo.getColor());
        nodo.setColorRojo(); // El nodo original se vuelve rojo
        return nuevaRaiz;
    }

    // Rotación a la derecha para equilibrar el árbol
    private NodoRyB<T> rotarDerecha(NodoRyB<T> nodo) {
        NodoRyB<T> nuevaRaiz = nodo.getIzquierdo();
        nodo.setIzquierdo(nuevaRaiz.getDerecho());
        nuevaRaiz.setDerecho(nodo);
        nuevaRaiz.setColor(nodo.getColor());
        nodo.setColorRojo(); // El nodo original se vuelve rojo
        return nuevaRaiz;
    }

    // Cambiar los colores de un nodo padre e hijos
    private void cambiarColores(NodoRyB<T> nodo) {
        nodo.setColorRojo();
        if (nodo.getIzquierdo() != null) {
            nodo.getIzquierdo().setColorNegro();
        }
        if (nodo.getDerecho() != null) {
            nodo.getDerecho().setColorNegro();
        }
    }

    // Mover rojo a la izquierda para eliminar un nodo
    private NodoRyB<T> moverRojoIzquierda(NodoRyB<T> nodo) {
        cambiarColores(nodo);
        if (esRojo(nodo.getDerecho().getIzquierdo())) {
            nodo.setDerecho(rotarDerecha(nodo.getDerecho()));
            nodo = rotarIzquierda(nodo);
            cambiarColores(nodo);
        }
        return nodo;
    }

    // Mover rojo a la derecha para eliminar un nodo
    private NodoRyB<T> moverRojoDerecha(NodoRyB<T> nodo) {
        cambiarColores(nodo);
        if (esRojo(nodo.getIzquierdo().getIzquierdo())) {
            nodo = rotarDerecha(nodo);
            cambiarColores(nodo);
        }
        return nodo;
    }

    // Balancear el árbol después de la eliminación
    private NodoRyB<T> balancear(NodoRyB<T> nodo) {
        if (esRojo(nodo.getDerecho())) {
            nodo = rotarIzquierda(nodo);
        }
        if (esRojo(nodo.getIzquierdo()) && esRojo(nodo.getIzquierdo().getIzquierdo())) {
            nodo = rotarDerecha(nodo);
        }
        if (esRojo(nodo.getIzquierdo()) && esRojo(nodo.getDerecho())) {
            cambiarColores(nodo);
        }
        return nodo;
    }

    // Eliminar el nodo mínimo
    private NodoRyB<T> eliminarMin(NodoRyB<T> nodo) {
        if (nodo.getIzquierdo() == null) {
            return null;
        }
        if (!esRojo(nodo.getIzquierdo()) && !esRojo(nodo.getIzquierdo().getIzquierdo())) {
            nodo = moverRojoIzquierda(nodo);
        }
        nodo.setIzquierdo(eliminarMin(nodo.getIzquierdo()));
        return balancear(nodo);
    }

    // Encuentra el valor mínimo en el árbol
    private NodoRyB<T> min(NodoRyB<T> nodo) {
        if (nodo.getIzquierdo() == null) {
            return nodo;
        } else {
            return min(nodo.getIzquierdo());
        }
    }

    // Encuentra el valor máximo en el árbol
    private NodoRyB<T> max(NodoRyB<T> nodo) {
        if (nodo.getDerecho() == null) {
            return nodo;
        } else {
            return max(nodo.getDerecho());
        }
    }

    // Devolver el nodo con el valor mínimo
    public NodoRyB<T> devolverElMin() {
        return min(raiz);
    }

    // Devolver el nodo con el valor máximo
    public NodoRyB<T> devolverElMax() {
        return max(raiz);
    }

    // Verificar si el árbol contiene un elemento
    public boolean contiene(T elemento) {
        return contiene(raiz, elemento);
    }

    // Método auxiliar para verificar si el árbol contiene un elemento
    private boolean contiene(NodoRyB<T> nodo, T elemento) {
        if (nodo == null) {
            return false;
        }
        int cmp = elemento.compareTo(nodo.getElemento());
        if (cmp < 0) {
            return contiene(nodo.getIzquierdo(), elemento);
        } else if (cmp > 0) {
            return contiene(nodo.getDerecho(), elemento);
        } else {
            return true;
        }
    }

    // Verificar si un nodo es rojo
    private boolean esRojo(NodoRyB<T> nodo) {
        if (nodo == null) {
            return NEGRO; // Los nodos nulos son negros por defecto
        }
        return nodo.getColor() == ROJO; // Devuelve true si el nodo es rojo
    }

    // Método para imprimir el árbol con formato de ramas
    private void imprimirArbolConRamas(NodoRyB<T> nodo, String prefijo, boolean esHijoDerecho) {
        if (nodo != null) {
            imprimirArbolConRamas(nodo.getDerecho(), prefijo + (esHijoDerecho ? "       " : "│      "), true);

            if (nodo.getColor() == ROJO) {
                System.out.println(prefijo + (esHijoDerecho ? "┌───" : "└───") + "\033[31m(\033[0m" + "\033[31m"
                        + nodo.getElemento() + "\033[31m)\033[0m");
            } else {
                System.out.println(prefijo + (esHijoDerecho ? "┌───" : "└───") + "(" + nodo.getElemento() + ")");
            }

            imprimirArbolConRamas(nodo.getIzquierdo(), prefijo + (esHijoDerecho ? "│      " : "       "), false);
        }
    }

    // Método que llama a la impresión con la raíz como argumento
    public void imprimirArbolConRamas() {
        imprimirArbolConRamas(raiz, "", false);
    }
}
