package utilitis.ArbolBinario;

/**
 * Clase que representa un nodo en un árbol binario.
 *
 * @param <T> Tipo de dato que almacena el nodo. Debe ser comparable.
 */
public class BinNode<T> {
    // Elemento almacenado en el nodo
    private T element;
    // Referencia al hijo izquierdo del nodo
    private BinNode<T> left;
    // Referencia al hijo derecho del nodo
    private BinNode<T> right;

    /**
     * Constructor por defecto que inicializa un nodo vacío.
     */
    public BinNode() {
    }

    /**
     * Constructor para crear un nodo terminal con un elemento específico.
     *
     * @param element El elemento a almacenar en el nodo.
     */
    public BinNode(T element) {
        this.element = element; // Asigna el elemento al nodo
        this.left = null; // Inicializa el hijo izquierdo como nulo
        this.right = null; // Inicializa el hijo derecho como nulo
    }

    /**
     * Constructor para crear un nodo con un elemento y referencias a sus hijos.
     *
     * @param element El elemento a almacenar en el nodo.
     * @param left    Referencia al hijo izquierdo.
     * @param right   Referencia al hijo derecho.
     */
    public BinNode(T element, BinNode<T> left, BinNode<T> right) {
        this.element = element; // Asigna el elemento al nodo
        this.left = left; // Asigna el hijo izquierdo
        this.right = right; // Asigna el hijo derecho
    }

    /**
     * Obtiene el elemento almacenado en el nodo.
     *
     * @return El elemento del nodo.
     */
    public T getElement() {
        return element;
    }

    /**
     * Establece un nuevo elemento en el nodo.
     *
     * @param element El nuevo elemento a almacenar.
     */
    public void setElement(T element) {
        this.element = element;
    }

    /**
     * Obtiene el hijo izquierdo del nodo.
     *
     * @return Referencia al hijo izquierdo.
     */
    public BinNode<T> getLeft() {
        return left;
    }

    /**
     * Establece el hijo izquierdo del nodo.
     *
     * @param left Referencia al nuevo hijo izquierdo.
     */
    public void setLeft(BinNode<T> left) {
        this.left = left;
    }

    /**
     * Obtiene el hijo derecho del nodo.
     *
     * @return Referencia al hijo derecho.
     */
    public BinNode<T> getRight() {
        return right;
    }

    /**
     * Establece el hijo derecho del nodo.
     *
     * @param right Referencia al nuevo hijo derecho.
     */
    public void setRight(BinNode<T> right) {
        this.right = right;
    }
}
