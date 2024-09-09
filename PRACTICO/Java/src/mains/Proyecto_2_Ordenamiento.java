package mains;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import utilitis.Ordenamiento.CargDeFun;
import utilitis.Ordenamiento.Incercion;
import utilitis.Ordenamiento.MenuRes;
import utilitis.Ordenamiento.Pedido;
import utilitis.Ordenamiento.Quicksort;
import utilitis.Ordenamiento.Shellsort;

public class Proyecto_2_Ordenamiento {
    public static void main(String[] args) throws Exception {
        MenuRes menu = new MenuRes();
        CargDeFun funcion = new CargDeFun();
        Incercion incercion = new Incercion();
        Shellsort shellsort = new Shellsort();
        Quicksort quicksort = new Quicksort();

        Scanner entrada = new Scanner(System.in);
        int eleccion = 0;
        int eleccionInterna = 0;

        List<Pedido> listaDePedidos = new ArrayList<Pedido>();

        do {
            menu.mostrarMenu();
            eleccion = entrada.nextInt();
            switch (eleccion) {
                case 1:// Ingresar pedido:
                    funcion.cargagrPedido(listaDePedidos);
                    funcion.mostrarListado(listaDePedidos);
                    break;
                case 2:// Ordenar pedido por preparacion (Insercion)
                    funcion.cargarDiespedisos(listaDePedidos);
                    break;
                case 3:// Ordenar pedido por preparacion (Insercion)
                    incercion.menuIncercion(listaDePedidos);
                    break;
                case 4:// Ordenar pedido por precio total (Shellsort)
                    shellsort.menuShell(listaDePedidos);
                    break;
                case 5:// Ordenar pedido por nombre del cliente (Quicksort)
                    quicksort.quickSort(listaDePedidos, 0, listaDePedidos.size() - 1);
                    funcion.mostrarListado(listaDePedidos);
                    break;
                case 6:// Eliminar pedido
                    funcion.borrarElmentoLista(listaDePedidos);
                    break;
                case 7:// Modificar pedido
                    break;
                case 8:// Mostrar todos los pedidos
                    funcion.mostrarListado(listaDePedidos);
                    break;
                case 9:// Exit.
                    break;
                default:
                    System.out.println("La opcion ingresada no corresponde a ninguna operacion");
                    break;
            }

        } while (eleccion != 9);
        entrada.close();
    }
}
