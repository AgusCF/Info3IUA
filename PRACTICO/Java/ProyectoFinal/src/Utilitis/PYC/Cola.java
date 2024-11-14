package Utilitis.PYC;
class Cola<T> {
    private T[] cola;
    private int frente, finalCola, tamano;

    @SuppressWarnings("unchecked")
    public Cola(int capacidad) {
        cola = (T[]) new Object[capacidad];
        frente = 0;
        finalCola = -1;
        tamano = 0;
    }

    public void enqueue(T elemento) {
        if (tamano == cola.length) {
            System.out.println("La cola está llena");
            return;
        }
        finalCola = (finalCola + 1) % cola.length;
        cola[finalCola] = elemento;
        tamano++;
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("La cola está vacía");
            return null;
        }
        T elemento = cola[frente];
        frente = (frente + 1) % cola.length;
        tamano--;
        return elemento;
    }

    public T top() {
        if (isEmpty()) {
            System.out.println("La cola está vacía");
            return null;
        }
        return cola[frente];
    }

    public boolean isEmpty() {
        return tamano == 0;
    }

    // Método length para obtener el tamaño actual de la cola
    public int length() {
        return tamano;
    }
}
