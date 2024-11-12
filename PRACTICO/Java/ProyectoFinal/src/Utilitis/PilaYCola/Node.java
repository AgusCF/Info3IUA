// NodeArray.java
package Utilitis.PilaYCola;

// Clase genérica que almacena un dato y permite la comparación
public class NodeArray<T extends Comparable<T>> implements Comparable<NodeArray<T>> {
    private T dato; // Tipo genérico

    // Constructor que inicializa el dato
    public NodeArray(T dato) {
        this.dato = dato;
    }

    // Getter para obtener el dato
    public T getDato() {
        return dato;
    }

    // Setter para establecer el dato
    public void setDato(T dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "Dato: " + dato;
    }

    // Método de comparación para ordenar nodos
    @Override
    public int compareTo(NodeArray<T> otroNodeArray) {
        return this.dato.compareTo(otroNodeArray.getDato());
    }
}
