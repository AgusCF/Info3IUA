package Utilitis.PYC;

public class FuncionesPila {
    public static boolean esPalindromo(String cadena) {
        cadena = cadena.replaceAll("\\s+", "").toLowerCase();
        Pila<Character> pila = new Pila<>(cadena.length() / 2);
        
        int mitad = cadena.length() / 2;
        for (int i = 0; i < mitad; i++) {
            pila.push(cadena.charAt(i));
        }
        
        int inicioSegundaMitad = (cadena.length() % 2 == 0) ? mitad : mitad + 1;
        for (int i = inicioSegundaMitad; i < cadena.length(); i++) {
            if (!pila.pop().equals(cadena.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    public static boolean estaEquilibrada(String expresion) {
        Pila<Character> pila = new Pila<>(expresion.length());
        
        for (char c : expresion.toCharArray()) {
            if (c == '(') {
                pila.push(c);
            } else if (c == ')') {
                if (pila.isEmpty() || pila.pop() != '(') {
                    return false;
                }
            }
        }
        return pila.isEmpty();
    }

    public static void ordenarColaAscendente(Cola<Integer> cola) {
        Cola<Integer> colaAuxiliar = new Cola<>(cola.length()); // Usa el tamaño de la cola
        System.out.println("Cola original:");
        while (!cola.isEmpty()) {
            System.out.print(cola.dequeue() + " ");
        }
        while (!cola.isEmpty()) {
            int actual = cola.dequeue();
            while (!colaAuxiliar.isEmpty() && colaAuxiliar.top() < actual) {
                cola.enqueue(colaAuxiliar.dequeue());
            }
            colaAuxiliar.enqueue(actual);
        }

        // Copiar de colaAuxiliar a cola en orden ascendente
        while (!colaAuxiliar.isEmpty()) {
            cola.enqueue(colaAuxiliar.dequeue());
        }
        System.out.println("\nCola ordenada:");
        while (!cola.isEmpty()) {
            System.out.print(cola.dequeue() + " ");
        }
    }
}

