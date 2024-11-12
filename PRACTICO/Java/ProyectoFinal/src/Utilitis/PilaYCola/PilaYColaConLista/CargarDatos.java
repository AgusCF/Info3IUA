package Utilitis.PilaYCola.PilaYColaConLista;

import java.util.Scanner;
import utilitis.Ordenamiento.Pedido;

public class CargarDatos {
    Scanner entrada = new Scanner(System.in);
    private int idSum = 1;

    public void cargarDatos(Node newPedido) {
        System.out.println("Ingresa los datos a continuacion:");
        System.out.print("\nCliente (Nombre): ");
        if (idSum != 1) {
            entrada.nextLine();
        }
        newPedido.setData(entrada.nextLine());

    }
}
