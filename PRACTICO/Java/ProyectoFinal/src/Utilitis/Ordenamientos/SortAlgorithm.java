package Utilitis.Ordenamientos;
public interface SortAlgorithm<T extends Comparable<T>> {
    void sort(T[] array);
}