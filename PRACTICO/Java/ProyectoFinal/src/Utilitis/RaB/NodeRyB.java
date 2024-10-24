package Utilitis.RaB;

public class NodeRyB<T> {
    private T element;
    private boolean color; // RED o BLACK
    private NodeRyB<T> left;
    private NodeRyB<T> right;

    public NodeRyB(T element, boolean color) {
        this.element = element;
        this.color = color;
        this.left = null; // Inicializa el hijo izquierdo como nulo
        this.right = null; // Inicializa el hijo derecho como nulo
    }

    // Métodos de acceso y mutadores
    public T getElement() {
        return element;
    }

    public boolean getColor() {
        return color; // Método para obtener el color
    }

    public void setColorRed() {
        this.color = true; // Asigna el color rojo
    }

    public void setColorBlack() {
        this.color = false; // Asigna el color negro
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    public NodeRyB<T> getLeft() {
        return left;
    }

    public void setLeft(NodeRyB<T> left) {
        this.left = left;
    }

    public NodeRyB<T> getRight() {
        return right;
    }

    public void setRight(NodeRyB<T> right) {
        this.right = right;
    }
}
