package utilitis.Ordenamiento;

public class MenuRes {
    public void mostrarMenu() {
        System.out.println("******** MENU ********");
        System.out.println("""

                1-Ingresar pedido:
                2-Ingresar 10 pedidos aleatoris.
                3-Ordenar pedido por tiempo de preparacion (Insercion)
                4-Ordenar pedido por precio total (Shellsort)
                5-Ordenar pedido por nombre del cliente (Quicksort)
                6-Eliminar pedido
                7-Modificar pedido
                8-Mostrar todos los pedidos
                9-Exit.""");
        System.out.print("\nEleccion: ");
    }

}
