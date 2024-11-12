package utilitis.PilaYColaConLista;
import java.util.Scanner;
import utilitis.Ordenamiento.Pedido;
public class menuImplementacionListas {
    Pedido pedidos= new Pedido();
    ColaLista cola = new ColaLista();
    PilaLista pila = new PilaLista();

    Scanner entrada = new Scanner(System.in);
    int selecion;
    public void menuCola() {
        System.out.println("******** Cola implementada con lista ********");
        do {
            // Menú de opciones para la Cola
            System.out.println("******** MENU ********");
            System.out.println("""
                    1-Agregar un pedido a la Cola:
                    2-Remover el pedido al frente de la Cola.
                    3-Ver el pedido al frente de la Cola sin removerlo.
                    4-Exit.""");
            System.out.print("\nEleccion: ");
            // Leer la opción seleccionada por el usuario
            selecion = entrada.nextInt();
            // Seleccionamos la acción a realizar según la elección
            switch (selecion) {
                case 1:
                    cola.enqueue();
                    break;
                case 2:
                    pila.push(cola.dequeue());
                    break;
                case 3:
                    System.out.println(cola.getFont());
                    break;
                case 4:
                    break;
                default:
                    System.out.println("La opcion ingresada es no corresponde a ninguna operacion");
                    break;
            }
            // El ciclo se repite hasta que el usuario elija salir (opción 4)
        } while (selecion != 4);
    }
}
