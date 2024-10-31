import java.util.Scanner;
import Menu.*;

public class main {
    public static void main(String[] args) {
        MenuRecursiva menuRecursiva = new MenuRecursiva();
        MenuAVL menuAVL = new MenuAVL();
        MenuRaB menuRaB = new MenuRaB();
        MenuMonticulo menuMonticulo = new MenuMonticulo();
        Scanner entrada = new Scanner(System.in);
        int select = 0;

        do {
            System.out.println();
            System.out.println("""
                        ##### Menú #####
                    1. Menú Recursividad
                    2. Menú Árbol AVL
                    3. Menú Árbol Rojo y Negro
                    4. Montículo Binario
                    5. ....
                    6. ......
                    0. Salir del programa""");
            System.out.print("\nOpción: ");

            try {
                select = entrada.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Por favor, ingresa un número válido.");
                entrada.next(); // Limpia la entrada no válida del scanner
                continue; // Regresa al inicio del ciclo para solicitar la opción nuevamente
            }

            switch (select) {
                case 1:
                    menuRecursiva.mostrarMenu();
                    break;
                case 2:
                    menuAVL.mostrarMenu();
                    break;
                case 3:
                    menuRaB.mostrarMenu();
                    break;
                case 4:
                    menuMonticulo.mostrarMenu();
                    break;
                case 5:
                    System.out.println("Funcionalidad no implementada.");
                    break;
                case 6:
                    System.out.println("Funcionalidad no implementada.");
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida, elija otra opción.");
                    break;
            }
        } while (select != 0);

        entrada.close();
    }
}
