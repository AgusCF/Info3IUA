import Utilitis.MonticuloBin;
import Utilitis.Recursiva;

import java.util.Scanner;
import java.util.Random;

public class MainMonticulo {

    public static void main(String[] args) {
        MainMonticulo mainMonticulo = new MainMonticulo();
        mainMonticulo.menu();
    }

    public void menu() { // Montículo Binario
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        int op;
        int num;
        int tam;

        System.out.println("Ingrese la capacidad del Montículo:");
        System.out.print("Tamaño: ");
        tam = entrada.nextInt();
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
                    8. Salir del programa""");
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
        } while (op != 8);

        entrada.close();
    }

    public static void menuRecursividad() { // Menú de Recursividad
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        int op;
        int num;
        int tam;
        Recursiva rec = new Recursiva();

        // Generar un arreglo aleatorio
        tam = random.nextInt(11) + 5;
        int[] arreglo = new int[tam];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = random.nextInt(201) - 100;
        }

        do {
            System.out.println();
            System.out.println("""
                    ##### Menú de Recursividad #####
                    1. Factorial.
                    2. Suma de los primeros n enteros.
                    3. Potencia de un número.
                    4. Conteo regresivo.
                    5. Producto de dos números.
                    6. Arreglo en orden inverso.
                    7. Número de unos en representación binaria.
                    8. Salir del programa""");

            System.out.print("\nOpción: ");
            op = entrada.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Ingrese valor para calcular el factorial: ");
                    num = entrada.nextInt();
                    System.out.println("El factorial de " + num + " es " + rec.factorial(num));
                    break;

                case 2:
                    System.out.print("Ingrese valor para calcular la suma: ");
                    num = entrada.nextInt();
                    System.out.println("La suma de los primeros " + num + " enteros es " + rec.sumaEnteros(num));
                    break;

                case 3:
                    System.out.print("Ingrese la base para la potencia: ");
                    int base = entrada.nextInt();
                    System.out.print("Ingrese el exponente: ");
                    int exponente = entrada.nextInt();
                    System.out.println(
                            "La potencia de " + base + "^" + exponente + " es " + rec.potencia(base, exponente));
                    break;

                case 4:
                    System.out.print("Ingrese valor para hacer el conteo regresivo: ");
                    num = entrada.nextInt();
                    System.out.println("El conteo regresivo es:");
                    rec.conteoRegresivo(num);
                    break;

                case 5:
                    System.out.print("Ingrese el primer valor: ");
                    num = entrada.nextInt();
                    System.out.print("Ingrese el segundo valor: ");
                    int segundoValor = entrada.nextInt();
                    System.out.println("El producto entre " + num + " y " + segundoValor + " es "
                            + rec.producto(num, segundoValor));
                    break;

                case 6:
                    System.out.println("El arreglo en orden inverso es:");
                    rec.imprimirInverso(arreglo, arreglo.length - 1);
                    break;

                case 7:
                    System.out.print("Ingrese valor para contar los unos en su representación binaria: ");
                    num = entrada.nextInt();
                    System.out.println("El número de unos en la representación binaria de " + num + " es "
                            + rec.contarUnosBinarios(num));
                    break;

                case 8:
                    System.out.println("Saliendo del menú de recursividad...");
                    break;

                default:
                    System.out.println("La opción ingresada no existe, por favor intente de nuevo.");
                    break;
            }
        } while (op != 8);

        entrada.close();
    }
}
