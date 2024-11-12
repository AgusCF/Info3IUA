package Utilitis.PilaYCola;

public class NodeArray<T extends Comparable<T>> implements Comparable<NodeArray<T>> {
    private T dato; // Tipo genérico

    public NodeArray(T dato) {
        this.dato = dato;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "El es " + dato;
    }

    // Implementación del método compareTo de la interfaz Comparable
    @Override
    public int compareTo(NodeArray<T> otroNodeArray) {
        // Comparación usando el tipo genérico <T>, que debe ser comparable
        return this.dato.compareTo(otroNodeArray.getDato());
    }
}
