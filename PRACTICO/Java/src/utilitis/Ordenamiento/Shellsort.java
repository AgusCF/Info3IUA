package utilitis.Ordenamiento;

import java.util.List;
import java.util.Scanner;

public class Shellsort {
    Scanner entrada = new Scanner(System.in);
    CargDeFun funcion = new CargDeFun();

    public void shellsortOrder(List<Pedido> listaDePedidos) {

        int i = 0;
        int j = 0;
        Pedido aux;
        int gap = 0;
        for (gap = listaDePedidos.size() / 2; gap > 0; gap /= 2) {
            for (i = gap; i < listaDePedidos.size(); i++) {
                for (j = i - gap; j >= 0
                        && listaDePedidos.get(j).getPrecio() < listaDePedidos.get(j + gap).getPrecio(); j -= gap) {
                    // Intercambia los elementos en las posiciones j y j+gap
                    aux = listaDePedidos.get(j); // Guardamos el elemento en la posición j en una variable
                                                 // temporal
                    listaDePedidos.set(j, listaDePedidos.get(j + gap)); // Ponemos el elemento de j+gap en la posición j
                    listaDePedidos.set(j + gap, aux); // Ponemos el elemento de la variable temporal en la posición
                                                      // j+gap
                }
            }
        }

    }

    public void shellsortOrderMenor(List<Pedido> listaDePedidos) {
        int i = 0;
        int j = 0;
        Pedido aux;
        int gap = 0;
        for (gap = listaDePedidos.size() / 2; gap > 0; gap /= 2) {
            for (i = gap; i < listaDePedidos.size(); i++) {
                for (j = i; j >= gap
                        && listaDePedidos.get(j).getPrecio() < listaDePedidos.get(j - gap).getPrecio(); j -= gap) {
                    // Verifica que j-gap esté dentro de los límites antes de hacer el intercambio
                    if (j - gap >= 0) {
                        aux = listaDePedidos.get(j); // Guardamos el elemento en la posición j en una variable
                                                     // temporal
                        listaDePedidos.set(j, listaDePedidos.get(j - gap)); // Ponemos el elemento de j-gap en la
                                                                            // posición j
                        listaDePedidos.set(j - gap, aux); // Ponemos el elemento de la variable temporal en la posición
                                                          // j-gap
                    }
                }
            }
        }
    }

    public void menuShell(List<Pedido> listaDePedidos) {
        System.out.println("Seleccione tipo de Insercion:");
        System.out.println("1-Ordenar de mayor a menor)");
        System.out.println("2-Ordenar de menor a mayor");
        System.out.print("\nOpcion:");
        int eleccionInterna = entrada.nextInt();
        switch (eleccionInterna) {
            case 1:
                shellsortOrder(listaDePedidos);
                funcion.mostrarListado(listaDePedidos);
                break;
            case 2:
                shellsortOrderMenor(listaDePedidos);
                funcion.mostrarListado(listaDePedidos);
                break;
            default:
                System.out.println("Opcion invalida.");
                break;
        }
    }

}
