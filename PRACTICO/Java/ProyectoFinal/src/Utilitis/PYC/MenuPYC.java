package Utilitis.PYC;
import java.util.Scanner;
public class MenuPYC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1; // Inicializa con un valor por defecto
        Pila<Integer> pila = new Pila<>(5);
        Cola<Integer> cola = new Cola<>(5);
        int elemento;
        do {
            System.out.println("""
                    ##### Menú de Ordenamiento #####
                    ----------PILA----------
                    1.  Push
                    2.  Pop
                    3.  Top
                    ----------Exprecion Matematica----------
                    4.  Expresiones Matemáticas
                    ----------Comprobación de Palíndromos----------
                    5.  Comprobación de Palíndromos
                    ----------COLA----------
                    6. Enque
                    7. Deque
                    8. Top
                    ----------Ordenar COLA----------
                    9. Ordenar cola
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
            cola.enqueue(3);
            cola.enqueue(1);
            cola.enqueue(4);
            cola.enqueue(2);
            switch (opcion) {
                case 1:
                    System.out.print("\nIngresa el elemento a insertar: ");
                    elemento = scanner.nextInt();
                    pila.push(elemento);
                    break;
                case 2:
                    pila.pop();
                    break;
                case 3:
                    System.out.println("Elemento en la cima: " + pila.top());
                    break;
                case 4:
                    System.out.println("Prueba de estaEquilibrada:");
                    String expresion1 = "(a + b) * (c - d)";
                    String expresion2 = "(a + b * (c - d))";
                    String expresion3 = "(a + b) * (c - d))";
                    System.out.println("¿Está equilibrada la expresión '" + expresion1 + "'? " + FuncionesPila.estaEquilibrada(expresion1)); // true
                    System.out.println("¿Está equilibrada la expresión '" + expresion2 + "'? " + FuncionesPila.estaEquilibrada(expresion2)); // true
                    System.out.println("¿Está equilibrada la expresión '" + expresion3 + "'? " + FuncionesPila.estaEquilibrada(expresion3)); // false
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Prueba de esPalindromo:");
                    String cadena1 = "A man a plan a canal Panama";
                    String cadena2 = "hello";
                    System.out.println("¿Es '" + cadena1 + "' un palíndromo? " + FuncionesPila.esPalindromo(cadena1));
                    System.out.println("¿Es '" + cadena2 + "' un palíndromo? " + FuncionesPila.esPalindromo(cadena2));
                    break;
                case 6:
                    System.out.print("\nIngresa el elemento a insertar: ");
                    elemento = scanner.nextInt();
                    cola.enqueue(elemento);
                    break;
                case 7:
                    cola.dequeue();
                    break;
                case 8:
                    System.out.println("Elemento en la cima: " + cola.top());
                    break;
                case 9:
                        FuncionesPila.ordenarColaAscendente(cola);
                        
                        System.out.println("\nCola ordenada:");
                        while (!cola.isEmpty()) {
                            System.out.print(cola.dequeue() + " ");
                        }
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

        scanner.close();
    }

}
