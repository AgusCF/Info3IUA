package Utilitis.PYC;

class Pila<T> {
    private T[] pila;
    private int topIndex;
    
    @SuppressWarnings("unchecked")
    public Pila(int capacidad) {
        pila = (T[]) new Object[capacidad];
        topIndex = -1;
    }
    
    public void push(T elemento) {
        if (topIndex == pila.length - 1) {
            System.out.println("La pila está llena");
            return;
        }
        pila[++topIndex] = elemento;
    }
    
    public T pop() {
        if (isEmpty()) {
            System.out.println("La pila está vacía");
            return null;
        }
        return pila[topIndex--];
    }
    
    public T top() {
        if (isEmpty()) {
            System.out.println("La pila está vacía");
            return null;
        }
        return pila[topIndex];
    }
    
    public boolean isEmpty() {
        return topIndex == -1;
    }
}

