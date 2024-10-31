package Menu;

import Utilitis.MonticuloBin;
import java.util.Scanner;
import java.util.Random;

public class MenuMonticulo {

    public void mostrarMenu() { // Menú para el Montículo Binario
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        int op;
        int num;
        int tam;

        System.out.println("Ingrese la capacidad del Montículo:");
        System.out.print("Tamaño: ");
        tam = entrada.nextInt();
        if (tam <= 0) {
            System.out.println("La capacidad del montículo debe ser mayor que cero.");
            return;
        }
        MonticuloBin<Integer> monticulo = new MonticuloBin<>(tam);

        do {
            System.out.println();
            System.out.println("""
                    ##### Menú #####
                    1. Cargar montículo a mano
                    2. Cargar montículo con un número aleatorio
                    3. Imprimir montículo como árbol
                    4. Imprimir montículo como arreglo
                    5. Eliminar un mínimo del montículo
                    6. Ver el mínimo
                    7. Cargar todo el montículo de manera automática y aleatoria
                    0. Salir del programa""");
            System.out.print("\nOpción: ");
            op = entrada.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Ingrese valor: ");
                    num = entrada.nextInt();
                    monticulo.insert(num);
                    break;

                case 2:
                    num = random.nextInt(100);
                    monticulo.insert(num);
                    break;

                case 3:
                    System.out.println("Montículo impreso como árbol:");
                    monticulo.imprimirMonticuloConRamas(0, "", false);
                    break;

                case 4:
                    System.out.println("\nMontículo impreso como arreglo:");
                    monticulo.imprimirComoArreglo();
                    break;

                case 5:
                    System.out.println("\nEliminando el valor mínimo del montículo (raíz):");
                    monticulo.remove();
                    break;

                case 6:
                    System.out.println("Mínimo del montículo: " + monticulo.peek());
                    break;

                case 7:
                    System.out.println("Cargando el montículo de manera automática y aleatoria:");
                    for (int i = 0; i < tam; i++) {
                        num = random.nextInt(100);
                        monticulo.insert(num);
                        if (monticulo.isFull()) {
                            break;
                        }
                    }
                    break;

                case 8:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("La opción ingresada no existe, por favor intente de nuevo.");
                    break;
            }
        } while (op != 0);
    }
}
