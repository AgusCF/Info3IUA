package Utilitis.RaB;

public class NodeRyB<T> {
    // Campos del nodo
    private T element;
    private boolean color;// true = Rojo y false = negro =)
    private int canBlack;// Cantidad de nodos negros Izquierdo
    // private int canBlackright;//Cantidad de nodos negros derecho
    private NodeRyB<T> left;
    private NodeRyB<T> right;

    /**
     * Constructor por defecto que inicializa un nodo vacío.
     */
    public NodeRyB() {
    }

    /**
     * Constructor para crear un nodo terminal con un elemento específico.
     */
    public NodeRyB(T element) {
        this.element = element;
        color = true;
        canBlack = 0;
        left = null;
        right = null;
    }

    public NodeRyB(T element, NodeRyB<T> left, NodeRyB<T> right) {
        this.element = element;
        this.left = left;
        this.right = right;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public boolean getcolor() {
        return color;
    }

    public void setColorRed() {
        color = true;
    }

    public void setColorBlack() {
        color = false;
    }

    public int getcanBlack() {
        return canBlack;
    }

    public void setcanBlackMas() {
        canBlack++;
    }

    public void setcanBlackMenos() {
        canBlack--;
    }

    public void setcanBlack(int can) {
        canBlack = can;
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
