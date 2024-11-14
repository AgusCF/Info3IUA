package Menu;

import java.util.Scanner;
import Utilitis.RaB.ArbolRyB;

public class MenuRaB {

    public void mostrarMenu() {
        ArbolRyB<Integer> arbolRyB = new ArbolRyB<>(); // Asumiendo que el árbol es de enteros
        Scanner entrada = new Scanner(System.in);
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
                    0. Salir del programa""");
            System.out.print("\nOpción: ");

            // Verificar entrada válida para select
            while (!entrada.hasNextInt()) {
                System.out.println("Por favor, introduce un número válido.");
                entrada.next(); // Limpiar la entrada no válida
                System.out.print("Opción: ");
            }
            select = entrada.nextInt();

            switch (select) {
                case 1 -> {
                    System.out.print("\nIngresa el dato a insertar: ");
                    while (!entrada.hasNextInt()) {
                        System.out.println("Por favor, introduce un número válido.");
                        entrada.next();
                    }
                    int op = entrada.nextInt();
                    arbolRyB.insertar(op);
                }
                case 2 -> {//Mostrar en orden
                    System.out.println("Árbol Rojo y Negro:");
                    arbolRyB.imprimirArbolConRamas();
                }
                case 3 -> {
                    System.out.print("\nEl valor mínimo es: ");
                    if (arbolRyB.devolverElMin() != null) {
                        System.out.println(arbolRyB.devolverElMin().getElemento());
                    } else {
                        System.out.println("El árbol está vacío.");
                    }
                }
                case 4 -> {
                    System.out.print("\nEl valor máximo es: ");
                    if (arbolRyB.devolverElMax() != null) {
                        System.out.println(arbolRyB.devolverElMax().getElemento());
                    } else {
                        System.out.println("El árbol está vacío.");
                    }
                }
                case 5 -> {
                    System.out.print("\nEl valor a eliminar es: ");
                    while (!entrada.hasNextInt()) {
                        System.out.println("Por favor, introduce un número válido.");
                        entrada.next();
                    }
                    int op = entrada.nextInt();
                    arbolRyB.eliminar(op);
                }
                case 6 -> {
                    arbolRyB.eliminarTodoElArbol();
                    System.out.println("Se eliminó el árbol");
                }
                case 7 -> System.out.println("Saliendo del menú Árbol Rojo y Negro");
                default -> System.out.println("Opción inválida, elija otra opción");
            }
        } while (select != 0);
    }
}
