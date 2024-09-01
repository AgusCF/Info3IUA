package utilitis.Ordenamiento;

public class MenuRes {
    public void mostrarMenu(){
        System.out.println("******** MENU ********");
        System.out.println("""
                           
                           1-Ingresar pedido: 
                           2-Ordenar pedido por preparacion (Insercion)
                           3-Ordenar pedido por precio total (Shellsort)
                           4-Ordenar pedido por nombre del cliente (Quicksort)
                           5-Eliminar pedido
                           6-Modificar pedido
                           7-Mostrar todos los pedidos
                           8-Exit.
                           Eleccion: """);
    }

}
