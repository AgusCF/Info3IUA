package Utilitis.Ordenamientos;
import java.util.Random;
public class FuncionesOrdenamiento {
    
    // Método para imprimir el array en pantalla
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Método para generar un array de enteros aleatorios
    public static Integer[] generateRandomIntArray(int length) {
        Integer[] array = new Integer[length];
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = rand.nextInt(100); // Rango 0-99
        }
        return array;
    }

    // Método para generar un array de números double aleatorios
    public static Double[] generateRandomDoubleArray(int length) {
        Double[] array = new Double[length];
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = rand.nextDouble() * 100; // Rango 0.0-99.99
        }
        return array;
    }
    public static String[] generateRandomStringArray(int length) {
        String[] array = new String[length];
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = "Str" + rand.nextInt(100); // Genera una cadena con prefijo "Str" y un número aleatorio
        }
        return array;
    }

    // Método para medir el tiempo de ejecución de un algoritmo de ordenamiento
    public static <T extends Comparable<T>> void measureSortingTime(T[] array, SortAlgorithm<T> algorithm) {
        long startTime = System.nanoTime();
        algorithm.sort(array);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000; // Convertir a milisegundos
        System.out.println("Tiempo de ejecución: " + duration + " ms");
    }
}