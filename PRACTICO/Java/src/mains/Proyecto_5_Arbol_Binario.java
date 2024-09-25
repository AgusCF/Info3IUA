package mains;

import java.util.Scanner;
import utilitis.ArbolBinario.BinNode;
import utilitis.ArbolBinario.FuncinesDelArbol;

public class Proyecto_5_Arbol_Binario {
    public static void main(String[] args) throws Exception {

        BinNode<Integer> root = null; // Root debe inicializarse como null
        FuncinesDelArbol arbol = new FuncinesDelArbol();
        Scanner entrada = new Scanner(System.in);

        // Variable que almacena la elección del usuario en el menú principal
        int eleccion = 0;

        // Bucle do-while que se ejecuta hasta que el usuario seleccione salir
        do {
            // Mostrar el menú principal
            System.out.println("Menu Principal");
            System.out.println("""
                        *** Seleccione que desea utilizar ***
                    1. Ingresar un nuevo dato
                    2. Ingresar 100 datos random.
                    3. Mostrar todos los datos en orden
                    4. Eliminar todo el arbol.
                    5. Salir""");
            System.out.print("Eleccion: ");

            // Capturar la elección del usuario
            eleccion = entrada.nextInt();

            // Realizar acción basada en la elección
            switch (eleccion) {
                case 1:
                    System.out.print("\nIngresa el dato: ");
                    int dato = entrada.nextInt(); // Lee el dato sin genéricos
                    root = arbol.insert(root, dato); // Insertar el dato en el árbol
                    break;
                case 2:
                    root = arbol.insert100(root);
                    break;
                case 3:
                    System.out.println("Datos en orden:");
                    arbol.recorrerEnOrden(root); // Llama al método para imprimir en orden
                    break;
                case 4:
                    root = null; // Eliminar el árbol asignando root a null
                    System.out.println("El árbol ha sido eliminado.");
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    // Si elige una opción no válida, se notifica al usuario
                    System.out.println("La opción ingresada no corresponde a ninguna operación");
                    break;
            }

        } while (eleccion != 5); // Salir cuando se elige la opción 4

        // Cerrar el Scanner para liberar los recursos
        entrada.close();
    }
}
