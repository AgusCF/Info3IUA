package utilitis.Ordenamiento;

public class Quicksort {
    public void quickSort(Pedido[] arreglo, int derecha, int izquierda) {
        int i = 0, j = 0;
        Pedido aux = null;
        do {

        } while (i < j);
    }
}

/*
 * int i, j, temp;
 * i = left;
 * j = right;
 * do {
 * while ( item [j] > item [i] && j>i) j-- ;
 * if ( i<j ) {
 * temp=item[i];
 * item[i] = item[j];
 * item[j] = temp;
 * i++;
 * }
 * while ( item [i] < item [j] && i<j ) i++ ;
 * if ( i<j ) {
 * temp=item[i];
 * item[i] = item[j];
 * item[j] = temp;
 * j--;
 * }
 * } while ( i<j );
 * if ( left < j ) quicksort (item, left, j-1 );
 * if ( i < right ) quicksort ( item, i+1, right );
 * }
 */