package utilitis.PilaYCola;

import java.util.Scanner;

public class MenuColoYPila {
    Scanner entrada = new Scanner(System.in);
    Cola cola = new Cola();
    int selecion = 0;

    public void menuCola() {
        do {
            System.out.println("******** MENU ********");
            System.out.println("""
                    1-Agregar un pedido a la Cola:
                    2-Remover el pedido al frente de la Cola.
                    3-Ver el pedido al frente de la Cola sin removerlo.
                    4-Exit.""");
            System.out.print("\nEleccion: ");
            selecion = entrada.nextInt();
            switch (selecion) {
                case 1:
                    cola.enqueue();
                    break;
                case 2:
                    cola.dequeue();
                    break;
                case 3:
                    cola.top();
                    break;
                default:
                    break;
            }

        } while (selecion != 4);

    }

    public void menuPila() {
        do {
            System.out.println("******** MENU ********");
            System.out.println("""
                    1-Agregar un pedido a la Pila:
                    2-Remover el último pedido de la Pila.
                    3-Ver el último pedido completado sin removerlo.
                    4-Exit.""");
            System.out.print("\nEleccion: ");
            selecion = entrada.nextInt();
            switch (selecion) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:
                    cola.top();
                    break;
                default:
                    break;
            }
        } while (selecion != 4);

    }
}
