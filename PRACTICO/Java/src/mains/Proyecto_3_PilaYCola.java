package mains;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import utilitis.Ordenamiento.CargDeFun;
import utilitis.Ordenamiento.Incercion;
import utilitis.Ordenamiento.MenuRes;
import utilitis.Ordenamiento.Pedido;
import utilitis.Ordenamiento.Shellsort;
import utilitis.PilaYCola.MenuColoYPila;

public class Proyecto_3_PilaYCola {
    public static void main(String[] args) throws Exception {
        MenuRes menu = new MenuRes();
        CargDeFun funcion = new CargDeFun();
        MenuColoYPila menuColYPi = new MenuColoYPila();

        Scanner entrada = new Scanner(System.in);

        int eleccion = 0;

        do {
            System.out.println("Menu Principal");
            System.out.println("""
                        *** Selecione que desea utilizar ***
                    1. Pila
                    2. Cola
                    9. Salir""");
            System.out.print("Eleccion: ");
            eleccion = entrada.nextInt();

            switch (eleccion) {
                case 1:
                    menuColYPi.menuPila();
                    break;
                case 2:
                    menuColYPi.menuCola();
                    break;

                default:
                    System.out.println("La opcion ingresada no corresponde a ninguna operacion");
                    break;
            }

        } while (eleccion != 3);
        entrada.close();
    }
}
