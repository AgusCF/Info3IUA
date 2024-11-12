package Menu;

import java.util.Scanner;

import Utilitis.PilaYCola.PilaYColaArray.*;;

public class MenuPilaYColaArray {
    public void mostrarMenu() {
        menuColaYPila newMenuPilaYCola = new menuColaYPila();
        Scanner entrada = new Scanner(System.in);
        int op = 0;
        do {
            System.out.println();
            System.out.println("""
                    ##### Menú Pila Y Cola (Array) #####
                    1. Menu de Cola
                    2. Menu de Pila
                    0. Salir del menu pila y cola""");
            System.out.print("\nOpción: ");
            op = entrada.nextInt();
            switch (op) {
                case 1:
                    newMenuPilaYCola.menuCola();
                    break;
                case 2:
                    newMenuPilaYCola.menuPila();
                    break;

                default:
                    break;
            }

        } while (op != 0);
    }

}
