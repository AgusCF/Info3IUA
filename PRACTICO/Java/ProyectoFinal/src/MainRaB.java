import java.util.Scanner;
import Utilitis.RaB.ArbolRyB;

public class MainRaB {

    public static void main(String[] args) throws Exception {
        ArbolRyB arbolRyB = new ArbolRyB<>();
        Scanner entrada = new Scanner(System.in); // Corrección: "entrda" a "entrada"
        int select = 0;
        do {
            System.out.println();
            System.out.println("""
                        ##### Menú Árbol Rojo y Negro #####
                    1. Insertar elementos
                    2. Mostrar en orden
                    3. Mostrar el mínimo
                    4. Mostrar el máximo
                    5. Eliminar un número
                    6. Eliminar todo el Árbol
                    7. Salir del programa""");
            System.out.print("\nOpción: ");
            select = entrada.nextInt();

            switch (select) {
                case 1:
                    System.out.print("\nIngresa el dato a insertar: ");
                    int op = 0;
                    op = entrada.nextInt();
                    arbolRyB.insertar(op);
                    break;
                case 2:
                    System.out.println("Árbol Rojo y Negro:");
                    arbolRyB.imprimirArbolConRamas();
                    break;
                case 3:
                    System.out.print("\nEl valor mínimo es: ");
                    System.out.print(arbolRyB.devolverElMin().getElemento());
                    System.out.println();
                    break;
                case 4:
                    System.out.print("\nEl valor máximo es: ");
                    System.out.print(arbolRyB.devolverElMax().getElemento());
                    System.out.println();
                    break;
                case 5:
                    System.out.print("\nEl valor a eliminar es: ");
                    op = entrada.nextInt();
                    arbolRyB.eliminar(op);
                    break;
                case 6:
                    arbolRyB.eliminarTodoElArbol();
                    System.out.println("Se eliminó el árbol");
                    break;
                default:
                    System.out.println("Opción inválida, elija otra opción");
                    break;
            }
        } while (select != 7);
        System.out.println("Saliendo del menú Árbol Rojo y Negro");
        entrada.close(); // Corrección: "entrda" a "entrada"
    }
}
