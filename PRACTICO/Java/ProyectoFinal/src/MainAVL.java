import Utilitis.AVL.ArbolAVL;
import Utilitis.AVL.Funcion;
import Utilitis.AVL.Node;

import java.util.Scanner;

public class MainAVL {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        Node<Integer> root = null;
        @SuppressWarnings("rawtypes")
        ArbolAVL arbolAVL = new ArbolAVL();
        Scanner entrada = new Scanner(System.in);
        Funcion fun = new Funcion();

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
                    6. Salir del programa""");
            System.out.print("\nOpción: ");
            select = entrada.nextInt();

            // Confirmación adicional---------------------------------------------------
            if (select == 3 || select == 4) {
                System.out.println("Esta opción reiniciará el árbol.");
                System.out.println("Si desea continuar ingrese 1");
                selectop = entrada.nextInt();
                if (selectop != 1) {
                    select = -999;
                }
            }
            // ------------------------------------------------------------------------

            switch (select) {
                case 1:
                    root = fun.cargarAMano(arbolAVL, root);
                    break;
                case 2:
                    System.out.println("Árbol AVL con ramas:"); // Imprime con ramitas "┌───" y "└───"
                    arbolAVL.imprimirArbolConRamas(root, "", false);
                    break;
                case 3:
                    root = null;
                    root = fun.precargaAVL1(arbolAVL, root);
                    break;
                case 4:
                    root = null;
                    root = fun.precargaAVL2(arbolAVL, root);
                    break;
                case -999:
                    System.out.println("Operación cancelada con éxito");
                    break;
                case 5:
                    System.out.println("Ingrese valor a eliminar:");
                    System.out.print("Valor= ");
                    selectop = entrada.nextInt();
                    root = arbolAVL.delete(root, selectop);
                    break;
                default:
                    break;
            }
        } while (select != 6);
        entrada.close();
    }
}
