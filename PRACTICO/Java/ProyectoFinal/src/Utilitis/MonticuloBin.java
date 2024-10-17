package Utilitis;
public class MonticuloBin<T extends Comparable<T>> {
    private T[] heap;
    private int size;
    private int capacity;

    // Constructor para inicializar el montículo con una capacidad inicial
    @SuppressWarnings("unchecked")
    public MonticuloBin(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        heap = (T[]) new Comparable[capacity];
    }

    // Método para obtener el índice del padre de un nodo
    private int parent(int index) {
        return (index - 1) / 2;
    }

    // Método para obtener el índice del hijo izquierdo de un nodo
    private int leftChild(int index) {
        return 2 * index + 1;
    }

    // Método para obtener el índice del hijo derecho de un nodo
    private int rightChild(int index) {
        return 2 * index + 2;
    }

    // Método para intercambiar dos elementos del arreglo
    private void swap(int index1, int index2) {
        T temp = heap[index1];
        heap[index1] = heap[index2];
        heap[index2] = temp;
    }

    // Método para restablecer la propiedad del montículo moviendo un elemento hacia arriba
    private void heapifyUp(int index) {
        while (index > 0 && heap[parent(index)].compareTo(heap[index]) > 0) {
            swap(parent(index), index);
            index = parent(index);
        }
    }

    // Método para restablecer la propiedad del montículo moviendo un elemento hacia abajo
    private void heapifyDown(int index) {
        int smallest = index;
        int left = leftChild(index);
        int right = rightChild(index);

        if (left < size && heap[left].compareTo(heap[smallest]) < 0) {
            smallest = left;
        }

        if (right < size && heap[right].compareTo(heap[smallest]) < 0) {
            smallest = right;
        }

        if (smallest != index) {
            swap(index, smallest);
            heapifyDown(smallest);
        }
    }

    // Método para insertar un nuevo elemento en el montículo
    public void insert(T element) {
        // Verificar si el montículo está lleno
        if (size == capacity) {
            throw new IllegalStateException("Montículo lleno");
        }

        // Insertar el nuevo elemento al final del arreglo
        heap[size] = element;
        size++;

        // Restablecer la propiedad del montículo (percolación hacia arriba)
        heapifyUp(size - 1);
    }

    // Método para obtener el elemento mínimo (la raíz del montículo)
    public T peek() {
        if (size == 0) {
            throw new IllegalStateException("Montículo vacío");
        }
        return heap[0];
    }

    // Método para eliminar el elemento mínimo (la raíz del montículo)
    public T remove() {
        if (size == 0) {
            throw new IllegalStateException("Montículo vacío");
        }

        T root = heap[0];
        heap[0] = heap[size - 1];
        size--;

        // Restablecer la propiedad del montículo (percolación hacia abajo)
        heapifyDown(0);

        return root;
    }

    // Método para obtener el tamaño del montículo
    public int size() {
        return size;
    }

    // Método para verificar si el montículo está vacío
    public boolean isEmpty() {
        return size == 0;
    }

    // Método para imprimir el montículo como un arreglo
    public void imprimirComoArreglo() {
        System.out.print("Montículo como arreglo: [");
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public void imprimirMonticuloConRamas(int index, String prefix, boolean esHijoDerecho) {
        if (index < size) {
            // Llamada recursiva para el hijo derecho
            imprimirMonticuloConRamas(rightChild(index), prefix + (esHijoDerecho ? "       " : "│      "), true);
            
            // Imprimir el prefijo y el nodo actual
            System.out.println(prefix + (esHijoDerecho ? "┌───" : "└───") + "(" + heap[index] + ")");
            
            // Llamada recursiva para el hijo izquierdo
            imprimirMonticuloConRamas(leftChild(index), prefix + (esHijoDerecho ? "│      " : "       "), false);
        }
    }
}
