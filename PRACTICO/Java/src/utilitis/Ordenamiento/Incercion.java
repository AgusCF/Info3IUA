package utilitis.Ordenamiento;
import java.util.List;

public class Incercion {
    public void incercionV1(List<Pedido> pedidos){//Vercion armada por la clase
        CargDeFun funcion = new CargDeFun();
        Pedido temp;
        int j;
        if (funcion.itsEmpty(pedidos)) {
            System.out.println("No se puede ordenar esta vacio");
        }
        
        for(int i = 1; i < pedidos.size(); i++) {  // Comenzamos desde el segundo elemento
            j = i;
            while (j > 0 && pedidos.get(j).getTiempo() < pedidos.get(j-1).getTiempo()) {
                // Intercambio de elementos
                temp = pedidos.get(j);
                pedidos.set(j, pedidos.get(j-1));
                pedidos.set(j-1, temp);
                j--;
            }
        }
    }

    public void incercionV2(List<Pedido> pedidos){//Vercion optimizada de Incercion(La del ppt)
        // Recorremos la lista comenzando desde el segundo elemento
        for (int i = 1; i < pedidos.size(); i++) {
            Pedido temp = pedidos.get(i);  // Guardamos el pedido actual en temp
            int j = i - 1;

            // Comparar el tiempo del pedido actual con los pedidos anteriores
            while (j >= 0 && pedidos.get(j).getTiempo() > temp.getTiempo()) {
                // Si el pedido en la posición j tiene un tiempo mayor, lo movemos una posición hacia adelante
                pedidos.set(j + 1, pedidos.get(j));
                j--;
            }

            // Colocamos el pedido de temp en su posición correcta
            pedidos.set(j + 1, temp);
        }
    }
}
