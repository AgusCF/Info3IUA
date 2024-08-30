package utilitis.Ordenamiento;
import java.util.List;

public class Incercion {
    public void incercionV1(List<Pedido> listaDePedidos){//Vercion armada por la clase
        //CargDeFun funcion = new CargDeFun();
        Pedido temp;
        int j;
        /*if (funcion.itsEmpty(listaDePedidos)) {
            System.out.println("No se puede ordenar esta vacio");
        }*/
        
        for(int i = 1; i < listaDePedidos.size(); i++) {  // Comenzamos desde el segundo elemento
            j = i;
            while (j > 0 && listaDePedidos.get(j).getTiempo() < listaDePedidos.get(j-1).getTiempo()) {
                // Intercambio de elementos
                temp = listaDePedidos.get(j);
                listaDePedidos.set(j, listaDePedidos.get(j-1));
                listaDePedidos.set(j-1, temp);
                j--;
            }
        }
    }

    public void incercionV2(List<Pedido> listaDePedidos){//Vercion optimizada de Incercion(La del ppt)
        // Recorremos la lista comenzando desde el segundo elemento
        for (int i = 1; i < listaDePedidos.size(); i++) {
            Pedido temp = listaDePedidos.get(i);  // Guardamos el pedido actual en temp
            int j = i - 1;

            // Comparar el tiempo del pedido actual con los pedidos anteriores
            while (j >= 0 && listaDePedidos.get(j).getTiempo() > temp.getTiempo()) {
                // Si el pedido en la posición j tiene un tiempo mayor, lo movemos una posición hacia adelante
                listaDePedidos.set(j + 1, listaDePedidos.get(j));
                j--;
            }

            // Colocamos el pedido de temp en su posición correcta
            listaDePedidos.set(j + 1, temp);
        }
    }
}
