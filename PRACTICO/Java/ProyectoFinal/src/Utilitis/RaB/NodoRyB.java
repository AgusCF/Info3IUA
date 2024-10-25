package Utilitis.RaB;

public class NodoRyB<T extends Comparable<T>> {
    private T elemento;
    private NodoRyB<T> izquierdo, derecho;
    private boolean color;

    // Constructor
    public NodoRyB(T elemento, boolean color) {
        this.elemento = elemento;
        this.color = color;
    }

    // Métodos getter y setter para los atributos
    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public NodoRyB<T> getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(NodoRyB<T> izquierdo) {
        this.izquierdo = izquierdo;
    }

    public NodoRyB<T> getDerecho() {
        return derecho;
    }

    public void setDerecho(NodoRyB<T> derecho) {
        this.derecho = derecho;
    }

    public boolean getColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    // Métodos auxiliares para manejar los colores
    public void setColorRojo() {
        this.color = true;
    }

    public void setColorNegro() {
        this.color = false;
    }
}
