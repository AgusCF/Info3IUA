package Utilitis;

/**
 * Clase que representa un nodo en un árbol binario.
 *
 * @param <T> Tipo de dato que almacena el nodo. Debe ser comparable.
 */
public class Node<T> {
    // Campos del nodo
    private T element;
    private int altura;
    private Node<T> left;
    private Node<T> right;

    /**
     * Constructor por defecto que inicializa un nodo vacío.
     */
    public Node() {
    }

    /**
     * Constructor para crear un nodo terminal con un elemento específico.
     */
    public Node(T element) {
        this.element = element;
        left = null;
        right = null;
    }

    public Node(T element, Node<T> left, Node<T> right) {
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

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void alturaMenos() {
        altura--;
    }

    public void alturaMas() {
        altura++;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }
}
