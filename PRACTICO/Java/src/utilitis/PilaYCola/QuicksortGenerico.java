package utilitis.PilaYCola;

import utilitis.Ordenamiento.Pedido;

import java.util.List;

// Definir el método como genérico con <T extends Comparable<T>>
public class QuicksortGenerico {

    // Método quickSort genérico para arreglos
    public <T extends Comparable<T>> void quickSort(T[] array, int izquierda, int derecha) {
        if (izquierda < derecha) {
            // Elegir el pivote (usamos el elemento central)
            T pivote = array[(izquierda + derecha) / 2];
            int i = izquierda;
            int j = derecha;

            // Hacer la partición
            while (i <= j) {
                // Busca un elemento mayor que el pivote desde la izquierda
                while (array[i].compareTo(pivote) < 0) {
                    i++;
                }

                // Busca un elemento menor que el pivote desde la derecha
                while (array[j].compareTo(pivote) > 0) {
                    j--;
                }

                // Si encontramos un par que está fuera de lugar, los intercambiamos
                if (i <= j) {
                    T temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    i++;
                    j--;
                }
            }

            // Llamada recursiva a las dos particiones
            if (izquierda < j) {
                quickSort(array, izquierda, j);
            }
            if (i < derecha) {
                quickSort(array, i, derecha);
            }
        }
    }
}
