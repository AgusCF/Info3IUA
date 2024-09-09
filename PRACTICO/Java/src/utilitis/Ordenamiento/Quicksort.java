package utilitis.Ordenamiento;

import java.util.List;

public class Quicksort {

    public void quickSort(List<Pedido> listaDePedidos, int izquierda, int derecha) {
        if (izquierda < derecha) {
            // Elegimos el pivote (el del centro)
            Pedido pivote = listaDePedidos.get((izquierda + derecha) / 2);
            int i = izquierda;
            int j = derecha;

            // Hacemos la partición
            while (i <= j) {
                // Busca un elemento mayor que el pivote desde la izquierda
                while (listaDePedidos.get(i).getNombreCliente()
                        .compareTo(pivote.getNombreCliente()) < 0) {
                    i++;
                }

                // Busca un elemento menor que el pivote desde la derecha
                while (listaDePedidos.get(j).getNombreCliente()
                        .compareTo(pivote.getNombreCliente()) > 0) {
                    j--;
                }

                // Si encontramos un par que está fuera de lugar, los intercambiamos
                if (i <= j) {
                    Pedido temp = listaDePedidos.get(i);
                    listaDePedidos.set(i, listaDePedidos.get(j));
                    listaDePedidos.set(j, temp);
                    i++;
                    j--;
                }
            }

            // Llamada recursiva a las dos particiones
            if (izquierda < j) {
                quickSort(listaDePedidos, izquierda, j);
            }
            if (i < derecha) {
                quickSort(listaDePedidos, i, derecha);
            }
        }
    }

}

/*
 * int i, j, temp;
 * i=left;
 * j=right;
 * do{
 * while (item[j] > item[i] && j > i)
 * j--;
 * if (i < j) {
 * temp = item[i];
 * item[i] = item[j];
 * item[j] = temp;
 * i++;
 * }
 * while (item[i] < item[j] && i < j)
 * i++;
 * if (i < j) {
 * temp = item[i];
 * item[i] = item[j];
 * item[j] = temp;
 * j--;
 * }
 * }while(i<j);if(left<j)
 * 
 * quicksort (item, left, j-1 );
 * if ( i < right ) quicksort ( item, i+1, right );
 * }
 */
