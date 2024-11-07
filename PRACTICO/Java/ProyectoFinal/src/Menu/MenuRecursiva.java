package Menu;

import java.util.Scanner;

import Utilitis.Recursivas.Recursiva;

public class MenuRecursiva {

    public void mostrarMenu() {
        Recursiva recursiva = new Recursiva();
        Scanner scanner = new Scanner(System.in);
        int opcion = -1; // Inicializa con un valor por defecto

        do {
            System.out.println("""
                    ##### Menú de Recursividad #####
                    1. Calcular Factorial
                    2. Sumar Enteros
                    3. Potencia
                    4. Conteo Regresivo
                    5. Producto
                    6. Imprimir Arreglo Inverso
                    7. Contar Unos en Binario
                    0. Salir
                    """);
            System.out.print("Selecciona una opción: ");

            try {
                opcion = scanner.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Por favor, ingresa un número válido.");
                scanner.next(); // Limpia la entrada no válida
                continue; // Regresa al inicio del ciclo para solicitar la opción nuevamente
            }

            switch (opcion) {
                case 1:
                    System.out.print("Introduce un número para calcular el factorial: ");
                    int nFactorial = scanner.nextInt();
                    System.out.println("El factorial de " + nFactorial + " es: " + recursiva.factorial(nFactorial));
                    break;

                case 2:
                    System.out.print("Introduce un número para sumar todos los enteros hasta él: ");
                    int nSuma = scanner.nextInt();
                    System.out.println("La suma de enteros hasta " + nSuma + " es: " + recursiva.sumaEnteros(nSuma));
                    break;

                case 3:
                    System.out.print("Introduce la base: ");
                    int base = scanner.nextInt();
                    System.out.print("Introduce el exponente: ");
                    int exponente = scanner.nextInt();
                    System.out
                            .println(base + " elevado a " + exponente + " es: " + recursiva.potencia(base, exponente));
                    break;

                case 4:
                    System.out.print("Introduce un número para realizar el conteo regresivo: ");
                    int nConteo = scanner.nextInt();
                    System.out.println("Conteo regresivo: ");
                    recursiva.conteoRegresivo(nConteo);
                    System.out.println(); // Para nueva línea después del conteo
                    break;

                case 5:
                    System.out.print("Introduce el primer número: ");
                    int a = scanner.nextInt();
                    System.out.print("Introduce el segundo número: ");
                    int b = scanner.nextInt();
                    System.out.println("El producto de " + a + " y " + b + " es: " + recursiva.producto(a, b));
                    break;

                case 6:
                    System.out.print("Introduce el tamaño del arreglo: ");
                    int size = scanner.nextInt();
                    int[] arr = new int[size];
                    for (int i = 0; i < size; i++) {
                        System.out.print("Introduce el elemento " + (i + 1) + ": ");
                        arr[i] = scanner.nextInt();
                    }
                    System.out.println("Arreglo en orden inverso: ");
                    recursiva.imprimirInverso(arr, size - 1);
                    System.out.println(); // Para nueva línea después de imprimir
                    break;

                case 7:
                    System.out.print("Introduce un número para contar los unos en su representación binaria: ");
                    int nBinario = scanner.nextInt();
                    System.out.println("El número de unos en la representación binaria de " + nBinario + " es: "
                            + recursiva.contarUnosBinarios(nBinario));
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
            System.out.println(); // Para un espacio entre las opciones
        } while (opcion != 0);

        // No cerramos el scanner aquí
    }
}
