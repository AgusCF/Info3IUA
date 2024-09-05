package mains;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import utilitis.Ordenamiento.Incercion;
import utilitis.Ordenamiento.MenuRes;
import utilitis.Ordenamiento.Pedido;
import utilitis.Ordenamiento.Shellsort;
import utilitis.PilaYCola.Cola;
import utilitis.PilaYCola.MenuColoYPila;
import utilitis.PilaYCola.Pila;

public class Proyecto_3_PilaYCola {
    public static void main(String[] args) throws Exception {
        // Crea instancias de las clases que manejarán las funcionalidades del menú
        MenuRes menu = new MenuRes();
        MenuColoYPila menuColYPi = new MenuColoYPila(); // Menú para Pila y Cola
        Pila pila=new Pila();
        Cola cola= new Cola();

        // Scanner para recibir la entrada del usuario
        Scanner entrada = new Scanner(System.in);

        // Variable que almacena la elección del usuario en el menú principal
        int eleccion = 0;

        // Bucle do-while que se ejecuta hasta que el usuario seleccione salir
        do {
            // Mostrar el menú principal
            System.out.println("Menu Principal");
            System.out.println("""
                        *** Seleccione que desea utilizar ***
                    1. Pila
                    2. Cola
                    9. Salir"""); // Opción 9 es la salida
            System.out.print("Eleccion: ");

            // Capturar la elección del usuario
            eleccion = entrada.nextInt();

            // Realizar acción basada en la elección
            switch (eleccion) {
                case 1:
                    // Si elige 1, mostrar el menú relacionado con la Pila
                    menuColYPi.menuPila();
                    break;
                case 2:
                    // Si elige 2, mostrar el menú relacionado con la Cola
                    menuColYPi.menuCola();
                    break;
                case 9:
                    // Si elige 9, el programa termina, no hace falta ningún código aquí
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    // Si elige una opción no válida, se notifica al usuario
                    System.out.println("La opción ingresada no corresponde a ninguna operación");
                    break;
            }

            // Continuar mostrando el menú mientras no seleccione salir (opción 9)
        } while (eleccion != 9);

        // Cerrar el Scanner para liberar los recursos
        entrada.close();
    }
}
