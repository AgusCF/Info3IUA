// NodeArray.java
package Utilitis.PilaYCola;

// Clase genérica que almacena un dato y permite la comparación
public class NodeDato<T extends Comparable<T>> implements Comparable<NodeDato<T>> {
    private T dato; // Tipo genérico

    // Constructor que inicializa el dato
    public NodeDato(T dato) {
        this.dato = dato;
    }

    public NodeDato() {

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
    public int compareTo(NodeDato<T> otroNodeArray) {
        return this.dato.compareTo(otroNodeArray.getDato());
    }
}
