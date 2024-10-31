package Menu;

import Utilitis.AVL.*;

import java.util.Scanner;

public class MenuAVL {
    private Node<Integer> root = null;
    private final ArbolAVL arbolAVL = new ArbolAVL();
    private final Scanner entrada = new Scanner(System.in);
    private final Funcion fun = new Funcion();

    public void mostrarMenu() {
        int select = 0;
        int selectop;

        do {
            selectop = 0;
            System.out.println();
            System.out.println("""
                    ##### Menú #####
                    1. Insertar elementos
                    2. Mostrar en orden
                    3. Cargar valores por defecto 1
                    4. Cargar valores por defecto 2
                    5. Eliminar un número
                    0. Salir del programa""");
            System.out.print("\nOpción: ");
            select = entrada.nextInt();

            // Confirmación adicional para opciones 3 y 4
            if (select == 3 || select == 4) {
                System.out.println("Esta opción reiniciará el árbol.");
                System.out.print("Si desea continuar ingrese 1: ");
                selectop = entrada.nextInt();
                if (selectop != 1) {
                    select = -999;
                }
            }

            switch (select) {
                case 1 -> root = fun.cargarAMano(arbolAVL, root);
                case 2 -> {
                    System.out.println("Árbol AVL con ramas:");
                    arbolAVL.imprimirArbolConRamas(root, "", false);
                }
                case 3 -> root = fun.precargaAVL1(arbolAVL, null);
                case 4 -> root = fun.precargaAVL2(arbolAVL, null);
                case -999 -> System.out.println("Operación cancelada con éxito");
                case 5 -> {
                    System.out.print("Ingrese valor a eliminar: ");
                    int valor = entrada.nextInt();
                    root = arbolAVL.delete(root, valor);
                }
                case 6 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (select != 0);
    }
}
