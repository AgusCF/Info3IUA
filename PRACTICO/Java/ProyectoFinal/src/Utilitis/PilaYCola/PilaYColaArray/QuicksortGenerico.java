// QuicksortGenerico.java
package Utilitis.PilaYCola.PilaYColaArray;

import Utilitis.PilaYCola.*;

// Clase para realizar ordenamiento usando el algoritmo Quicksort
public class QuicksortGenerico<T extends Comparable<T>> {

    // Método principal para ordenar el arreglo usando Quicksort
    public void quickSort(NodeDato<T>[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    // Método para dividir el arreglo en dos partes
    private int partition(NodeDato<T>[] array, int low, int high) {
        NodeDato<T> pivot = array[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (array[j].compareTo(pivot) < 0) {
                i++;
                NodeDato<T> temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        NodeDato<T> temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }
}
